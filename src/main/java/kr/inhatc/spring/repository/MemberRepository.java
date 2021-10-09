package kr.inhatc.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.inhatc.spring.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByusername(String username);
}
