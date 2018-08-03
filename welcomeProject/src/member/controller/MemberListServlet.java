package member.controller;

import java.io.IOException;
import java.util.ArrayList;

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
 * Servlet implementation class MemberListServlet
 */
@WebServlet("/mlist")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 관리자용으로 회원 전체 정보 조회 출력 처리용 컨트롤러
		// 회원의 수는 실시간으로 유동적이므로 컬렉션을 이용
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ArrayList<Member> list = null;
		RequestDispatcher view = null;
		try{
			list = new MemberService().selectList();
			
			if(list.size() > 0){
				request.setAttribute("list", list);
				view = request.getRequestDispatcher("views/member/memberListView.jsp");
				view.forward(request, response);
			}
			else{
				request.setAttribute("message", "유저 정보가 없습니다.");
				view = request.getRequestDispatcher("views/member/memberError.jsp");
				view.forward(request, response);
			}
			
		}catch(MemberException e){
			request.setAttribute("message", e.getMessage());
			view = request.getRequestDispatcher("views/member/memberError.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
