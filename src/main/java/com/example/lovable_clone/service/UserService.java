package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.auth.ProfileResponse;

public interface UserService {

    ProfileResponse getProfile(Long userId);
}
