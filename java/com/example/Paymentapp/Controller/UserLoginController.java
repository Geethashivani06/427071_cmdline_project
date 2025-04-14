package com.example.Paymentapp.Controller;

import com.example.Paymentapp.Entity.UserEntity;
import com.example.Paymentapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserLoginController {

  @Autowired
  private UserService userService;

  @PostMapping("/login")
  public String login(@RequestParam String username,
                      @RequestParam String password,
                      HttpSession session,
                      Model model) {

      UserEntity user = userService.validateUser(username, password);
      if (user != null) {
          session.setAttribute("loggedInUser", user); // store user in session
          return "redirect:/index"; // 
      } else {
          model.addAttribute("error", "Invalid username or password");
          return "login";
      }
  }

  @GetMapping("/login")
  public String showLoginPage() {
      return "login";
  }

  @GetMapping("/logout")
  public String logout(HttpSession session) {
      session.invalidate(); // this clears everything from session
      return "redirect:/login";
  }
}
