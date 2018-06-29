/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class Challenge16Session2Servlet extends HttpServlet {

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
            
            // 受け取るパラメータの文字コードの設定
            request.setCharacterEncoding("UTF-8");
            
            // Sessionの取得
            HttpSession hs = request.getSession();
            
            // 値の取得
            hs.setAttribute("name", request.getParameter("name"));
            hs.setAttribute("sex", request.getParameter("sex"));
            hs.setAttribute("hobby", request.getParameter("hobby"));
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Challenge16Session2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            // 入力フォーム
            out.println("<form action=\"Challenge16Session2Servlet\" method=\"get\">");
            out.println("名前：<input type=\"text\" name=\"name\" value=\"" 
                    + nullCheck(1, hs.getAttribute("name")) + "\"><br>");
            
            out.println("性別：男<input type=\"radio\" name=\"sex\"" 
                    + nullCheck(2, hs.getAttribute("sex")) + " value=\"男\">");
            
            out.println("女<input type=\"radio\" name=\"sex\""
                    + nullCheck(3, hs.getAttribute("sex")) + " value=\"女\"><br>");
            
            out.println("<textarea name=\"hobby\">" 
                    + nullCheck(1, hs.getAttribute("hobby")) + "</textarea><br>");
             
            out.println("<input type=\"submit\" name=\"submit\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // nullチェックを行い、nullじゃなければ文字列を返すメソッド
    public String nullCheck(int num, Object obj) {
        
        // Object型からString型にキャスト変換
        String str = (String)obj;
        
        if(str != null) {
            
            // 変数numの値によって分岐
            switch(num) {
                case 1:
                    // nullじゃなければ文字列として戻り値にする
                    return str;

                case 2:
                    // 値のチェック
                    if(str.equals("男")) {

                        // nullじゃなければ文字列を戻り値にする
                        return "Checked";
                    } 

                    break;

                case 3:
                    // 値のチェック
                    if(str.equals("女")) {

                        // nullじゃなければ文字列を戻り値にする
                        return "Checked";
                    }

                    break;
            }
        }
        
        // nullなら空文字を戻り値にする
        return "";
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
