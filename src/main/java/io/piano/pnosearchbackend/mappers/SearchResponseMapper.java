package io.piano.pnosearchbackend.mappers;

import io.piano.pnosearchbackend.model.dto.SearchResponse;
import io.piano.pnosearchbackend.model.feign.SESearchResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        QuestionMapper.class
})
public interface SearchResponseMapper {
    SearchResponseMapper MAPPER = Mappers.getMapper(SearchResponseMapper.class);

    @Mappings({
            @Mapping(source = "items", target = "questions"),
            @Mapping(source = "hasMore", target = "hasMore")
    })
    SearchResponse toSearchResponse(SESearchResponse seSearchResponse);
}
