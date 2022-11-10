package com.mustache.bbs3.domain.dto;

import lombok.Getter;

@Getter
public class ArticleDto {
    private String title;

    public ArticleDto(String title) {
        this.title = title;
    }
}

