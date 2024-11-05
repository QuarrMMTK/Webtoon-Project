package mmtk.projects.webtoonhub.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Author : Name
 * Created At : 05/11/2024, Nov ,08, 02
 * Project Name : WebtoonHub
 **/
@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {
    Optional<Token> findByToken(String token);
}
