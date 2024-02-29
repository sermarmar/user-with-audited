package com.sermarmar.userwithaudit.domain.usecase;

import com.sermarmar.userwithaudit.domain.dto.UserDTO;
import com.sermarmar.userwithaudit.infraestructure.entity.User;
import com.sermarmar.userwithaudit.infraestructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCreateService {

    @Autowired
    private UserRepository userRepository;

    public void execute(UserDTO userDTO) {
        User user = new User().builder()
                .idUser(UUID.randomUUID())
                .name(userDTO.getName())
                .pass(userDTO.getPass())
                .build();

        this.userRepository.save(user);
    }

}
