/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class Challenge18ComplexSerchServlet extends HttpServlet {

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
        
        // 受け取るパラメータの文字コードの設定
        request.setCharacterEncoding("UTF-8");
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager();
        
        // 検索処理のSQL
        String select = "SELECT * FROM profiles WHERE name = ? AND age = ? AND birthday = ?;";
        
        try (PrintWriter out = response.getWriter();
             Connection con = db.getConnection();
             PreparedStatement pstmt = con.prepareStatement(select)) {

            // 誕生日の情報をDate型に変換
            Date birthday = Date.valueOf(request.getParameter("birthday"));
            
            // フォームから送信された情報をプレースホルダに設定
            pstmt.setString(1, request.getParameter("name"));
            pstmt.setInt(2, Integer.parseInt(request.getParameter("age")));
            pstmt.setDate(3, birthday);
            
            // SQLの実行
            ResultSet rs = pstmt.executeQuery();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Challenge18ComplexSerchServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            // 検索結果の表示
            while(rs.next()) {
                
                out.println(rs.getInt("profilesID") + " ");
                out.println(rs.getString("name") + " ");
                out.println(rs.getString("tel") + " ");
                out.println(rs.getInt("age") + " ");
                out.println(rs.getDate("birthday") + "<br>");
            }
            
            out.println("</body>");
            out.println("</html>");
            
        } catch(SQLException e) {
            e.printStackTrace();
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
        processRequest(request, response);
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
        processRequest(request, response);
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
