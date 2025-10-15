package com.david.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegistrationCodeRequest(@NotBlank @Email String email) {}

