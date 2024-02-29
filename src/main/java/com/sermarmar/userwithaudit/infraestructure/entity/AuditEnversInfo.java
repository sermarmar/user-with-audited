package com.sermarmar.userwithaudit.infraestructure.entity;

import com.sermarmar.userwithaudit.infraestructure.listener.UserRevisionListener;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Data
@Entity
@RevisionEntity(UserRevisionListener.class)
@Table(name = "env_audit_envers_info")
public class AuditEnversInfo extends DefaultRevisionEntity {

    private static final long serialVersionUID = -7604731515258123883L;

    @Column(name = "user_id")
    private String userId;

}