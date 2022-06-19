package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import java.sql.*;

public final class FAQ_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/parts/header.jsp");
    _jspx_dependants.add("/parts/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>iTHINK4SDLC FAQ</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  \n");
      out.write("<!-- Blue Color\n");
      out.write("#4A7DAD\n");
      out.write("#2f5492\n");
      out.write("#006697\n");
      out.write("\n");
      out.write("#25274D\n");
      out.write("#29648A\n");
      out.write("#2E9CCA\n");
      out.write("-->\n");
      out.write("<style>\n");
      out.write(".container{\n");
      out.write("    font-family: 'DoppioOne';\n");
      out.write("}  \n");
      out.write(".accordion {\n");
      out.write("    border: 2px;\n");
      out.write("  background-color: #116466;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  cursor: pointer;\n");
      out.write("  padding: 18px;\n");
      out.write("  width: 100%;\n");
      out.write("  border: none;\n");
      out.write("  text-align: left;\n");
      out.write("  outline: none;\n");
      out.write("  font-size: 15px;\n");
      out.write("  transition: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active, .accordion:hover {\n");
      out.write("  background-color: #ccc; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel {\n");
      out.write("  padding: 0 18px;\n");
      out.write("  display: none;\n");
      out.write("  background-color: white;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body style=\"background-color: #c2feff;\">\n");
      out.write("    <!-- Just an image -->\n");
      out.write("        <div style=\"position:fixed;width: 100%;\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser","root",""); //create connection
}catch(Exception e)
{
	out.println(e);
}

      out.write('\n');
 if(session.getAttribute("login") != null){

      out.write("\n");
      out.write("<!--Header-->\n");
      out.write("    <!-- Just an image -->\n");
      out.write("    <nav class=\"navbar navbar-dark\" style='background-color:#116466;'>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("            <img src=\"./images/Logo.png\" width=\"200\" height=\"60\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("            <div class=\"topnav-centered\">\n");
      out.write("                <a style=\"color:#f2f2f2;\">HAENA<br>\"IT TAKES BOTH SIDES TO BUILD A BRIDGE\" - Fredrik Nael</a>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"topnav\" >\n");
      out.write("            <a href=\"userProfile.jsp\">\n");
      out.write("\n");
      out.write("        ");

            try
            {
                String emails = (String)session.getAttribute("login");
                    Class.forName("com.mysql.jdbc.Driver"); //load driver

                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser","root",""); //create connection
                    Statement statement = con.createStatement();
                    String sql = "select firstname from login where email = " +"'" +emails+"'";
                    ResultSet resultset = statement.executeQuery(sql);
                    if(resultset.next()){
                       out.println("Welcome, " + resultset.getString("firstname")); 
                       session.setAttribute("login", emails);
                    }
  
            }catch(Exception e)
            {
                    out.println(e);
            }
	
      out.write("\n");
      out.write("        </a>\n");
      out.write("        <a href=\"logout.jsp\">LOG KELUAR</a>\n");
      out.write("        </div>        \n");
      out.write("    </nav>\n");
      out.write("        <!--style=\"background-color:#50d1d4\"-->\n");
      out.write("        \n");
      out.write("           <nav style=\"background-color: #1f8f91;\">\n");
      out.write("        <div class=\"topnav\" >\n");
      out.write("            <div class=\"navbar-nav\" style=\"position:fixed;\">\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <input type=\"button\" class=\"dropbtn\"  value=\"Nota\" onclick=\"home()\">\n");
      out.write("            </button>\n");
      out.write("            <div class=\"dropdown-content\" >\n");
      out.write("            <a href=\"./Topic1.jsp\">Topik 1.1 Menggunakan Konsep Pemikiran Komputasional Dalam Pembangunan Atur Cara</a>\n");
      out.write("            <a href=\"./Topic2.jsp\">Topik 1.2 Pelaporan Pengunaan Pemikiran Komputasional Bagi Setiap Fasa Pembangunan Atur Cara</a>\n");
      out.write("            <a href=\"./Topic3.jsp\">Topik 1.3 Menghasilkan Satu Projek Mini Berdasarkan Situasi Penyelesaian Masalah Dengan Merujuk Fasa Pembangunan Atur Cara</a>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"./mainQuiz.jsp\" style=\"padding: 14px 16px; margin-left: 79px;\">Kuiz</a>\n");
      out.write("            <a href=\"./ViewPerformance.jsp\" style=\"padding: 14px 16px;\">Prestasi</a>\n");
      out.write("            <a href=\"./forumlist.jsp\" style=\"padding: 14px 16px;\">Forum</a>\n");
      out.write("        </div>\n");
      out.write("    </nav> \n");
      out.write(" <!--Header End--> \n");
      out.write(" ");
 }

      out.write(" \n");
      out.write("<!--close if-->\n");
      out.write("\n");
      out.write(" ");
 if(session.getAttribute("login") == null){

      out.write("\n");
      out.write("    <!-- Just an image -->\n");
      out.write("    <nav class=\"navbar navbar-dark\" style='background-color:#116466;'>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("            <img src=\"./images/Logo.png\" width=\"200\" height=\"60\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("            <div class=\"topnav-centered\">\n");
      out.write("                <a style=\"color:#f2f2f2;\">HAENA<br>\"IT TAKES BOTH SIDES TO BUILD A BRIDGE\" - Fredrik Nael</a>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"topnav\" >\n");
      out.write("            <a href=\"login.jsp\">LOG MASUK</a>\n");
      out.write("            <a href=\"register.jsp\">DAFTAR</a>\n");
      out.write("        </div>        \n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("               <nav style=\"background-color: #1f8f91;\">\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <div class=\"navbar-nav\" style=\"position:fixed;\">\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <div>\n");
      out.write("                <input type=\"button\" class=\"dropbtn\" value=\"Nota\" onclick=\"home()\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            <div class=\"dropdown-content\" >\n");
      out.write("            <a  href=\"./Topic1.jsp\">Topik 1.1 Menggunakan Konsep Pemikiran Komputasional Dalam Pembangunan Atur Cara</a>\n");
      out.write("            <a href=\"./Topic2.jsp\">Topik 1.2 Pelaporan Pengunaan Pemikiran Komputasional Bagi Setiap Fasa Pembangunan Atur Cara</a>\n");
      out.write("            <span style=\"z-index: 99;\"><a href=\"./Topic3.jsp\">Topik 1.3 Menghasilkan Satu Projek Mini Berdasarkan Situasi Penyelesaian Masalah Dengan Merujuk Fasa Pembangunan Atur Cara</a></span>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"./mainQuiz.jsp\" style=\"padding: 14px 16px;margin-left: 79px\">Kuiz</a>\n");
      out.write("            <a href=\"./ViewPerformance.jsp\" style=\"padding: 14px 16px;\">Prestasi</a>\n");
      out.write("            <a href=\"./forumlist.jsp\" style=\"padding: 14px 16px;\">Forum</a>\n");
      out.write("        </div>\n");
      out.write("    </nav> \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function home(){\n");
      out.write("            window.location.replace(\"index.jsp\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container pt-3\">\n");
      out.write("    <div> \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h2>Soalan Lazim(FAQ)</h2>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana jika saya tidak log masuk?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Anda hanya boleh mengakses bahan nota dan hanya melihat forum</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Mengapa saya tidak boleh log masuk?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Anda perlu mendaftar terlebih dahulu sebelum anda log masuk ke sistem. Butang mendaftar berada di sudut kanan atas pada bar navigasi.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana untuk log keluar?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke bar navigasi keluar di sudut kanan atas</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana cara untuk mengakses bahan nota?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke halaman nota dan pilih subtopik yang ingin anda pelajari</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana untuk saya mendapatkan rujukan?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Rujukan bahan diberikan dalam setiap subtopik.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana untuk mencuba Kuiz?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke halaman kuiz dengan klik pada bar navigasi kuiz. Anda boleh memilih subtopik mana yang ingin anda cuba.</p>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <button class=\"accordion\">Apakah kelebihan mencuba kuiz?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Anda boleh menguji pengetahuan anda mengenai subtopik</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bolehkah saya melihat keputusan kuiz saya?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Ya, pergi ke halaman prestasi untuk melihat skor kuiz anda</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana untuk mencuba semula Kuiz?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke halaman prestasi dan klik pada pautan percubaan dalam jadual yang diberikan. Anda boleh memilih subtopik mana yang ingin anda cuba.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Apabila saya menghadapi masalah memahami nota, bagaimana saya boleh bertanya?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Anda boleh mengemukakan soalan di halaman forum. Di sana anda boleh berinteraksi dengan pelajar lain.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana cara membalas di forum?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke halaman balasan dan pilih forum mana yang ingin anda balas. Butang balas diberikan.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button class=\"accordion\">Bagaimana saya boleh 'mengedit' forum saya?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke halaman forum anda, pilih forum yang anda perlukan dan klik pada butang edit</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <button class=\"accordion\">Bagaimana saya boleh memadam forum saya?</button>\n");
      out.write("        <div class=\"panel\">\n");
      out.write("        <p>Pergi ke halaman forum anda, pilih forum yang anda perlukan dan klik pada butang delete</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var acc = document.getElementsByClassName(\"accordion\");\n");
      out.write("var i;\n");
      out.write("\n");
      out.write("for (i = 0; i < acc.length; i++) {\n");
      out.write("  acc[i].addEventListener(\"click\", function() {\n");
      out.write("    this.classList.toggle(\"active\");\n");
      out.write("    var panel = this.nextElementSibling;\n");
      out.write("    if (panel.style.display === \"block\") {\n");
      out.write("      panel.style.display = \"none\";\n");
      out.write("    } else {\n");
      out.write("      panel.style.display = \"block\";\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("                <footer id=\"site-footer\" style=\"font-family: 'DoppioOne';\">\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"> \n");
      out.write("        <style>\n");
      out.write("            .footer{\n");
      out.write("  background: #116466;\n");
      out.write("  color:white;\n");
      out.write("  font-family: DoppioOne;\n");
      out.write("  .links{\n");
      out.write("    ul {list-style-type: none;}\n");
      out.write("    li a{\n");
      out.write("      color: white;\n");
      out.write("      transition: color .2s;\n");
      out.write("      &:hover{\n");
      out.write("        text-decoration:none;\n");
      out.write("        color:#4180CB;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("  }  \n");
      out.write("  .about-company{\n");
      out.write("    i{font-size: 25px;}\n");
      out.write("    a{\n");
      out.write("      color:white;\n");
      out.write("      transition: color .2s;\n");
      out.write("      &:hover{color:#4180CB}\n");
      out.write("    }\n");
      out.write("  } \n");
      out.write("  .location{\n");
      out.write("    i{font-size: 18px;}\n");
      out.write("  }\n");
      out.write("  .copyright p{border-top:1px solid rgba(255,255,255,.1);} \n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"mt-5 pt-5 pb-5 footer\" >\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-lg-5 col-xs-12 about-company\">\n");
      out.write("      <h2>Tentang Kami</h2>\n");
      out.write("      <p class=\"pr-5 text-white-50\">Kami dari HAENA Company telah membuat laman web khas untuk pelajar tingkatan 3 yang ingin mempelajari tentang Bab 1 iaitu Konsep Asas Pemikiran Komputasional</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-3 col-xs-12 links\">\n");
      out.write("      <h4 class=\"mt-lg-0 mt-sm-3\">Tambahan</h4>\n");
      out.write("        <ul class=\"m-0 p-0\" style=\"list-style-type: none;\">\n");
      out.write("          <li>- <a href=\"./FAQ.jsp\">FAQ</a></li>\n");
      out.write("          <li>- <a href=\"./feedback.jsp\">Maklum Balas</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-xs-12 location\">\n");
      out.write("      <h4 class=\"mt-lg-0 mt-sm-4\">Kontak Kami</h4>\n");
      out.write("      <p class=\"mb-0\"><i class=\"fa fa-phone mr-3\"></i>+6014 123-4567</p>\n");
      out.write("      <p><i class=\"fa fa-envelope-o mr-3\"></i>haenacompany@gmail.com</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row mt-5\">\n");
      out.write("    <div class=\"col copyright\">\n");
      out.write("      <p class=\"\"><small class=\"text-white-50\">© 2021. All Rights Reserved.</small></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </footer> \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}