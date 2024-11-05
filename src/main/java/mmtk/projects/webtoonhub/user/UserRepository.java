package mmtk.projects.webtoonhub.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
* Author : Name 
* Created At : 05/11/2024, Nov ,07, 58
* Project Name : WebtoonHub 
**/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
