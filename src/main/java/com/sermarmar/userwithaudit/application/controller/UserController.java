package com.sermarmar.userwithaudit.application.controller;

import com.sermarmar.userwithaudit.application.controller.resource.UserRequest;
import com.sermarmar.userwithaudit.domain.dto.UserDTO;
import com.sermarmar.userwithaudit.domain.usecase.UserCreateService;
import com.sermarmar.userwithaudit.domain.usecase.UserUpdateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@Slf4j
@RestController("/")
public class UserController {

    @Autowired
    private UserCreateService userCreateService;
    @Autowired
    private UserUpdateService userUpdateService;

    @PostMapping(value = "user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createUser(@RequestBody UserRequest request) {

        log.debug("Usuario recibido: {}", request.toString());

        UserDTO userDTO = new UserDTO().builder()
                .name(request.getName())
                .pass(request.getPass())
                .build();

        this.userCreateService.execute(userDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping(value = "user/{idUser}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateUser(
            @PathVariable(value = "idUser") UUID idUser,
            @RequestBody UserRequest request) {

        log.debug("Usuario recibido: {}", request.toString());

        UserDTO userDTO = new UserDTO().builder()
                .name(request.getName())
                .pass(request.getPass())
                .build();

        this.userUpdateService.execute(idUser, userDTO);

        return new ResponseEntity<>(HttpStatus.OK);

    }

    /*@RequestMapping(value = "user", method = RequestMethod.DELETE)
    public ResponseEntity<String> eliminarUsuarioYTodosSusProductos(@PathVariable(value = "idUsuario") Long idUsuario){
        gestionUsuarios.eliminarUsuario(idUsuario);
        return ResponseEntity.ok("Todo va bien...");
    }*/
}