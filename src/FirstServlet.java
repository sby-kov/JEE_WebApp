import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // параметры содержатся в объекте request
        String name = request.getParameter("name");
        String mess;    // сообщение о параметрах
        if (name != null) { mess = "Привет, " + name + " !";
        } else mess = " имени не было...";

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();

        pw.println("<h1>");
        pw.println("FirstServlet:  Здравствуй, МИР ! ха-ха! ");
        pw.println("<p>" + mess + "</p>");
        pw.println("</h1>");
        // при редиректе и форвардинге всё, что делается в doGet до них, юзер не видит
        // на внешний сайт
        //response.sendRedirect("https://translate.google.ru/");
        // внутри приложения
        //response.sendRedirect("/firstJSP.jsp");
        //response.sendRedirect("/CallJSP");  // и так можно(Web.xml)

        // и форвардиниг !только внутри сервера!
        RequestDispatcher rd = request.getRequestDispatcher("/CallJSP"); //("/firstJSP.jsp");
        rd.forward(request, response);

    }
}
