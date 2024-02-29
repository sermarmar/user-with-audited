package com.sermarmar.userwithaudit.domain.usecase;

import com.sermarmar.userwithaudit.domain.dto.UserDTO;
import com.sermarmar.userwithaudit.infraestructure.entity.User;
import com.sermarmar.userwithaudit.infraestructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserUpdateService {

    @Autowired
    private UserRepository userRepository;

    public void execute(UUID userId, UserDTO userDTO) {
        User user = new User().builder()
                .idUser(userId)
                .name(userDTO.getName())
                .pass(userDTO.getPass())
                .build();

        this.userRepository.saveAndFlush(user);
    }

}
