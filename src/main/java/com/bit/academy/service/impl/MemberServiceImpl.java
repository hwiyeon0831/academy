package com.bit.academy.service.impl;

import com.bit.academy.mapper.MemberMapper;
import com.bit.academy.model.BoardVO;
import com.bit.academy.model.MemberVO;
import com.bit.academy.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberVO selectMember(int m_no) {
        return this.memberMapper.selectMember(m_no);
    }

    @Override
    public List<MemberVO> selectMemberList() {
        return this.memberMapper.selectMemberList();
    }

    @Override
    public List<MemberVO> searchMemberList(String searchOption, String searchKeyword) {
        return this.memberMapper.searchMemberList(searchOption, searchKeyword);
    }

    @Override
    public MemberVO memberInfo(MemberVO memberVO, String chk_pw) {
        log.debug("#########################");
        log.debug(memberVO.toString());
        int m_no = memberVO.getM_no();
        memberVO = this.memberMapper.selectMember(memberVO.getM_no());
        //MemberVO memberVO1 = this.memberMapper.selectMember(memberVO.getM_no());

        /*memberVO.setM_address("testadd");
        memberVO.setM_id("test1id");
        memberVO.setM_no(2);
        memberVO.setM_phone("010-1234-5678");
        memberVO.setM_name("test1");
        memberVO.setM_password("test1pw");
        memberVO.setM_regdate("2019-08-01 01:31:12");*/
        log.debug(memberVO.toString());


        if(memberVO.getM_password().equals(chk_pw)){
            //request.getSession().setAttribute("member", memberVO);
            log.debug("success");
            return memberVO;
        }else{
            log.debug("fail");
            return null;
        }
    }

    @Override
    public MemberVO memberUpdate(MemberVO memberVO) {

        this.memberMapper.updateMember(memberVO);

        return null;
    }

}
