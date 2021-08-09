package com.test.testcicd;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;


    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    public void postComments(List<String> list){
        CommentDto commentDto = new CommentDto(list.get(0),list.get(1),list.get(2));
        Comment comment = new Comment(commentDto);
        commentRepository.save(comment);
    }
    public void deleteComments(Long id , String password){
        System.out.println(password);
        Comment comment = commentRepository.findById(id).get();
        if(comment.getPassword().equals(password)){
            commentRepository.delete(comment);
        }
        else{
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
    }
}
