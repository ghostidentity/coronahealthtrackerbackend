package me.mtagab.entity;

import javax.persistence.*;

@Entity
@Table(name = "workers", schema = "hospital")
public class WorkersEntity {

    @Column(name = "workerName")
    private Boolean workerName;

    @Column(name = "workRole")
    private String workRole;

    @Column(name = "status")
    private String status;

    @Column(name = "hospitalId")
    private Integer hospitalId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workerId ;
}
