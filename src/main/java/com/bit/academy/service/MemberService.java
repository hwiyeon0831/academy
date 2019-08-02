package com.bit.academy.service;

import com.bit.academy.model.MemberVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {
    /**
     * 상세 회원 정보
     * @param m_no
     * @return
     */
    MemberVO selectMember(int m_no);

    /**
     * 회원 리스트
     * @return
     */
    List<MemberVO> selectMemberList();

    List<MemberVO> searchMemberList(String searchOption, String searchKeyword);
}
