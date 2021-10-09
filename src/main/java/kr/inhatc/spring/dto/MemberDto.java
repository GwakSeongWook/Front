package kr.inhatc.spring.dto;

import kr.inhatc.spring.domain.Member;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String username;
    private String password;
    private String name;

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .username(username)
                .password(password)
                .name(name)
                .build();
    }

    @Builder
    public MemberDto(Long id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }
}
