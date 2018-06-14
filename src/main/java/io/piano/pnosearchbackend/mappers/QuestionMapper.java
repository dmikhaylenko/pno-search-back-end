package io.piano.pnosearchbackend.mappers;

import io.piano.pnosearchbackend.model.dto.Question;
import io.piano.pnosearchbackend.model.feign.SEQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuestionMapper {
    QuestionMapper MAPPER = Mappers.getMapper(QuestionMapper.class);
    @Mappings({
            @Mapping(source = "questionId", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "link", target = "reference"),
            @Mapping(source = "isAnswered", target = "isAnswered"),
            @Mapping(source = "creationDate", target = "created"),
            @Mapping(source = "owner.profileImage", target = "imageUrl"),
            @Mapping(source = "owner.displayName", target = "userName")
    })
    Question toQuestion(SEQuestion seQuestion);
}
