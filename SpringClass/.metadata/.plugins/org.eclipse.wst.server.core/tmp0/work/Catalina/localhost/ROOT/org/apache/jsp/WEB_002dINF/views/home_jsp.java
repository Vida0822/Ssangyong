/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-07-03 03:50:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar", Long.valueOf(1687152304634L));
    _jspx_dependants.put("jar:file:/D:/Class/WorkSpace/SpringClass/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SL03_REPLY3_BOARD/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1532606274000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1687143252236L));
    _jspx_dependants.put("jar:file:/D:/Class/WorkSpace/SpringClass/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SL03_REPLY3_BOARD/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<title>Home</title>\n");
      out.write("	<link rel=\"stylesheet\" href=\"/resources/cdn-main/example.css\">\n");
      out.write("	<script src=\"/resources/cdn-main/example.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"\" style=\"height: fit-content;\">\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <h1><a href=\"/\">♈ K2Nik BOARD</a></h1>\n");
      out.write("    <ul>  \n");
      out.write("        <li><a href=\"/member/login\">로그인</a></li> \n");
      out.write("        <li><a href=\"/member/logout\">로그아웃</a></li> \n");
      out.write("        <li><a href=\"/member/register\">회원가입</a></li> \n");
      out.write("        <li><a href=\"/board/list?pageNum=1&amount=5\">BOard</a></li> \n");
      out.write("    </ul> \n");
      out.write("</header>\n");
      out.write(" \n");
      out.write("<P>  The time on the server is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serverTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(". </P>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("  <h3><span class=\"material-symbols-outlined\" style=\"vertical-align: sub\">home</span>BOARD 검색</h3>\n");
      out.write("  <ol>\n");
      out.write("    <li>MyBatis의 동적SQL</li>\n");
      out.write("    <li>if choose(when, otherwise) trim(where, set) foreach</li>\n");
      out.write("    <li>title like '%' || { keyword } || '%'</li>    \n");
      out.write("    <li>Criteria 수정</li>    \n");
      out.write("  </ol>\n");
      out.write("  <pre class=\"code\"> \n");
      out.write("  </pre>\n");
      out.write("  <pre class=\"code\"> \n");
      out.write("      CREATE TABLE tbl_board\n");
      out.write("	 (\n");
      out.write("	   bno number(10)\n");
      out.write("	   , title varchar2(200) not null\n");
      out.write("	   , content varchar2(2000) not null\n");
      out.write("	   , writer varchar2(50) not null\n");
      out.write("	   , regdate date default sysdate\n");
      out.write("	   , updatedate date default sysdate\n");
      out.write("	 );\n");
      out.write("	 \n");
      out.write("	 alter table tbl_board add constraint pk_tblboard_bno primary key(bno);\n");
      out.write("	 \n");
      out.write("	  CREATE SEQUENCE seq_board;\n");
      out.write("  </pre>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
