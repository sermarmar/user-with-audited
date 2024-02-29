package com.sermarmar.userwithaudit.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Audited
@Entity
@Table(name = "usuario")
public class User {

    @Id
    private UUID idUser;

    @Column(name = "name",  columnDefinition = "VARCHAR(25)")
    private String name;

    @Column(name = "pass", columnDefinition = "VARCHAR(10)")
    private String pass;

}