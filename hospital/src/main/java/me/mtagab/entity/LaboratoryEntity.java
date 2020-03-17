package me.mtagab.entity;

import javax.persistence.*;

@Entity
@Table(name = "laboratory", schema = "hospital")
public class LaboratoryEntity {

    @Column(name = "address")
    private String address;

    @Column(name = "labName")
    private String labName;

    @Column(name = "labType")
    private String labType;

    @Column(name = "isOperational")
    private Boolean isOperational;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laboratoryId ;
}
