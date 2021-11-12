package com.example.test_1112.dto;

import com.example.test_1112.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String content;

    @Builder
    public PostsSaveRequestDto(String content) {
        this.content = content;
    }

    public Posts toEntity() {
        return Posts.builder()
                .content(content)
                .build();
    }

}