package ma.enset.productsapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class SecurityController {
    @GetMapping("/logout")
    public String logout(HttpServletRequest httpServletRequest)throws ServletException {
        httpServletRequest.logout();
        return "redirect:/";
    }
}
