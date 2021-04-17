package dev.be.goodgid.service;

import org.springframework.stereotype.Service;

import dev.be.goodgid.domain.Member;
import dev.be.goodgid.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

    private final MemberRepository memberRepository;

    public String checkDB() {
        memberRepository.save(Member.builder()
                                    .name("goodGid")
                                    .build());
        return memberRepository.findAll().size() + "";
    }
}