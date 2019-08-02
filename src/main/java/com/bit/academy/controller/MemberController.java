package com.bit.academy.controller;

import com.bit.academy.model.MemberVO;
import com.bit.academy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping("/admin/member/{searchOption}/{searchKeyword}")
    public String searchMember(Model model, @PathVariable String searchOption, @PathVariable String searchKeyword){
        model.addAttribute("memberList", this.memberService.searchMemberList(searchOption, searchKeyword));
        List<MemberVO> memberList = new ArrayList<>();

        for(MemberVO memberVO:memberList){

        }
        return "admin/memberList";
    }

    @ResponseBody
    @GetMapping("/admin/member/{m_no}")
    public MemberVO memberJSON(Model model, @PathVariable int m_no){
        return this.memberService.selectMember(m_no);
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
