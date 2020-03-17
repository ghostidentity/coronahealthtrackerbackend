package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "request", schema = "hospital")
public class RequestEntity {

    @Column(name = "requestName")
    private String requestName;

    @Column(name = "description")
    private String description;

    @Column(name = "requestStatus")
    private String requestStatus;

    @Column(name = "requestedBy")
    private Integer requestedBy;

    @Column(name = "hospitalId")
    private Long hospitalId;

    @Column(name = "isFulfilled")
    private Boolean isFulfilled;

    @Temporal(TemporalType.DATE)
    @Column(name = "requestDate")
    private Date requestDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId ;
}
