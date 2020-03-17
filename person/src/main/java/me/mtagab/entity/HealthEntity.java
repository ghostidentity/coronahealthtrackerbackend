package me.mtagab.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "health", schema = "person")
public class HealthEntity {

    @Column(name = "userId")
    private Long userId;

    @Column(name = "symptom")
    private String symptom;

    @Temporal(TemporalType.DATE)
    @Column(name = "addedOn")
    private Date addedOn;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalId ;
}
