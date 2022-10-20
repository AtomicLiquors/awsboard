package com.board.awsboard.model;

import lombok.Data;

@Data
public class Board {
    private long id;
    private String title;
    private String content;
}
