package io.piano.pnosearchbackend.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class SearchResponse {
    private List<Question> questions;
    private boolean hasMore;
}
