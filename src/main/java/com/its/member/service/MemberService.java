package com.its.member.service;

import com.its.member.dto.MemberDTO;
import com.its.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public boolean save1(MemberDTO memberDTO) {
        int save1 = memberRepository.save1(memberDTO);
        if (save1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO login1(MemberDTO memberDTO) {
        return memberRepository.login1(memberDTO);
    }
}
