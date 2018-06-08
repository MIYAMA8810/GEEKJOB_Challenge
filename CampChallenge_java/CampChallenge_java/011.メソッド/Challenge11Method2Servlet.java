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
public class Challenge11Method2Servlet extends HttpServlet {

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
            out.println("<title>Servlet Challenge11Method2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet Challenge11Method2Servlet at " + request.getContextPath() + "</h1>");
            
            // ユーザー定義メソッドの呼び出し
            mul(3, 4, true, out);
            
            // デフォルト値が設定してあるユーザー定義メソッドの呼び出し
            mul(5, out);
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    // ユーザー定義メソッド
        public void mul(int num, PrintWriter pw) {
            
            // もう一つのユーザー定義メソッドの呼び出し
            mul(5, num, false, pw);
        }
        
    // ユーザー定義メソッド
    public void mul(int num1, int num2, boolean result, PrintWriter pw) {
        
        // 計算結果を格納する変数の宣言
        int ans = 0;
        
        // 引数3の値によって条件分岐した後、計算結果の代入
        if(result) {
            
            // trueの時の処理
            ans = (num1 * num2) * (num1 * num2);
            
            // 計算結果の表示
            pw.print("計算結果は：" + ans + "です<br>");
        } else {
                
            // falseの時の処理
            ans = num1 * num2;
            
            // 計算結果の表示
            pw.print("計算結果は：" + ans + "です<br>");
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
