package com.hexagonal.kyc.application.command;

import com.hexagonal.kyc.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SaveUserCommand{
    private User user;
}
