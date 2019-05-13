package com.oaec.ha.servlet;
import com.oaec.ha.entity.USER;
import com.oaec.ha.service.service.UserService;
import com.oaec.ha.service.service.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/registered")
public class Registered  extends HttpServlet {
    private UserService userService;

    public Registered() {
        userService=  new UserServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
       String name=request.getParameter("name");
        String age=request.getParameter("age");
        String sex=request.getParameter("sex");
        String password=request.getParameter("password");

        if(name!=null || name.equals("")){
            USER user=new USER();
            user.setAge(age);
            user.setSex(sex);
            user.setUsername(name);
            user.setPassword(password);
            int row =userService.create(user);
            if (row>0){
               /*response.getWriter().write("注册成功点击登录页面<a href=\"login.jsp\">点击登录</a>");*/
             /*   request.setAttribute("success","注册成功");*/
                response.getWriter().write("注册成功");
               request.getRequestDispatcher("login.jsp").forward(request,response);
            }
            else {
                response.getWriter().write("注册失败，点击返回注册页面"+"<a herf='Registered.jsp'></a>");
            }

        }




    }


}
