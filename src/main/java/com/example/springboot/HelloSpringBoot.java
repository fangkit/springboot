package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController //是spring4里的新注解，是@ResponseBody和@Controller的缩写 
public class HelloSpringBoot {  
  
	//Application先启动这个类的主函数，http://localhost:8080/hello
    @RequestMapping("/hello")  
    public String hello(){  
    	System.out.println("spring boot test");
        return "this is Spring boot demo!";  
    }  
}  
