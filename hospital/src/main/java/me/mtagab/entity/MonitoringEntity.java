package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "monitoring", schema = "hospital")
public class MonitoringEntity {

    @Column(name = "patientId")
    private Long patientId;

    @Column(name = "hospitalId")
    private Long hospitalId;

    @Column(name = "healthStatus")
    private String healthStatus;

    @Column(name = "patientStatus")
    private String patientStatus;

    @Column(name = "testResult")
    private String testResult;

    @Temporal(TemporalType.DATE)
    @Column(name = "dateAdded")
    private Date dateAdded;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long monitoringId ;
}

