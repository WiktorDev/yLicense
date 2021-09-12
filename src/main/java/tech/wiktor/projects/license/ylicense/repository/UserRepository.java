package tech.wiktor.projects.license.ylicense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.wiktor.projects.license.ylicense.model.License;
import tech.wiktor.projects.license.ylicense.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}