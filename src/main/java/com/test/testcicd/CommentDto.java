package com.test.testcicd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private String name;
    private String password;
    private String contents;
}
