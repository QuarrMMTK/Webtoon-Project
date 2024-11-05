package mmtk.projects.webtoonhub.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Author : Name
 * Created At : 05/11/2024, Nov ,08, 03
 * Project Name : WebtoonHub
 **/
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
