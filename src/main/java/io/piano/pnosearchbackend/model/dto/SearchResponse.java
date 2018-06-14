package io.piano.pnosearchbackend.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * This class is search response DTO object
 * @author Dmitry Mikhaylenko
 */
@Getter
@Setter
@EqualsAndHashCode
public class SearchResponse {
    /**
     * Found question list
     */
    private List<Question> questions;
    /**
     * Indicator, which display whether
     * data page is last or not
     */
    private boolean hasMore;
}
