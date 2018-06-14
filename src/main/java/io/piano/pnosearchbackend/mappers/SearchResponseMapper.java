package io.piano.pnosearchbackend.mappers;

import io.piano.pnosearchbackend.model.dto.SearchResponse;
import io.piano.pnosearchbackend.model.feign.SESearchResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * This class convert stack exchange response model to
 * corresponding DTO object.
 * @author Dmitry Mikhaylenko
 */

@Mapper(uses = {
        QuestionMapper.class
})
public interface SearchResponseMapper {
    /**
     * Mapper instance
     */
    SearchResponseMapper MAPPER = Mappers.getMapper(SearchResponseMapper.class);

    /**
     * Method which convert the stack exchange question model to DTO object
     * @param seSearchResponse stack exchange response model
     * @return DTO object
     */
    @Mappings({
            @Mapping(source = "items", target = "questions"),
            @Mapping(source = "hasMore", target = "hasMore")
    })
    SearchResponse toSearchResponse(SESearchResponse seSearchResponse);
}
