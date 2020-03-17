package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patients", schema = "hospital")
public class PatientsEntity {

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_no")
    private String contact_no;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "withReference")
    private Boolean withReference;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "dateAdmitted")
    private Date dateAdmitted;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId ;
}
