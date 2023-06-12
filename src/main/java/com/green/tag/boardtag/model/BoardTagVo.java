package com.green.tag.boardtag.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardTagVo {
    private Long iboard;
    private String title;
    private String ctnt;
    private String dday;
    private String success;
}
