package com.atguigu.admin.Controll;

import com.atguigu.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 * @title: IndexController
 * @projectName admin
 * @description: TODO
 * @date 2022-04-19-15:16
 */
@Controller
public class IndexController {

    /*
    启动时访问登录页
     */
    @GetMapping("/")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser",user);
            //登陆成功重定向到main.html,防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    /*
    访问main页面
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
//        //是否登陆,去拦截
//        Object logUser = session.getAttribute("loginUser");
//        if (logUser != null){
//        }else {
//            model.addAttribute("msg","未登陆");
//            return "login";
//        }
        return "main";
    }
}
