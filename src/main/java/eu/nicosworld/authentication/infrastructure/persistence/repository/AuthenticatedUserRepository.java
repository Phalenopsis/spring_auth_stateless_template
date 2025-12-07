package eu.nicosworld.authentication.infrastructure.persistence.repository;

import eu.nicosworld.authentication.infrastructure.persistence.entity.AuthenticatedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticatedUserRepository extends JpaRepository<AuthenticatedUser, Long> {}
