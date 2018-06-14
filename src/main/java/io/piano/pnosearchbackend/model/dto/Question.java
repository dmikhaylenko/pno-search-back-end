package io.piano.pnosearchbackend.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class Question {
    private Long id;
    private String title;
    private String reference;
    private Boolean isAnswered;
    private Date created;
    private String imageUrl;
    private String userName;
}
