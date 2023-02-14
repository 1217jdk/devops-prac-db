package com.example.devops.db.service;

import com.example.devops.db.entity.Member;
import com.example.devops.db.repo.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepo memberRepo;

    public Member getMember(long id) throws Exception {
        return memberRepo.findById(id).orElseThrow(() -> new Exception("존재하지 않는 사용자입니다."));
    }

    public Member addMember(Member member) {
        return memberRepo.save(member);
    }
}
