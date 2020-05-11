import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // сессия. сделаем счетчик
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 1;
            session.setAttribute("count", count);
        } else {
            session.setAttribute("count", count + 1);
        }

        // параметры. содержатся в объекте request
        String name = request.getParameter("name");
        String mess;    // сообщение о параметрах
        if (name != null) { mess = "Привет, " + name + " !";
        } else mess = " имени не было...";

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();

        pw.println("<h1>");
        pw.println("FirstServlet:  Здравствуй, МИР ! ха-ха! ");
        pw.println("<p> Ваш счетчик: " + count + " </p>");
        pw.println("<p>" + mess + "</p>");
        pw.println("</h1>");
    }
}
