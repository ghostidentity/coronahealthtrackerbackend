package me.mtagab.entity;

import javax.persistence.*;

@Entity
@Table(name = "government", schema = "account")
public class GovernmentEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "contact_no")
    private String contact_no;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "nationality")
    private String nationality;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "governmentid")
    private Long governmentId ;

}
