package kr.inhatc.spring.controller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.inhatc.spring.dto.MemberDto;
import kr.inhatc.spring.service.MemberService;


@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/main")
    public String main() {
        return "page/main";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("member",new MemberDto());

        return "auth/signup";
    }

    @PostMapping("/signup")
    public String signup(MemberDto memberDto) {
        memberService.signUp(memberDto);

        return "redirect:auth/signin";
    }

    @GetMapping("/signin")
    public String signin() {
        return "auth/signin";
    }
}
