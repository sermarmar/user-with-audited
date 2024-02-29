package com.sermarmar.userwithaudit.infraestructure.listener;

import com.sermarmar.userwithaudit.infraestructure.entity.AuditEnversInfo;
import org.hibernate.envers.RevisionListener;

public class UserRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        AuditEnversInfo auditEnversInfo = (AuditEnversInfo) revisionEntity;
        auditEnversInfo.setUserId("Prueba");
    }

}