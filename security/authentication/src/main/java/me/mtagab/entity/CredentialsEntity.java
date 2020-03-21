package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "credentials", schema = "authentication")
public class CredentialsEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "rolesId")
    private Integer rolesId;

    @Column(name = "isActivated")
    private boolean isActivated;

    @Temporal(TemporalType.DATE)
    @Column(name = "registeredOn")
    private Date registeredOn;

    @Column(name = "status")
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId ;
}
