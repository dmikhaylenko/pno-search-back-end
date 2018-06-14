package io.piano.pnosearchbackend.model.feign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class SEQuestionOwner {
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("profile_image")
    private String profileImage;
}
