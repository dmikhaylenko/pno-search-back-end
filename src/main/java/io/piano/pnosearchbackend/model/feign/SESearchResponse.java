package io.piano.pnosearchbackend.model.feign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * This class is stack exchange search response object
 * @author Dmitry Mikhaylenko
 */

@Getter
@Setter
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class SESearchResponse {
    /**
     * Search response question items
     */
    private List<SEQuestion> items;
    /**
     * Indicator, which display whether
     * data page is last or not
     */
    @JsonProperty("has_more")
    private Boolean hasMore;
}
