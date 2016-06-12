package models;


import com.avaje.ebean.Model;

import javax.persistence.*;

@Entity
@Table(name="location_types")
public class LocationTypes extends Model {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    @Column(name="id")
    public Integer id;

    @Column(name="label", nullable = false, unique = true)
    public String label;

    @Column(name="slug", nullable = false, unique = true)
    public String slug;

    @Column(name="description")
    public String description;

    public static Finder<Integer, LocationTypes> find = new Finder<Integer,LocationTypes>(LocationTypes.class);
}
