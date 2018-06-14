package io.piano.pnosearchbackend.model.feign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is stack exchange question owner object
 * @author Dmitry Mikhaylenko
 */
@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class SEQuestionOwner {
    /**
     * User display name
     */
    @JsonProperty("display_name")
    private String displayName;
    /**
     * User profile image URL
     */
    @JsonProperty("profile_image")
    private String profileImage;
}
