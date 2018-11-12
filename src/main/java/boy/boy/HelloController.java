package boy.boy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: psw
 * @Date: 2018/8/17
 */
@Controller
public class HelloController {

    @Autowired
    private BoyProperties boyProperties;


    @GetMapping(value = "/say/{id}")
    public String say(@PathVariable(value = "id") Integer id){

        return  "id:"+id;
       // return boy.toString();
    }

    @RequestMapping("/index")
    public String getData(Model model){
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("张三更", 20, "北京"));
        list.add(new Student("李四", 30, "上海"));
        list.add(new Student("王五", 40, "河北"));
        list.add(new Student("赵六", 50, "郴州"));
        model.addAttribute("list", list);

        return "index";
    }

    @RequestMapping("/test")
    public String getTest(Model model){

        return "test";
    }
}
