package io.piano.pnosearchbackend.controller;

import io.piano.pnosearchbackend.model.dto.SearchResponse;
import io.piano.pnosearchbackend.service.SearchParameters;
import io.piano.pnosearchbackend.service.SearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * This class is search REST controller
 * @author Dmitry Mikhaylenko
 */
@CrossOrigin
@RestController
@Api(
        tags = {"SearchService"},
        description = "Stack Exchange search service. This API is " +
                "provides functional to search questions on \"stackoverflow\" service."
)
public class SearchController {
    @Autowired
    private SearchService searchService;

    /**
     * Find questions REST method
     * @param searchQuery search query string
     * @param page page number
     * @return search response
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/questions",produces = {"application/json"})
    @ApiOperation(
            tags = {"search"},
            value = "Find all questions on \"stackoverflow\" which title is contain query"
    )
    public Mono<SearchResponse> findQuestions(
            @RequestParam(name = "search", required = false) String searchQuery,
            @RequestParam(name = "page", required = false, defaultValue = "1") Long page
    ) {
        SearchParameters parameters = getSearchParametersPrototype();
        if (searchQuery != null) {
            parameters.setSearchString(searchQuery);
        }
        if (page != null && page > 0L)  {
            parameters.setPage(page);
        }

        return Mono.just(searchService.searchQuestions(parameters));
    }

    /**
     * Lookup method to inject search parameters prototype to controller
     * @return search parameters
     */
    @Lookup("searchParameters")
    protected SearchParameters getSearchParametersPrototype() {
        return null;
    };
}
