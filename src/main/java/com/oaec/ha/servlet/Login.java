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


@WebServlet("/login")
public class Login extends HttpServlet {

    private UserService userService;

    public Login() {
        userService=  new UserServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username=request.getParameter("name");
        String password=request.getParameter("password");

       if (username!=null || username.equals("") || password!=null || password.equals("")) {
              USER  user=userService.finBYusername(username);
                if (user==null){
                  response.getWriter().write("用户名不存在");
              }else{
                  if (user.getPassword().equals(password)){
                      response.getWriter().write("登录成功");
                  }
                  else {


                      response.getWriter().write("密码错误");
                  }
              }

       }

    }



}
