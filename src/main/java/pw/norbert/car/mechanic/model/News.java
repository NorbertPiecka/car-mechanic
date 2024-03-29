package pw.norbert.car.mechanic.model;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date date;
    private String name;
    private String description;
    private String photo;
    @Column(name = "photo_alt")
    private String photoAlt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoAlt() {
        return photoAlt;
    }

    public void setPhotoAlt(String photoAlt) {
        this.photoAlt = photoAlt;
    }
}
