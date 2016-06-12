package models;


import com.avaje.ebean.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users extends Model {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    @Column(name="id")
    public Integer id;

    @Column(name="user_type_id", nullable = false)
    public Integer user_type_id;

    @Column(name="first_name", nullable = false)
    public String first_name;

    @Column(name="last_name", nullable = false)
    public String last_name;

    @Column(name="email", unique = true)
    public String email;

    public static Finder<Integer, Locations> find = new Finder<Integer,Locations>(Locations.class);
}
