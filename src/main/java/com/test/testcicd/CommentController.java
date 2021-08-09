package com.test.testcicd;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommentController {


    private final CommentService commentService;

    @GetMapping("/")
    public String getComments(Model model){
        model.addAttribute("commentlist", commentService.getAllComments());
        return "index";
    }

    @PostMapping("/post/comments")
    @ResponseBody
    public void postComments(@RequestBody List<String> list){
        commentService.postComments(list);
    }

    @PutMapping("/delete/comments/{id}")
    @ResponseBody
    public void deleteComments(@PathVariable Long id ,@RequestBody String password){
        commentService.deleteComments(id , password);
    }
}
