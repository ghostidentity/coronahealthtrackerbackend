package me.mtagab.entity;

import javax.persistence.*;

@Entity
@Table(name = "hospital", schema = "hospital")
public class HospitalEntity {

    @Column(name = "hospitalName")
    private String hospitalName;

    @Column(name = "hospitalType")
    private String hospitalType;

    @Column(name = "address")
    private String address;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalId ;
}
