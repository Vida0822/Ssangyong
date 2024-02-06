/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-06-28 07:34:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.joinus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("	<head>\n");
      out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("		<title>index</title>\n");
      out.write("		<link href=\"join.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("		<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\n");
      out.write("	</head>\n");
      out.write("	<body>\n");
      out.write("		<div id=\"header\">\n");
      out.write("			<div class=\"top-wrapper\">\n");
      out.write("				<h1 id=\"logo\"><a href=\"../index.jsp\"><img src=\"../images/logo.png\" alt=\"뉴렉처\" /></a></h1>\n");
      out.write("				<h2 class=\"hidden\">메인메뉴</h2>\n");
      out.write("				<ul id=\"mainmenu\" class=\"block_hlist\">\n");
      out.write("					<li>\n");
      out.write("						<a href=\"\">학습가이드</a>\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<a href=\"\" >과정선택</a>\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<a href=\"\" >인기과정</a>\n");
      out.write("					</li>\n");
      out.write("				</ul>\n");
      out.write("				<form id=\"searchform\" action=\"\" method=\"get\">\n");
      out.write("					<fieldset>\n");
      out.write("						<legend class=\"hidden\">\n");
      out.write("							과정검색폼\n");
      out.write("						</legend>\n");
      out.write("						<label for=\"query\">과정검색</label>\n");
      out.write("						<input type=\"text\" name=\"query\" />\n");
      out.write("						<input type=\"submit\" class=\"button\" value=\"검색\" />\n");
      out.write("					</fieldset>\n");
      out.write("				</form>\n");
      out.write("				<h3 class=\"hidden\">로그인메뉴</h3>\n");
      out.write("				<ul id=\"loginmenu\" class=\"block_hlist\">\n");
      out.write("					<li>\n");
      out.write("						<a href=\"../index.jsp\">HOME</a>\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<a href=\"../joinus/login.jsp\">로그인</a>\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<a href=\"../joinus/join.jsp\">회원가입</a>\n");
      out.write("					</li>\n");
      out.write("				</ul>\n");
      out.write("				<h3 class=\"hidden\">회원메뉴</h3>\n");
      out.write("				<ul id=\"membermenu\" class=\"clear\">\n");
      out.write("					<li>\n");
      out.write("						<a href=\"\"><img src=\"../images/menuMyPage.png\" alt=\"마이페이지\" /></a>\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<a href=\"../customer/notice.jsp\"><img src=\"../images/menuCustomer.png\" alt=\"고객센터\" /></a>\n");
      out.write("					</li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"visual\" class=\"joinus\">\n");
      out.write("			<div class=\"top-wrapper\">\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"main\">\n");
      out.write("			<div class=\"top-wrapper clear\">\n");
      out.write("				<div id=\"content\">\n");
      out.write("					<form action=\"\" method=\"post\">\n");
      out.write("						<h2>회원가입</h2>\n");
      out.write("						<h3 class=\"hidden\">방문페이지 로그</h3>\n");
      out.write("						<p id=\"breadscrumb\" class=\"block_hlist clear\"><img alt=\"Step1 개인정보 등록\" src=\"images/step2.png\" /></p>\n");
      out.write("						<h3 class=\"hidden\">회원가입 폼</h3>\n");
      out.write("						<div id=\"join-form\" class=\"join-form margin-large\" >						\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									아이디\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">\n");
      out.write("									<input type=\"text\" name=\"id\" />\n");
      out.write("									<input id=\"btnCheckUid\" class=\"button\" type=\"button\" value=\"중복확인\" />\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									비밀번호\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">\n");
      out.write("									<input type=\"password\" name=\"pwd\" />\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									비밀번호 확인\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\" >\n");
      out.write("									<input type=\"password\" name=\"pwd2\" />\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									이름\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">\n");
      out.write("									<input type=\"text\" name=\"name\" />\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									성별\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">\n");
      out.write("									<select name=\"gender\">\n");
      out.write("										<option>남성</option>\n");
      out.write("										<option>여성</option>\n");
      out.write("									</select>\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row birthday\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									생년월일\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">								\n");
      out.write("	                                <span>\n");
      out.write("	                                    <input type=\"text\" id=\"year\" />년\n");
      out.write("	                                    <input type=\"text\" id=\"month\" />월\n");
      out.write("	                                    <input type=\"text\" id=\"day\" />일\n");
      out.write("	                                    <input type=\"hidden\" name=\"birth\" id=\"birth\" />\n");
      out.write("	                                    <script>\n");
      out.write("	                                    // focus( 포커스 얻을 때 ), blur( 포커스 잃을 때 ) 이벤트\n");
      out.write("                                    	$(\"#day\").blur(function (){\n");
      out.write("	                                        var year = $(\"#year\").val();\n");
      out.write("	                                        var month = $(\"#month\").val();\n");
      out.write("	                                        var day = $(\"#day\").val();\n");
      out.write("	                                        // 1990-12-01\n");
      out.write("	                                        var birth =  year +\"-\"+month+\"-\"+day;\n");
      out.write("	                                        $(\"#birth\").val( birth );\n");
      out.write("                                        });\n");
      out.write("	                                    </script>\n");
      out.write("	                                </span>\n");
      out.write("	                                <span class=\"moon\">\n");
      out.write("	                                    <input type=\"radio\" name=\"is_lunar\" value=\"Solar\" id=\"IsSolar\" checked />양력\n");
      out.write("	                                    <input type=\"radio\" name=\"is_lunar\" value=\"Lunar\" id=\"IsLunar\" />음력\n");
      out.write("	                                </span>\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									핸드폰 번호\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">\n");
      out.write("									<input type=\"text\" name=\"cphone\" /><span>[대시(-)를 포함할 것: 예) 010-3456-2934]</span>\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									이메일\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data\">\n");
      out.write("									<input type=\"text\" name=\"email\" />\n");
      out.write("								</dd>\n");
      out.write("							</dl>\n");
      out.write("							<dl class=\"join-form-row\">\n");
      out.write("								<dt class=\"join-form-title\">\n");
      out.write("									취미\n");
      out.write("								</dt>\n");
      out.write("								<dd class=\"join-form-data habit\">\n");
      out.write("									<input type=\"checkbox\" name=\"habit\" id=\"music\" value=\"music\"/><label for=\"music\">음악</label>\n");
      out.write("									<input type=\"checkbox\" name=\"habit\" id=\"movie\" value=\"movie\"/><label for=\"movie\">영화</label>\n");
      out.write("									<input type=\"checkbox\" name=\"habit\" id=\"trip\" value=\"trip\"/><label for=\"trip\">여행</label>\n");
      out.write("								</dd>\n");
      out.write("							</dl>						\n");
      out.write("						</div>\n");
      out.write("					<div id=\"buttonLine\">\n");
      out.write("						<input class=\"btn-okay button\" type=\"submit\" value=\"가입\" />\n");
      out.write("					</div>\n");
      out.write("					<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ _csrf.parameterName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ _csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("					</form>	\n");
      out.write("				</div>\n");
      out.write("				<div id=\"navi\">\n");
      out.write("					<h2>회원가입</h2>\n");
      out.write("					<h3 class=\"hidden\">회원메뉴</h3>\n");
      out.write("					<ul id=\"navi-menu\">\n");
      out.write("						<li>\n");
      out.write("							<a href=\"\">로그인</a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<a href=\"\" class=\"current\">회원가입</a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<a href=\"\">아이디찾기</a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<a href=\"\">비밀번호 재발급</a>\n");
      out.write("						</li>\n");
      out.write("					</ul>\n");
      out.write("                       \n");
      out.write("					<h3 id=\"fav-title\">추천사이트</h3>\n");
      out.write("					<ul class=\"margin-small\">\n");
      out.write("						<li>\n");
      out.write("							<a href=\"http://www.answeris.net\"><img src=\"../images/answeris.png\" alt=\"앤서이즈\" /></a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<a href=\"http://www.microsoft.com\"><img src=\"../images/microsoft.png\" alt=\"마이크로소프트\" /></a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<a href=\"http://www.w3c.org\"><img src=\"../images/w3c.png\" alt=\"W3C\" /></a>\n");
      out.write("						</li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"footer\">\n");
      out.write("			<div class=\"top-wrapper\">\n");
      out.write("				<h2><img src=\"../images/footerLogo.png\" alt=\"뉴렉처\"/></h2>\n");
      out.write("				<p>				\n");
      out.write("					<address id=\"ad\">\n");
      out.write("						사업자등록번호 : 000-00-00000000 통신판매업신고 : 서울 0000-000 관리자 : 홍길동\n");
      out.write("						<br/>\n");
      out.write("						주소 : 서울시 000구 001동 000-0 00빌딩 0층 전화 : 02-000-0000 팩스 : 02-000-0000\n");
      out.write("					</address>\n");
      out.write("				</p>				\n");
      out.write("				<p>\n");
      out.write("					Copyright ⓒ newlecture.com 2012-2012 All Right Reserved. Contact master@newlecture.com for more information\n");
      out.write("				</p>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</body>\n");
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