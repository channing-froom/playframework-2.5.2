package models;


import play.db.ebean.Model;

import javax.persistence.*;

@Entity
@Table(name="locations")
public class Locations extends Model{

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    @Column(name="id")
    public Integer id;

    @Column(name="name", nullable = false)
    public String name;

    @Column(name="address")
    public String address;

    @Column(name="description")
    public String description;

    @Column(name="latitude", nullable = false)
    public Integer latitude;

    @Column(name="longitude", nullable = false)
    public Integer longitude;

    @Column(name="location_type_id", nullable = false)
    public Integer location_type_id;

}
