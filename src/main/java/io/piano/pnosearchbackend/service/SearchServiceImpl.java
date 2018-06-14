package io.piano.pnosearchbackend.service;

import io.piano.pnosearchbackend.feign.StackExchangeFeignClient;
import io.piano.pnosearchbackend.mappers.SearchResponseMapper;
import io.piano.pnosearchbackend.model.dto.SearchResponse;
import io.piano.pnosearchbackend.model.feign.SESearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Search service implementation
 * @author Dmitry Mikhaylenko
 */

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private StackExchangeFeignClient stackExchangeFeignClient;

    @Override
    public SearchResponse searchQuestions(SearchParameters parameters) {
        SESearchResponse searchResponse = null;
        try {
            searchResponse = this.stackExchangeFeignClient.search(
                    parameters.getSearchString(),
                    parameters.getSite(),
                    parameters.getPageSize(),
                    parameters.getPage(),
                    parameters.getSort(),
                    parameters.getOrder()
            );
        } catch (Exception e) {
            searchResponse = new SESearchResponse();
            searchResponse.setItems(new ArrayList<>());
            searchResponse.setHasMore(false);
        }
        
        return SearchResponseMapper.MAPPER.toSearchResponse(searchResponse);
    }

}
