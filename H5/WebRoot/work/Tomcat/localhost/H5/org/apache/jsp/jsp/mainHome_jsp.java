/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-05-24 09:54:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

    String rootPath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<title>springMVC--bootstrap</title>\r\n");
      out.write("\r\n");
      out.write("<!-- 新 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"");
      out.print(rootPath);
      out.write("/source/bootstrap3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"");
      out.print(rootPath);
      out.write("/source/bootstrap3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function navTop(id){\r\n");
      out.write("\tif(id!=''&&id!=null&&id=='jokeImg'){\r\n");
      out.write("\t\tiframecenter.location=\"");
      out.print(rootPath);
      out.write("/jokeImg\";\r\n");
      out.write("\t}else if(id!=''&&id!=null&&id=='history'){\r\n");
      out.write("\t\tiframecenter.location=\"");
      out.print(rootPath);
      out.write("/history\";\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tiframecenter.location=\"http://www.baidu.com\";\r\n");
      out.write("\t}\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//iframe高度自适应，小于500时高500\r\n");
      out.write("function dyniframesize(down) { \r\n");
      out.write("\tvar pTar = null; \r\n");
      out.write("\tif (document.getElementById){ \r\n");
      out.write("\t\tpTar = document.getElementById(down); \r\n");
      out.write("\t} \r\n");
      out.write("\telse{ \r\n");
      out.write("\t\teval('pTar = ' + down + ';'); \r\n");
      out.write("\t} \r\n");
      out.write("\tif (pTar && !window.opera){ \r\n");
      out.write("\t//begin resizing iframe \r\n");
      out.write("\tpTar.style.display=\"block\" \r\n");
      out.write("\t\tif (pTar.contentDocument && pTar.contentDocument.body.offsetHeight){ \r\n");
      out.write("\t\t//ns6 syntax \r\n");
      out.write("\t\t\tif(pTar.contentDocument.body.offsetHeight +20<500){\r\n");
      out.write("\t\t\t\tpTar.height = 500;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tpTar.height = pTar.contentDocument.body.offsetHeight +20; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t//pTar.width = pTar.contentDocument.body.scrollWidth+20; \r\n");
      out.write("\t\t} \r\n");
      out.write("\t\telse if (pTar.Document && pTar.Document.body.scrollHeight){ \r\n");
      out.write("\t\t//ie5+ syntax \r\n");
      out.write("\t\t\tif(pTar.Document.body.scrollHeight<500){\r\n");
      out.write("\t\t\t\tpTar.height = 500;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tpTar.height = pTar.Document.body.scrollHeight; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t//pTar.width = pTar.Document.body.scrollWidth; \r\n");
      out.write("\t\t} \r\n");
      out.write("\t} \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("<!--         <nav class=\"navbar navbar-default\"> -->\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><button type=\"button\" onclick=\"navTop('jokeImg')\" class=\"btn btn-success\">搞笑图</button></a> \r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"> <button type=\"button\" onclick=\"navTop('history')\" class=\"btn btn-success\">历史</button></a> \r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"> <button type=\"button\" onclick=\"navTop()\" class=\"btn btn-success\">天猫</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("<!--         </nav> -->\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div  style=\"width: 100%;margin:0px auto;\">\r\n");
      out.write("        <iframe src=\"#\" id=\"iframecenter\" name=\"iframecenter\" frameborder=0 scrolling=\"auto\" width=\"100%\" onload=\"javascript:dyniframesize('iframecenter');\" ></iframe>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}