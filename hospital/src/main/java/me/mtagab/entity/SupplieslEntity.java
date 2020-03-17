package me.mtagab.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "supplies", schema = "hospital")
public class SupplieslEntity {

    @Column(name = "itemName")
    private String itemName;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "used")
    private Integer used;

    @Column(name = "remaining")
    private Integer remaining;

    @Column(name = "hospitalId")
    private Integer hospitalId;

    @Temporal(TemporalType.DATE)
    @Column(name = "datedAdded")
    private Date datedAdded;

    @Temporal(TemporalType.DATE)
    @Column(name = "updatedOn")
    private Date updatedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId ;
}
