package jpabook.jpashop.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 홈 컨트롤러
 * Created by KMS on 2021/02/13.
 */
@Controller
@Slf4j
public class HomeController {
    
    /**
     * 홈 화면 이동
     * @return
     */
    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }
}
