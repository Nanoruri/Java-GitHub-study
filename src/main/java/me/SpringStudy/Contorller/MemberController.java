package me.SpringStudy.Contorller;

import me.SpringStudy.Config.SecurityConfig;
import me.SpringStudy.RepositoryDto.LoginDto;
import me.SpringStudy.RepositoryDto.MemberDto;
import me.SpringStudy.Service.LoginService;
import me.SpringStudy.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MemberController {

    private final MemberService memberService;
    private final LoginService loginService;
    private RedirectAttributes redirectAttributes;

    private final SecurityConfig securityConfig;

    @Autowired
    public MemberController(MemberService memberService, LoginService loginService, SecurityConfig securityConfig) {
        this.memberService = memberService;
        this.loginService = loginService;
        this.securityConfig = securityConfig;
    }
    //로그인 페이지
    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("signin",new LoginDto());
        return "loginPage";
    }

    @PostMapping("/loginCheck")
    public String login(@ModelAttribute("signin") @Valid LoginDto loginDto, BindingResult bindingResult) {
        // 로그인 성공 시의 로직
        if (loginService.loginCheck(loginDto)) {
            return "redirect:/main";// 메인 페이지로 리다이렉트
        } else {
            if (bindingResult.hasErrors()) {
                return "loginPage";
            }// 로그인 실패 및 입력 검증 오류 시의 로직
        }
        return "loginPage";
    }

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

    // 회원가입 페이지
    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("member",new MemberDto());
        return "signupPage";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute MemberDto memberDto, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/signupError";
        }//회원가입 실패 시의 로직
        memberService.registerMember(memberDto);// 회원가입 서비스
        return "redirect:/signupSuccess";// signupPage에서 signupSuccessPage로 이동
    }

    // 아이디 중복 검사
    @PostMapping("/idCheck")
    @ResponseBody//이 어노테이션이 붙은 파라미터에는 http요청, 본문(body)이 그대로 전달된다.
    public ResponseEntity<?> checkDuplicateUserId(@RequestParam (value = "userId")String userId) {

        if (memberService.duplicateId(userId)) {//ID 중복검사 해서
            return ResponseEntity.status(HttpStatus.CONFLICT).body("중복된 ID입니다.");//중복O http Conflct(409)상태와 함께 메세지 출력
        } else {
            return ResponseEntity.ok("사용가능한 ID입니다.");//중복X= http ok(200)상태와 함께 메세지 출력
        }
    }


    @GetMapping("/signupSuccess")
    public String signupSuccess(){
        return "signupSuccessPage";
    }


    @GetMapping("/signupError")
    public String signupError (){
        return "signupError";
    }

    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }

}




