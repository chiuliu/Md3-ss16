package ss16.ex1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculateController {

    @GetMapping
    public String viewCalculate(Model model) {}
}
