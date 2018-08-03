package notice.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.exception.NoticeException;
import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeListServlet
 */
@WebServlet("/nlist")
public class NoticeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ArrayList<Notice> list = null;
		RequestDispatcher view = null;
		try{
			list = new NoticeService().selectList();
			System.out.println("성공");
			if(list.size() > 0){
				request.setAttribute("list", list);
				view = request.getRequestDispatcher("views/notice/noticeListView.jsp");
				view.forward(request, response);
			}
			else{
				request.setAttribute("message", "공지 게시글이 없습니다.");
				view = request.getRequestDispatcher("views/notice/noticeError.jsp");
				view.forward(request, response);
			}
		}catch(NoticeException e){
			System.out.println("실패");
			request.setAttribute("message", e.getMessage());
			view = request.getRequestDispatcher("views/notice/noticeError.jsp");
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
