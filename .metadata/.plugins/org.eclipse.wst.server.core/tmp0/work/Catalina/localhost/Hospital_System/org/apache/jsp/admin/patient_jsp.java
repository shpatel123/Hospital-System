/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-10-30 07:38:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Doctor;
import com.dao.DoctorDao;
import com.entity.Appointment;
import java.util.List;
import com.db.DBConnect;
import com.dao.AppointmentDAO;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/component/allcss.jsp", Long.valueOf(1730018406925L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1730106230347L));
    _jspx_dependants.put("/admin/navbar.jsp", Long.valueOf(1730107634614L));
    _jspx_dependants.put("jar:file:/D:/work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Hospital_System/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(8);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.dao.AppointmentDAO");
    _jspx_imports_classes.add("com.dao.DoctorDao");
    _jspx_imports_classes.add("com.db.DBConnect");
    _jspx_imports_classes.add("com.entity.Appointment");
    _jspx_imports_classes.add("com.entity.Doctor");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".paint-card {\r\n");
      out.write("	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-success\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\"><i\r\n");
      out.write("			class=\"fas fa-clinic-medical\"></i> Medi Home</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"index.jsp\">HOME</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"doctor.jsp\">DOCTOR</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"view_doctor.jsp\">VIEW DOCTOR</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"patient.jsp\">PATIENT</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("			<form class=\"d-flex\">\r\n");
      out.write("				<div class=\"dropdown\">\r\n");
      out.write("					<button class=\"btn btn-light dropdown-toggle\" type=\"button\"\r\n");
      out.write("						id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("						aria-expanded=\"false\">Admin</button>\r\n");
      out.write("					<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"../adminLogout\">Logout</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"col-md-12\">\r\n");
      out.write("		<div class=\"card paint-card\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<p class=\"fs-3 text-center\">Patient Details</p>\r\n");
      out.write("				<table class=\"table\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"col\">Full Name</th>\r\n");
      out.write("							<th scope=\"col\">Gender</th>\r\n");
      out.write("							<th scope=\"col\">Age</th>\r\n");
      out.write("							<th scope=\"col\">Appointment</th>\r\n");
      out.write("							<th scope=\"col\">Email</th>\r\n");
      out.write("							<th scope=\"col\">Mob No</th>\r\n");
      out.write("							<th scope=\"col\">Diseases</th>\r\n");
      out.write("							<th scope=\"col\">Doctor Name</th>\r\n");
      out.write("							<th scope=\"col\">Address</th>\r\n");
      out.write("							<th scope=\"col\">Status</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					<tbody>\r\n");
      out.write("						");

						AppointmentDAO dao = new AppointmentDAO(DBConnect.getConn());
						DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
						List<Appointment> list = dao.getAllAppointment();
						for (Appointment ap : list) {
							Doctor d = dao2.getDoctorById(ap.getDoctorId());
						
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>");
      out.print(ap.getFullName());
      out.write("</th>\r\n");
      out.write("							<td>");
      out.print(ap.getGender());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getAge());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getAppoinDate());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getEmail());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getPhNo());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getDiseases());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(d.getFullName());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getAddress());
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(ap.getStatus());
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
