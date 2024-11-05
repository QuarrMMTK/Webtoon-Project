package mmtk.projects.webtoonhub.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;
import java.util.Set;

/**
 * Author : Min Myat Thu Kha
 * Created At : 05/11/2024, Nov ,09, 02
 * Project Name : WebtoonHub
 **/
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExceptionResponse {

    private Integer businessErrorCode;
    private String businessExceptionDescription;
    private String error;
    private Set<String> validationErrors;
    private Map<String, String> errors;

}
