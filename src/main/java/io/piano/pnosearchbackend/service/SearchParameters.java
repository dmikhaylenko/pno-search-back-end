package io.piano.pnosearchbackend.service;

import lombok.Getter;
import lombok.Setter;

/**
 * Search parameters
 * @author Dmitry Mikhaylenko
 */
@Getter
@Setter
public class SearchParameters {
    /**
     * Site for searching
     */
    private String site;
    /**
     * Sorting type
     */
    private String sort;
    /**
     * Ordering
     */
    private String order;
    /**
     * Search query string
     */
    private String searchString;
    /**
     * Page size
     */
    private Long pageSize;
    /**
     * Page number
     */
    private Long page;

    /**
     * Search parameter constructor
     * @param site Site for searching
     * @param pageSize Page size
     * @param sort Sorting type
     * @param order Ordering
     */
    public SearchParameters(String site, Long pageSize, String sort, String order) {
        this.site = site;
        this.pageSize = pageSize;
        this.sort = sort;
        this.order = order;
        this.searchString = "";
        this.page = 1L;
    }
}
