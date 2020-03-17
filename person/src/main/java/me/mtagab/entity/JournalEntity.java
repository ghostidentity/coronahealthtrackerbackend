package me.mtagab.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "journal", schema = "person")
public class JournalEntity {

    @Column(name = "entry")
    private String entry;

    @Column(name = "userid")
    private Long userid;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdOn")
    private Date createdOn;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long journalId ;
}
