package io.piano.pnosearchbackend.service;
import io.piano.pnosearchbackend.model.dto.SearchResponse;


public interface SearchService {
    SearchResponse searchQuestions(SearchParameters parameters);
}
