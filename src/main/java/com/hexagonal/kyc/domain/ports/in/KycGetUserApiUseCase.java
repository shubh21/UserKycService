package com.hexagonal.kyc.domain.ports.in;

import com.hexagonal.kyc.domain.model.User;

public interface KycGetUserApiUseCase {
    User getUserById(String id);
}
