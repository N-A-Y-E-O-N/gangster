/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-11-16 06:21:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.M_005fwithdog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class w_005fbuying_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/M_withdog/../layouts/headerCSS", Long.valueOf(1668434616714L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>주인없는 하늘아래</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS/JS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSSmenu.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSSsection.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSSbanner.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSStab.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSShelp.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSSmangdog.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSSeffect.css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/CSShover.css\" >\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ì¹ í°í¸ ì¤ì  -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gaegu&family=Noto+Serif+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Hahmlet:wght@300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ë§ë ë°°ë// ì´ ìì ììë íìí js, css ë¥¼ ë§í¬ê±¸ì´ ì¬ì© -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jquery ì¤ì  -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-sm\">\r\n");
      out.write("<!-- 공구기한 배찌 --><br><h2><span class=\"badge bg-secondary\">공동구매 기간 2022-11-01 ~ 2022-12-25</span></h2> <br>\r\n");
      out.write("\r\n");
      out.write("<select class=\"form-select form-select-lg mb-3\" aria-label=\".form-select-lg example\">\r\n");
      out.write("  <option selected>구매하실 사료를 선택하세요 </option>\r\n");
      out.write("  <option value=\"1\">나우(프레쉬 스몰 브리드 어덜트) </option>\r\n");
      out.write("  <option value=\"2\">나우(프레쉬 스몰 브리드 시니어) </option>\r\n");
      out.write("  <option value=\"3\">네츄럴코어(에코 플러스1 그레인프리 치킨/연어) </option>\r\n");
      out.write("  <option value=\"4\">뉴트리나(건강백서 건강한 관절) </option>\r\n");
      out.write("  <option value=\"5\">뉴트리나(건강백서 건강한 6세+) </option>\r\n");
      out.write("  <option value=\"6\">닥터독(피부모질/연어) </option>\r\n");
      out.write("  <option value=\"7\">더독(명작 하이포알러지 연어) </option>\r\n");
      out.write("  <option value=\"8\">더독(닥터소프트 치킨) </option>\r\n");
      out.write("  <option value=\"9\">더독(닥터소프트 그레인프리 오리) </option>\r\n");
      out.write("  <option value=\"10\">더마독(피부 모질 건강사료) </option>\r\n");
      out.write("  <option value=\"11\">더마독(관절 건강사료) </option>\r\n");
      out.write("  <option value=\"12\">도그라인(펫프로) </option>\r\n");
      out.write("  <option value=\"13\">도그라인(아지피아) </option>\r\n");
      out.write("  <option value=\"14\">도그라인(도그피아) </option>\r\n");
      out.write("  <option value=\"15\">라무달리(금동사료) </option>\r\n");
      out.write("  <option value=\"16\">로열캐닌(엑스 스몰 퍼피) </option>\r\n");
      out.write("  <option value=\"17\">로열캐닌(미니 인도어 어덜트) </option>\r\n");
      out.write("  <option value=\"18\">로열캐닌(미니 인도어 퍼피) </option>\r\n");
      out.write("  <option value=\"19\">로열캐닌(미니스타터 마더/베이비독) </option>\r\n");
      out.write("  <option value=\"20\">시저(캔 14세 이상 쇠고기/현미와 야채) </option>\r\n");
      out.write("  <option value=\"21\">시저(캔 11세 이상 닭고기) </option>\r\n");
      out.write("  <option value=\"22\">아카나(헤리티지 퍼피 스몰 브리드) </option>\r\n");
      out.write("  <option value=\"23\">오리젠(스몰 브리드독) </option>\r\n");
      out.write("  <option value=\"24\">오리젠(스몰 오리지날) </option>\r\n");
      out.write("  <option value=\"25\">오리젠(퍼피) </option>\r\n");
      out.write("  <option value=\"26\">오리젠(퍼피 라지) </option>\r\n");
      out.write("  <option value=\"27\">오리젠(시니어독) </option>\r\n");
      out.write("  <option value=\"28\">퓨리나(알포 리틀프렌즈 6세 이상) </option>\r\n");
      out.write("  <option value=\"29\">한끼뚝딱(황태담은 한끼 황태와 소고기) </option>\r\n");
      out.write("  <option value=\"30\">하림(밥이보약 활기찬 노후) </option>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container text-center\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col\">\r\n");
      out.write(" <div class=\"row gx-5\">\r\n");
      out.write(" \r\n");
      out.write("<!-- 선택한 사료 사진 뜨는 칸  -->\r\n");
      out.write("    <div class=\"col\">\r\n");
      out.write("<canvas id=\"canvas1\" width=\"350\" height=\"350\" style=\"border:1px solid black\">\r\n");
      out.write("</canvas>\r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("<!-- 선택한 사료 성분 뜨는 칸  -->   \r\n");
      out.write("    <div class=\"col\">\r\n");
      out.write("\r\n");
      out.write("<canvas id=\"canvas1\" width=\"350\" height=\"350\" style=\"border:1px solid black\">\r\n");
      out.write("</canvas>\r\n");
      out.write("    </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("<br><br><br>\r\n");
      out.write("<h3>주문자 정보</h3> \r\n");
      out.write("<div class=\"input-group mb-3\">\r\n");
      out.write("  <span class=\"input-group-text\" id=\"basic-addon1\">이름 </span>\r\n");
      out.write("  <input type=\"text\" class=\"form-control\" placeholder=\"이름을 입력하세요 \" aria-label=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input-group mb-3\">\r\n");
      out.write("  <span class=\"input-group-text\" id=\"basic-addon1\">전화번호 </span>\r\n");
      out.write("  <input type=\"text\" class=\"form-control\" placeholder=\"010-0000-0000 \" aria-label=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input-group mb-3\">\r\n");
      out.write("  <span class=\"input-group-text\" id=\"basic-addon1\">주소   </span>\r\n");
      out.write("  <input type=\"text\" class=\"form-control\" placeholder=\"OO시 OO구 OO동 \" aria-label=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<right><button type=\"button\" class=\"btn btn-secondary\">완료</button></right>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<center>계좌번호 우리은행 1002-458-881832 함수림</center> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" </div>\r\n");
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
