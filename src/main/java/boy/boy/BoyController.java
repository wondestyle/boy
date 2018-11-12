package boy.boy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Description:
 * @Author: psw
 * @Date: 2018/8/18
 */


@RestController
@RequestMapping("/boy")
public class BoyController {

    @Autowired
    private BoyRepository boyRepository;

    /**
     * 查询男生列表
     * @return
     */
    @GetMapping(value = "/boys")
    @Transactional  //事务注解
    public List<Boy> boyList(){

        return boyRepository.findAll();
    }



}
