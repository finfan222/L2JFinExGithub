package ru.finex.ws.l2.model.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * @author m0nster.mind
 */
@Entity
@DiscriminatorValue("0")
public class InactiveClassComponentEntity extends ClassComponentEntity {
}
