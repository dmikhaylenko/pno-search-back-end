package io.piano.pnosearchbackend.feign;

import feign.Param;
import feign.RequestLine;
import io.piano.pnosearchbackend.model.feign.SESearchResponse;


public interface StackExchangeFeignClient {
    @RequestLine("GET /search/advanced?intitle={intitle}&site={site}&pagesize={pagesize}&page={page}&sort={sort}&order={order}")
    SESearchResponse search(
            @Param("intitle") String searchString,
            @Param("site") String site,
            @Param("pagesize") Long pageSize,
            @Param("page") Long page,
            @Param("sort") String sort,
            @Param("order") String order
    ) throws Exception;
}
