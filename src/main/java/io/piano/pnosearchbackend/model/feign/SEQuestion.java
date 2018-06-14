package io.piano.pnosearchbackend.model.feign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class SEQuestion {
    private String link;
    private String title;
    @JsonProperty("question_id")
    private Long questionId;
    private SEQuestionOwner owner;
    @JsonProperty("is_answered")
    private Boolean isAnswered;
    @JsonProperty("creation_date")
    private Date creationDate;
}
