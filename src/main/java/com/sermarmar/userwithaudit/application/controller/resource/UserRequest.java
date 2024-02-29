package com.sermarmar.userwithaudit.application.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private Long idUsuario;

    @NonNull
    private String name;

    @NonNull
    private String pass;

}