package com.test.testcicd;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Comment {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long cId;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String contents;

    public Comment(CommentDto commentDto){
        this.name = commentDto.getName();
        this.password = commentDto.getPassword();
        this.contents = commentDto.getContents();
    }

}
