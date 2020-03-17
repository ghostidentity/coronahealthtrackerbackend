package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "travel_local_alert", schema = "government")
public class TravelAlertLocalEntity {

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Column(name = "alert_level")
    private Integer alert_level;

    @Column(name = "location")
    private String location;

    @Column(name = "createdBy")
    private  Long createdBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdOn")
    private Date createdOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long travelId ;
}
