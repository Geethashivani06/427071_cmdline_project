package com.example.Paymentapp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String landingPage() {
		return "landing";
	}

	@GetMapping("/index")
	public String homePage() {
		return "index"; // Renders home.jsp
	}

//    @GetMapping("/profile")
//    public String profilePage() {
//        return "profile";  // Renders profile.jsp
//    }

//	@GetMapping("/viewtransactions")
//	public String transactionsPage() {
//		return "viewtransactions"; // Renders viewtransactions.jsp
//	}

	@GetMapping("/bankstatement")
	public String statementPage() {
		return "bankstatement"; // Renders bankstatement.jsp
	}

//	@GetMapping("/logout")
//	public String logoutPage() {
//		return "logout"; // Renders logout.jsp
//	}
}
