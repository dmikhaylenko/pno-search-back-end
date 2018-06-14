package io.piano.pnosearchbackend.model.feign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is stack exchange question object
 * @author Dmitry Mikhaylenko
 */
@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class SEQuestion {
    /**
     * Original question link
     */
    private String link;
    /**
     * Question title
     */
    private String title;
    /**
     * Question id
     */
    @JsonProperty("question_id")
    private Long questionId;
    /**
     * User who this question posted
     */
    private SEQuestionOwner owner;
    /**
     * Indicator, which display whether
     * question has answer or not
     */
    @JsonProperty("is_answered")
    private Boolean isAnswered;
    /**
     * Creation time stamp
     */
    @JsonProperty("creation_date")
    private Long creationTimeStamp;
}
