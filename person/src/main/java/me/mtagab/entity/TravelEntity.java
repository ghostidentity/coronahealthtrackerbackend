package me.mtagab.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "travel", schema = "person")
public class TravelEntity {

    @Column(name = "userId")
    private Long userId;

    @Column(name = "location")
    private String location;

    @Column(name = "country")
    private String country;

    @Temporal(TemporalType.DATE)
    @Column(name = "travelDate")
    private Date travelDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long travelId ;
}
