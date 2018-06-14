package io.piano.pnosearchbackend.feign;

import feign.Param;
import feign.RequestLine;
import io.piano.pnosearchbackend.model.feign.SESearchResponse;
/**
 * This class is client of Stack Exchange API
 * @author Dmitry Mikhaylenko
 */
public interface StackExchangeFeignClient {
    /**
     * This method call Stack Exchange API search method
     * @param searchString search query string
     * @param site site which in will be perform search
     * @param pageSize result page size
     * @param page current page
     * @param sort result sort type
     * @param order result ordering
     * @return
     * @throws Exception
     */
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
