package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    static String[] English = new String[]{"How", "What", "Where"};
    static String[] VietNam = new String[]{"the nao", "cai gi", "o dau"};

    @GetMapping("/dictionary")
    public String dictionary( String a, Model model) {
        for (int i = 0; i < 3; i++) {
            if (a.equals(English[i]) ) {
                model.addAttribute("a", VietNam[i]);
                break;
            }else model.addAttribute("a", "Not found");

        }

        return "index";
    }
}
