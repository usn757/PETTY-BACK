package io.github.petty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    // 인덱스 페이지
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "PETTY 테스트");
        return "index";
    }

    // 여행지 추천
    @GetMapping("/recommend")
    public String recommendForm() {
        return "recommend";
    }

    @GetMapping("/search")
    public String searchPage() {
        return "search";
    }

    @GetMapping("/sync")
    public String syncPage() {
        return "syncTest";
    }
}
