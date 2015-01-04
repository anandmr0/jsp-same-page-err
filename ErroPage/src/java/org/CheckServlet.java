/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author anand
 */
public class CheckServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("usr");
        if (null == user || user.trim().isEmpty()) {
            req.setAttribute("err", "User name is required !");
        } else {
            req.setAttribute("info", "welcome ...");
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
