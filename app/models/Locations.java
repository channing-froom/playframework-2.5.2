package models;


import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
@Table(name = "locations")
public class Locations extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer id;

    @Constraints.Required
    @Column(name = "name", nullable = false, length = 150)
    public String name;

    @Constraints.Required
    @Column(name = "address", nullable = false, length = 350)
    public String address;

    @Column(name = "description", length = 255)
    public String description;

    @Constraints.Required
    @Column(name = "latitude", nullable = false)
    public String latitude;

    @Constraints.Required
    @Column(name = "longitude", nullable = false)
    public String longitude;

    public static Finder<Integer, Locations> find = new Finder<Integer,Locations>(Locations.class);

}
