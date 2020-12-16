package ua.lviv.lgs.periodacals.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;


public enum UserRole {
    ADMINISTRATOR,USER_ROLE;
}
