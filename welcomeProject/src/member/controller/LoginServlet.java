package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.exception.MemberException;
import member.model.service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트가 보낸 값 추출하고
		String userId = request.getParameter("userid");
		String userPwd = request.getParameter("userpwd");
		
		
		try{
			// 모델쪽으로 보내서, 비즈니스 로직 처리하고
			String userName = new MemberService().loginCheck(userId, userPwd);
			// 그 결과를 리턴받아, 결과에 따라 뷰를 선택해서
			// 내보내는 작업
			if (userName != null) {
				// 로그인 성공시, 로그인 상태관리를 위해
				//섹션 객체를 만듦
				HttpSession session = request.getSession();
				//자동 로그아웃 시간 설정
				//session.setMaxInactiveInterval(10 * 60);
				//10분동안 서비스 없으면 자동 로그아웃
				
				
				System.out.println("session id : " + session.getId());
				session.setAttribute("userName", userName);
				session.setAttribute("userId", userId);
				response.sendRedirect("index.jsp");
				
			} else {
				// 로그인 실패시 뷰 파일만 내보냄
				//response.sendRedirect("views/member/memberError.jsp");
				
				//로그인 실패시 에러메세지도 함께 뷰 파일과 내보냄
				RequestDispatcher view = request.getRequestDispatcher("views/member/memberError.jsp");
				request.setAttribute("message", "아이디나 암호를 다시 확인하세요.");
				view.forward(request, response);
			}
		}catch(MemberException e){
			RequestDispatcher errorPage = request.getRequestDispatcher("views/member/memberError.jsp");
			request.setAttribute("message", e.getMessage());
			errorPage.forward(request, response);
		}
	}

}
