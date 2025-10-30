package edu.uconn.lab6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @GetMapping("/password-quality")
    public String checkPasswordQuality(@RequestParam String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;

        switch (score) {
            case 5:
                return "Password quality: Excellent 🔒";
            case 4:
                return "Password quality: Strong ✅";
            case 3:
                return "Password quality: Medium ⚠️";
            case 2:
                return "Password quality: Weak ❌";
            default:
                return "Password quality: Very weak 🚫";
        }
    }
}
