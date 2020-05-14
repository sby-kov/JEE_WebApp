import pckUtils.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // сессия. сделаем счетчик
        HttpSession session = request.getSession();
        // набросок авторизации
        String user = (String) session.getAttribute("current_user");
        if (user == null) {
            // response для анонимного пользователя
            // авторизация
            // регистрация
            // session.setAttrubute("current_user", ID);
        } else {
            // response для авторизованнного пользователя
        }
        // сессия. делаем корзину
        Cart cart = (Cart) session.getAttribute("cart");
        // пар-ры корзины из url запроса
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        // обработка корзины
        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart", cart);
        // теперь передадим обработку в jsp - (forward)
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
/*
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
*/

/*
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();

        pw.println("<h1>");
        pw.println("FirstServlet:  Здравствуй, МИР ! ха-ха! ");
        pw.println("<p> Ваш счетчик: " + count + " </p>");
        pw.println("<p>" + mess + "</p>");
        pw.println("</h1>");
*/
    }
}
