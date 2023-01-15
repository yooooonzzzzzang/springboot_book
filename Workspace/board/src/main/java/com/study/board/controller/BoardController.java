package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @GetMapping("/board/write")
   public String boardWriteForm(){

       return "boardwrite";
   }
   @PostMapping("/board/writepro")
   public String boardWirtePro(String title, String content){
       System.out.println("제목: " + title);
       System.out.println("내용: " + content);
       return "";
   }
}
