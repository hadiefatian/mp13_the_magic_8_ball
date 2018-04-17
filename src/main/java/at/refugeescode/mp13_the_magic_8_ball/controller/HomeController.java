package at.refugeescode.mp13_the_magic_8_ball.controller;

import at.refugeescode.mp13_the_magic_8_ball.logic.Magic8Ball;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private Magic8Ball magic8Ball;

    public HomeController(Magic8Ball magic8Ball) {
        this.magic8Ball = magic8Ball;
    }

    @ModelAttribute("message")
    String message() {
        return magic8Ball.getMessageRandomly();
    }

    @GetMapping
    String page(){
        return "home";
    }
}
