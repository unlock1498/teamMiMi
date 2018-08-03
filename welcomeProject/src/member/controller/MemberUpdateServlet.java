package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.exception.MemberException;
import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/mupdate")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 전송온 값에 한글이 있을 경우, 인코딩 처리함
		request.setCharacterEncoding("utf-8");
		//2. 전송온 값을 꺼내서 변수 도는 객체에 저장하기
		Member member = new Member();
		String userId = request.getParameter("userid");
		member.setUserId(userId);
		member.setUserPwd(request.getParameter("userpwd"));
		member.setAge(Integer.parseInt(request.getParameter("age")));
		member.setEmail(request.getParameter("email"));
		member.setPhone(request.getParameter("phone"));
		member.setHobby(String.join(",", request.getParameterValues("hobby")));
		member.setEtc(request.getParameter("etc"));
		int result = 0;
		
		try{
			result = new MemberService().updateMember(member);
			if(result >0){
				response.sendRedirect("/hello/myinfo?userid=" + userId);
			}
		}catch(MemberException e){
			RequestDispatcher errorPage = request.getRequestDispatcher("views/member/memberError.jsp");
			request.setAttribute("message", e.getMessage());
			errorPage.forward(request, response);
		}
		
	}

}
