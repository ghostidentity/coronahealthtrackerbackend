package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "admission_request", schema = "government")
public class AdmissionRequestEntity {

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.DATE)
    @Column(name = "requestedOn")
    private Date requestedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId ;
}
