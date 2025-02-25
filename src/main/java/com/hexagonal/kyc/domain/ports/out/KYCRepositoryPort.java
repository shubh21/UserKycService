package com.hexagonal.kyc.domain.ports.out;

import com.hexagonal.kyc.domain.model.User;

import java.util.Optional;

public interface KYCRepositoryPort {

    User save(User user);
    Optional<User> findById(String id);
}
