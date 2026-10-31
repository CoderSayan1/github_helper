package com.github.backend.service;

import com.github.backend.entity.User;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface UserService {
    User requiredById(UUID id);
    String decryptAccessToken(User user);
    User upsertFromGithub(Map<String, Object> attributes, String accessToken, String scopes);
}
