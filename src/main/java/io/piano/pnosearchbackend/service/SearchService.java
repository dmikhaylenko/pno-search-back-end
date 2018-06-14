package io.piano.pnosearchbackend.service;
import io.piano.pnosearchbackend.model.dto.SearchResponse;

/**
 * This class is service which call API and convert
 * search result to DTO
 * @author Dmitry Mikhaylenko
 */
public interface SearchService {
    /**
     * Search questions
     * @param parameters search paramemters
     * @return search response
     */
    SearchResponse searchQuestions(SearchParameters parameters);
}
