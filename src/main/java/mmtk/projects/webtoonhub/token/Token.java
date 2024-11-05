package mmtk.projects.webtoonhub.token;

import jakarta.persistence.*;
import lombok.*;
import mmtk.projects.webtoonhub.user.User;

import java.time.LocalDateTime;

/**
 * Author : Name
 * Created At : 05/11/2024, Nov ,08, 01
 * Project Name : WebtoonHub
 **/
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    private LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
