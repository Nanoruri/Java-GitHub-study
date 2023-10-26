package kr.Study.S;

import kr.Study.S.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class MemberController {
    @Autowired
    MemberDao dao;

    @GetMapping("/signup")
    public String showSignupForm(Model model){
        model.addAttribute("member", new Member());
        return "signupPage";
    }
    @PostMapping("/signup")
    public String processSignup (@ModelAttribute Member member){
        System.out.println("회원가입 정보" + member.getUsername() + member.getPassword());
        return "redirect:/signup";
    }
}
