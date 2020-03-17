package me.mtagab.entity;

import javax.persistence.*;

@Entity
@Table(name = "rooms", schema = "hospital")
public class RoomsEntity {

    @Column(name = "roomName")
    private String roomName;

    @Column(name = "description")
    private String description;

    @Column(name = "isOccupied")
    private Boolean isOccupied;

    @Column(name = "isOperational")
    private Boolean isOperational;

    @Column(name = "hospitalId")
    private Long hospitalId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId ;
}
