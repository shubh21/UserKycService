package com.hexagonal.kyc.adapter.in.web.rest;

import com.hexagonal.kyc.application.command.SaveUserCommand;
import com.hexagonal.kyc.application.query.GetUserByIDQuery;
import com.hexagonal.kyc.application.service.CommandQueryHandler;
import com.hexagonal.kyc.domain.model.User;
import com.hexagonal.kyc.domain.ports.in.KycGetUserApiUseCase;
import com.hexagonal.kyc.domain.ports.in.KycSaveUserApiUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kyc")
public class KycController implements KycGetUserApiUseCase, KycSaveUserApiUseCase {

    private final CommandQueryHandler saveUserCommandHandler;
    private final CommandQueryHandler getUserByIdQueryHandler;

    public KycController(CommandQueryHandler saveUserCommandHandler, CommandQueryHandler getUserByIdQueryHandler) {
        this.saveUserCommandHandler = saveUserCommandHandler;
        this.getUserByIdQueryHandler = getUserByIdQueryHandler;
    }

    @Override
    @PostMapping("/onboard")
    public User save(User user){
        SaveUserCommand saveUserCommand = new SaveUserCommand(user.toBuilder().build());
        return saveUserCommandHandler.handle(saveUserCommand);
    }

    @Override
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String userId){
        GetUserByIDQuery getUserByIDQuery = new GetUserByIDQuery(userId);
        return getUserByIdQueryHandler.handle(getUserByIDQuery);
    }
}
