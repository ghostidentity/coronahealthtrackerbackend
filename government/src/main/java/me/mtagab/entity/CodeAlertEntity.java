package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "code_alert", schema = "government")
public class CodeAlertEntity {

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Column(name = "isLocal")
    private Boolean isLocal;

    @Column(name = "alert_level")
    private Integer alert_level;

    @Column(name = "updatedBy")
    private Integer updatedBy;

    @Column(name = "location")
    private String location;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId ;
}
