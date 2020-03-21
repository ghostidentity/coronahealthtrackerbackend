package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "credentials", schema = "authentication")
public class CredentialsEntity {

    @Column(name = "address")
    private String address;

    @Column(name = "password")
    private String password;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "rolesId")
    private Integer rolesId;

    @Temporal(TemporalType.DATE)
    @Column(name = "registeredOn")
    private Date registeredOn;

    @Column(name = "status")
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId ;
}
