/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.AdminUserDAO;
import DTO.AdminUserDTO;

/**
 *
 * @author guest1Day
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControllerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControllerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 受け取るパラメータの文字コードの設定
        request.setCharacterEncoding("UTF-8");
        
        // セッションの生成
        HttpSession session = request.getSession();
        
        // 遷移先のパスの格納用
        String pass = "";
            
        // DAOクラスのインスタンス生成
        AdminUserDAO dao = new AdminUserDAO();

        // DTOクラスのインスタンスを生成。フォームから送信された情報と同じものがあれば値を格納
        AdminUserDTO loginUser = dao.Login(request.getParameter("name"), request.getParameter("password"));
        
        // DTOクラスのインスタンスの値(DBから取得した値)が取得できているかチェック
        if(!loginUser.getName().equals("") && !loginUser.getPassword().equals("")){

            // 正しければセッションにログインしたユーザー名を格納
            session.setAttribute("loginUser", loginUser);

            // 遷移先の指定
            pass = "./Menyu.jsp";
        } else {

            // セッションに入力されたnameの値を格納
            session.setAttribute("user", request.getParameter("name"));
            
            // 遷移先の指定
            pass = "./Login.jsp";
        }

        // passの値に格納されたパスに遷移
        RequestDispatcher rd = request.getRequestDispatcher(pass);
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}