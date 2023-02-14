package com.example.devops.db.api;

import com.example.devops.db.entity.Member;
import com.example.devops.db.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberApi {

    private final MemberService memberService;

    @GetMapping("/api/v1/member/{id}")
    public Member getMember(@PathVariable long id) throws Exception {
        return memberService.getMember(id);
    }

    @PostMapping("/api/v1/member")
    public boolean addMember(@RequestBody MemberInfoDto memberInfoDto) {
        Member memberInfo = Member.byMemberInfoDto(memberInfoDto);

        Member newMember = memberService.addMember(memberInfo);

        return true;
    }
}
