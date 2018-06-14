package io.piano.pnosearchbackend.mappers;

import io.piano.pnosearchbackend.model.dto.Question;
import io.piano.pnosearchbackend.model.feign.SEQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * This class convert stack exchange question model to
 * corresponding DTO object.
 * @author Dmitry Mikhaylenko
 */
@Mapper
public interface QuestionMapper {
    /**
     * Mapper instance
     */
    QuestionMapper MAPPER = Mappers.getMapper(QuestionMapper.class);

    /**
     * Method which convert the stack exchange question model to DTO object
     * @param seQuestion stack exchange question model
     * @return DTO object
     */
    @Mappings({
            @Mapping(source = "questionId", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "link", target = "reference"),
            @Mapping(source = "isAnswered", target = "isAnswered"),
            @Mapping(source = "creationTimeStamp", target = "created"),
            @Mapping(source = "owner.profileImage", target = "imageUrl"),
            @Mapping(source = "owner.displayName", target = "userName")
    })
    Question toQuestion(SEQuestion seQuestion);
}
