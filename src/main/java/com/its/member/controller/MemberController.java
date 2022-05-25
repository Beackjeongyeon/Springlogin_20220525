package com.its.member.controller;

import com.its.member.dto.MemberDTO;
import com.its.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/save-form")
    public String save() {

        return "save";
    }

    @PostMapping("/save1")
    public String save1(@ModelAttribute MemberDTO memberDTO) {

       boolean save1 = memberService.save1(memberDTO);
        if(save1 == true){
            return "findAll";
        }else{
            return "index";
        }
    }
    @GetMapping("/login-form")
    public String login1(){
        return "login";
    }
    @PostMapping("/login")
    public String login1(@ModelAttribute MemberDTO memberDTO){

         MemberDTO  member =memberService.login1(memberDTO);
         if(member != null){
             return "main";
         }else{
             return "login";
         }

    }
}
