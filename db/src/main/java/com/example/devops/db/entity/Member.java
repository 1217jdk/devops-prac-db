package com.example.devops.db.entity;

import com.example.devops.db.api.MemberInfoDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Column(name = "member_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

    private Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Member of(String name, int age) {
        return new Member(name, age);
    }

    public static Member byMemberInfoDto(MemberInfoDto memberInfoDto) {
        return new Member(memberInfoDto.getName(), memberInfoDto.getAge());
    }
}
