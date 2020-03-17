package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quarantine", schema = "hospital")
public class QuarantineEntity {

    @Column(name = "patientId")
    private Long patientId;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "status")
    private String status;

    @Column(name = "isTested")
    private Boolean isTested;

    @Column(name = "isInfected")
    private Boolean isInfected;

    @Column(name = "isAsymptomatic")
    private Boolean isAsymptomatic;

    @Temporal(TemporalType.DATE)
    @Column(name = "quarantineDate")
    private Date quarantineDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quarantineId ;
}
