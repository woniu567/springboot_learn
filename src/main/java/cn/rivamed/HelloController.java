package cn.rivamed;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/say")
    String home(){
        System.out.println("jinru");
        return "hello world!";
    }

    //方法里加上@PathVariable可以读出参数
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name){
        return "hello" + name;
    }
}
