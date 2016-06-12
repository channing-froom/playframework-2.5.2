package models;


import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Locations extends Model{

    @Id
    public Integer id;

    public String name;

    public static Finder<Integer, Locations> find = new Finder<Integer,Locations>(Locations.class);

}
