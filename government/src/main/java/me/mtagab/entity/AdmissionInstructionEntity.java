package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "admission_instruction", schema = "government")
public class AdmissionInstructionEntity {

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "contactPerson")
    private String contactPerson;

    @Column(name = "pickupLocation")
    private String pickupLocation;

    @Column(name = "status")
    private String status;

    @Column(name = "validatedBy")
    private Integer validatedBy;

    @Column(name = "requestedOn")
    private Date requestedOn;

    @Column(name = "pickupDateTime")
    private Date pickupDateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instructionId ;
}
