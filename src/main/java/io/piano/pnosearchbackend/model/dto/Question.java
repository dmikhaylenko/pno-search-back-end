package io.piano.pnosearchbackend.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * This class is question DTO object
 * @author Dmitry Mikhaylenko
 */
@Getter
@Setter
@EqualsAndHashCode
public class Question {
    /**
     * Question id
     */
    private Long id;
    /**
     * Question title
     */
    private String title;
    /**
     * Original question reference
     */
    private String reference;
    /**
     * Indicator, which display whether
     * question has answer or not
     */
    private Boolean isAnswered;
    /**
     * Creation time stamp
     */
    private Long created;
    /**
     * User profile image URL
     */
    private String imageUrl;
    /**
     * User display name
     */
    private String userName;
}
