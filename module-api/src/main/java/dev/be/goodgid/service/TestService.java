package dev.be.goodgid.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import dev.be.goodgid.domain.Member;
import dev.be.goodgid.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

    private final MemberRepository memberRepository;

    @Value("${profile-name}")
    private String name;

    public String checkDB() {
        System.out.println(name);

        memberRepository.save(Member.builder()
                                    .name("goodGid")
                                    .build());
        return memberRepository.findAll().size() + "";
    }
}