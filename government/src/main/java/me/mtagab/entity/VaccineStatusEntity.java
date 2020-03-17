package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vaccine_status", schema = "government")
public class VaccineStatusEntity {

    @Column(name = "vaccineName")
    private String vaccineName;

    @Column(name = "vaccineDescription")
    private String vaccineDescription;

    @Column(name = "vaccineStage")
    private String vaccineStage;

    @Column(name = "isAvailable")
    private Boolean isAvailable;

    @Column(name = "createdBy")
    private Long createdBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdOn")
    private Date createdOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vaccineId ;
}
