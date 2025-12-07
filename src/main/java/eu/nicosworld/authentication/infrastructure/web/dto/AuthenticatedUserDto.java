package eu.nicosworld.authentication.infrastructure.web.dto;

import eu.nicosworld.authentication.infrastructure.persistence.entity.AuthenticatedUser;

public record AuthenticatedUserDto(String username) {
    public static AuthenticatedUserDto mapFromEntity(AuthenticatedUser user) {
        return new AuthenticatedUserDto(user.getUser().getUsername());
    }
}
