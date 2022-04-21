package com.atguigu.admin.Controll;

import com.atguigu.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jnlp.UnavailableServiceException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * @title: TableController
 * @projectName admin
 * @description: TODO
 * @date 2022-04-19-16:10
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basicTable(){
        return "tables/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model){
        //表格遍历
        List<User> users = Arrays.asList(new User("zhangsan", "zhangsan"),
                new User("lisi", "lisi"),
                new User("wangwu", "wangwu"),
                new User("zhaoliu", "zhaoliu"));

        model.addAttribute("users",users);

        return "tables/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsiveTable(){
        return "tables/responsive_table";
    }
    @GetMapping("/edit_table")
    public String editTable(){
        return "tables/editable_table";
    }
    @GetMapping("/pricing_table")
    public String pricingTable(){
        return "tables/pricing_table";
    }
}
