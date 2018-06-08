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

/**
 *
 * @author guest1Day
 */
public class Challenge11ArgsReturn3Servlet extends HttpServlet {

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
            
                // リミットを決める
                int limit = 2;
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Challenge11ArgsReturn3Servlet</title>");            
                out.println("</head>");
                out.println("<body>");
                //out.println("<h1>Servlet Challenge11ArgsReturn2Servlet at " + request.getContextPath() + "</h1>");
            
                for(int i = 0; i < limit; limit-- ) {
           
                    // ユーザー情報を受け取る配列の宣言
                    String[] prof = new String[3];

                    // limitの値によって表示するユーザー情報を変える
                    switch(limit) {
                        case 1:
                            // ユーザー定義メソッドから情報を受け取る配列の宣言と、呼び出して情報を代入
                            prof = prof("0123");
                        
                            // 受け取った値の表示
                            for(int j = 1; j < prof.length; j++) {
                
                                // 値がnullの場合は表示しない
                                if(prof[j] == null) {
                                    continue;
                                }
                                    // 表示処理
                                    out.print(prof[j] +"<br>");
                            }
                        
                            break;
                        
                        case 2:
                            // ユーザー定義メソッドから情報を受け取る配列の宣言と、呼び出して情報を代入
                            prof = prof("0124");
                        
                            // 受け取った値の表示
                            for(int j = 1; j < prof.length; j++) {
                
                                // 値がnullの場合は表示しない
                                if(prof[j] == null) {
                                    continue;
                                }
                                    // 表示処理
                                    out.print(prof[j] +"<br>");
                            }
                        
                            break;
                        
                        default:
                            
                    }
           
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
     // ユーザー定義メソッド
    public String[] prof(String id) {
        
        // ユーザー情報を生成、格納
        String[] user1 = {"0123", "1995/07/25", "東京都"};
        String[] user2 = {"0124", "1993/05/22", "群馬県"};
        String[] user3 = {"0125", "1995/03/04", null};
        
        // 戻り値をしまう配列の生成
        String[] ans = new String[3];
        
        // 受け取った引数と同じ情報が入っている配列を探す
        if(user1[0].equals(id)) {
            
            ans = user1;
        } else if(user2[0].equals(id)) {
            
            ans = user2;
        } else if(user3[0].equals(id)) {
            
            ans = user3;
        }
        
        // 配列を返す 
        return ans;
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
