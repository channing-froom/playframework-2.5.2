package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

@Entity
@Table(name="oauth")
public class Oauth extends Model {

    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    @Column(name="id")
    public Integer id;

    @Column(name="user_id", nullable = false)
    public Integer userId;

    @Column(name="application_type_id", nullable = false)
    public Integer applicationType;

    @Column(name="token", nullable = false)
    public String token;

    @Column(name="active")
    public Integer active;

    public static Finder<Integer, Oauth> find = new Finder<Integer,Oauth>(Oauth.class);

}
