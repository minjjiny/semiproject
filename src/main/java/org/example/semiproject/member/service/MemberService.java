package org.example.semiproject.member.service;

import org.example.semiproject.member.domain.Member;
import org.example.semiproject.member.domain.dto.MemberDTO;

public interface MemberService {

    boolean newMember(MemberDTO member);
    Member loginMember(MemberDTO member);

}