package pack1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ViewProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        List<Product> productList = ViewProductDAO.getAllProducts();
        req.setAttribute("products", productList);
        RequestDispatcher rd = req.getRequestDispatcher("viewproduct.jsp");
        rd.forward(req, res);
    }
}
