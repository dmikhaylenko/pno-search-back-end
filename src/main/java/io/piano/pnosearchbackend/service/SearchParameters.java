package io.piano.pnosearchbackend.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchParameters {
    private String site;
    private String sort;
    private String order;
    private String searchString;
    private Long pageSize;
    private Long page;

    public SearchParameters(String site, Long pageSize, String sort, String order) {
        this.site = site;
        this.pageSize = pageSize;
        this.sort = sort;
        this.order = order;
        this.searchString = "";
        this.page = 1L;
    }
}
