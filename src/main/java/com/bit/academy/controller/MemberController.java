package com.bit.academy.controller;

import com.bit.academy.model.MemberVO;
import com.bit.academy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/admin/member/{m_no}")
    public String member(Model model, @PathVariable int m_no){
        model.addAttribute("member", this.memberService.selectMember(m_no));

        return "admin/member";
    }



    @GetMapping("/admin/memberList")
    public String memberList(Model model){
        model.addAttribute("memberList", this.memberService.selectMemberList());
        List<MemberVO> memberList = new ArrayList<>();

        for(MemberVO memberVO:memberList){

        }

        return "admin/memberList";
    }
}
