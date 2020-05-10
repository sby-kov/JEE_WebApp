import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // параметры содержатся в объекте request
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String mess= "Привет, ";    // сообщение о параметрах
        if (name != null) { mess = mess + name + " ";
        } else mess = mess + "безИмени";
        if (surname != null) { mess = mess + " " + surname;
        } else mess = mess + " безОтчества";
        mess = mess + " ! ";

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();

        pw.println("<h1>");
        pw.println("FirstServlet:  Здравствуй, МИР ! ха-ха! ");
        pw.println("<p>" + mess + "</p>");
        pw.println("</h1>");
    }
}
