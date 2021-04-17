package dev.be.goodgid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.be.goodgid.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}