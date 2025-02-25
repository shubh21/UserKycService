package com.hexagonal.kyc.domain.ports.in;

import com.hexagonal.kyc.domain.model.User;

public interface KycSaveUserApiUseCase {
    User save(User user);
}
