package eu.nicosworld.authentication.domain.authenticatedUser;

import eu.nicosworld.authentication.authentication.UserRepository;
import eu.nicosworld.authentication.authentication.model.User;
import eu.nicosworld.authentication.infrastructure.persistence.entity.AuthenticatedUser;
import eu.nicosworld.authentication.infrastructure.persistence.repository.AuthenticatedUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthenticatedUserService {
    private final AuthenticatedUserRepository authenticatedUserRepository;
    private final UserRepository userRepository;

    public AuthenticatedUserService(
            AuthenticatedUserRepository authenticatedUserRepository, UserRepository userRepository) {
        this.authenticatedUserRepository = authenticatedUserRepository;
        this.userRepository = userRepository;
    }

    public AuthenticatedUser findByUser(UserDetails userDetails) {
        User user = userRepository.findByEmail(userDetails.getUsername()).orElseThrow();
        return authenticatedUserRepository.findById(user.getId()).orElseThrow();
    }
}
