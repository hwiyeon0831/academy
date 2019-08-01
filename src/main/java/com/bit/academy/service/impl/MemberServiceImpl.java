package com.bit.academy.service.impl;

import com.bit.academy.mapper.MemberMapper;
import com.bit.academy.model.MemberVO;
import com.bit.academy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
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
}
