package com.mustache.bbs3.controller;

import com.mustache.bbs3.domain.dto.ArticleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j //로거추가
public class ArticleController {
    @GetMapping("/new")
    public String createPage(){
        return "articles/new";
    }

    @PostMapping("")
    public String add(ArticleDto articleDto){
        log.info(articleDto.getTitle()); //ArticleDto에 title이 들어오면 log에 띄어주기
        return "";
    }
}
