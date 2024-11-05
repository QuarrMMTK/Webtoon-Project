package mmtk.projects.webtoonhub.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Author : Name
 * Created At : 05/11/2024, Nov ,08, 32
 * Project Name : WebtoonHub
 **/
@Getter
@Setter
@Builder
public class AuthenticationResponse {
    private String token;
}
