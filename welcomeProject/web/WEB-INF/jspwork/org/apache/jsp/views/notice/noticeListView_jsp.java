/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-07-27 10:04:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import notice.model.vo.Notice;

public final class noticeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/notice/../../adminHeader.jsp", Long.valueOf(1532595444138L));
    _jspx_dependants.put("/views/notice/../../header.jsp", Long.valueOf(1532588254852L));
    _jspx_dependants.put("/views/notice/../../footer.jsp", Long.valueOf(1532509105278L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
 
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	String userId = (String)session.getAttribute("userId");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
if(userId != null && userId.equals("admin")){ 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	//jsp 파일 안에는 request, session 객체도 내장되어 있다
	String userName = (String)session.getAttribute("userName");
	String userid = (String)session.getAttribute("userId");

      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#menubar ul li{\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\twidth: 120px;\r\n");
      out.write("\t\theight:35px;\r\n");
      out.write("\t\tdisplay: inline;\r\n");
      out.write("\t\tbackground: orange;\r\n");
      out.write("\t}\r\n");
      out.write("\t#menubar #loginForm{\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\theader{\r\n");
      out.write("\t\tbackground:LightSkyBlue;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("\t<nav id=\"menubar\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"/hello/index.jsp\">home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/hello/mlist\">회원관리</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/hello/nlist\">공지관리</a></li>\r\n");
      out.write("\t\t\t<li><a>게시글관리</a></li>\r\n");
      out.write("\t\t\t<li><a>사진게시판관리</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div id=\"loginForm\">\r\n");
      out.write("\t");
if(userName == null){ 
      out.write("\r\n");
      out.write("\t\t<form action=\"/hello/Login\" method=\"post\">\r\n");
      out.write("\t\t\t<table width = \"250\" height = \"75\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width = \"200\">\r\n");
      out.write("\t\t\t\t\t\t<input type = \"text\" name =\"userid\" id=\"userid\" size=\"15\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width = \"200\" rowspan =\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value =\"로그인\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type = \"password\" name = \"userpwd\" size=\"15\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hello/views/member/memberEnroll.html\">회원가입</a> &nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">아이디/암호 조회</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t<table width = \"250\" height = \"75\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width = \"150\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(userName );
      out.write("님\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width = \"100\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hello/logout\">로그아웃</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>메일 개</td>\r\n");
      out.write("\t\t\t\t\t<td>쪽지 개</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hello/myinfo?userid=");
      out.print( userid );
      out.write("\">내 정보보기</a>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
}else{ 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	//jsp 파일 안에는 request, session 객체도 내장되어 있다
	String userName = (String)session.getAttribute("userName");
	String userid = (String)session.getAttribute("userId");

      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#menubar ul li{\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\twidth: 120px;\r\n");
      out.write("\t\theight:35px;\r\n");
      out.write("\t\tdisplay: inline;\r\n");
      out.write("\t\tbackground: orange;\r\n");
      out.write("\t}\r\n");
      out.write("\t#menubar #loginForm{\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\theader{\r\n");
      out.write("\t\tbackground:LightSkyBlue;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<nav id=\"menubar\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"/hello/test\">메뉴1</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/hello/nlist\">공지사항</a></li>\r\n");
      out.write("\t\t\t<li><a>게시판</a></li>\r\n");
      out.write("\t\t\t<li><a>QnA(답글게시판)</a></li>\r\n");
      out.write("\t\t\t<li><a>사진게시판</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div id=\"loginForm\">\r\n");
      out.write("\t");
if(userName == null){ 
      out.write("\r\n");
      out.write("\t\t<form action=\"/hello/Login\" method=\"post\">\r\n");
      out.write("\t\t\t<table width = \"250\" height = \"75\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width = \"200\">\r\n");
      out.write("\t\t\t\t\t\t<input type = \"text\" name =\"userid\" id=\"userid\" size=\"15\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width = \"200\" rowspan =\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value =\"로그인\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type = \"password\" name = \"userpwd\" size=\"15\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hello/views/member/memberEnroll.html\">회원가입</a> &nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">아이디/암호 조회</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t<table width = \"250\" height = \"75\" cellspacing = \"0\" cellpadding = \"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width = \"150\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(userName );
      out.write("님\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width = \"100\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hello/logout\">로그아웃</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>메일 개</td>\r\n");
      out.write("\t\t\t\t\t<td>쪽지 개</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hello/myinfo?userid=");
      out.print( userid );
      out.write("\">내 정보보기</a>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<h2 align=\"center\">공지사항 전체 보기</h2>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
 if(userId != null && userId.equals("admin")){
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<button id=\"writeBtn\" \" onclick=\"moveWritePage();\">공지글 등록</button>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<table align=\"center\" width = \"650\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width = \"50\">번호</th>\r\n");
      out.write("\t\t\t<th width = \"400\">제목</th>\r\n");
      out.write("\t\t\t<th width = \"50\">파일</th>\r\n");
      out.write("\t\t\t<th width = \"150\">날짜</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
for(Notice n : list){
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(n.getNoticeNo());
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"left\"><a href=\"/hello/ndetail?no=");
      out.print(n.getNoticeNo());
      out.write('"');
      out.write('>');
      out.print(n.getNoticeTitle() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
if(n.getOriginalFilepath() != null){
      out.write('○');
}
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(n.getNoticeDate() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
} 
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tfooter{\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t\theight : 70;\r\n");
      out.write("\t\tbackground:gray;\r\n");
      out.write("\t\ttext-shadow:1px 1px 2px black;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t<p>copyright@iei.or.kr 2018.07.24 홍길동</p>\r\n");
      out.write("\ttel : 070-1234-5678, fax : 070-1111-2345\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction moveWritePage(){\r\n");
      out.write("\t\t//글등록 버튼 클릭하면, noticeWriteForm.jsp\r\n");
      out.write("\t\t//파일로 페이지 이동시킴\r\n");
      out.write("\t\tlocation.href = \"/hello/views/notice/noticeWriteForm.jsp\";   \r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}