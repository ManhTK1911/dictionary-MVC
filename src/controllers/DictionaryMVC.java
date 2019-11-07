package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryMVC {
    @GetMapping("")
    public String index(){
        return "index";
    }
    @GetMapping("/dictionary")
    public String Dictionary(@RequestParam String word, Model model){

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        for(String key : dictionary.keySet()){
            if(key.equalsIgnoreCase(word.trim())){
                model.addAttribute("result",dictionary.get(key));
                break;
            }
        }

        return "index";
    }
}
