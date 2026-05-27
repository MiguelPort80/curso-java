package dev.miguel.security.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequest(@NotEmpty String name, @NotEmpty String email, @NotEmpty String password) {

}
