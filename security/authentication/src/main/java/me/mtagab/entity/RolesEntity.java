package me.mtagab.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles", schema = "authentication")
public class RolesEntity {

    @Column(name = "scopes")
    private String scopes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolesId ;
}
