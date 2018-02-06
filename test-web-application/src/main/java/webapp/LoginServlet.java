package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 *
 * Code in Web Server => Input: HttpRequest, Output: HttpResponse
 * JEE with Servlets
 *
 * Web Server responds with Http Response
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // when passing a request parameter in the URL, we can see its value with the getParameter method
        String name = request.getParameter("name");
        System.out.println(name);

        // putting the parameter in an attribute so that the JSP can see it
        request.setAttribute("name", name);

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

}
