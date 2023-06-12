package com.green.tag.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardseVo {
    private Long iboard;
    private String title;
    private String ctnt;
    private String dday;
    private char success;
}
