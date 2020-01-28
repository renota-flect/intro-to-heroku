package test.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class Hello{
    @GetMapping("/")
    fun hello(@RequestParam(value = "name", required = false, defaultValue ="fuga") specifiedName: String, model: Model): String{
        model.addAttribute("modelAttributeName", specifiedName);
        return "index";
    }
}