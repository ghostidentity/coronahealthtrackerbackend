package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "public_advisory", schema = "government")
public class PublicAdvisoryEntity {

    @Column(name = "advisory")
    private String advisory;

    @Column(name = "createdBy")
    private Long createdBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdOn")
    private Date createdOn;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisoryId ;
}
