package me.mtagab.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "photos", schema = "public")
public class PhotosEntity {

    @Column(name = "photo")
    private String photo;

    @Column(name = "userId")
    private Integer userId;

    @Temporal(TemporalType.DATE)
    @Column(name = "uploadedOn")
    private Date uploadedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long photoId ;
}
