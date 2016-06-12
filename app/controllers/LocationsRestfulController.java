package controllers;


import com.avaje.ebean.Model;
import models.Locations;
import play.mvc.*;
import play.mvc.Result;
import views.html.index;

import java.util.List;

import static play.libs.Json.toJson;

public class LocationsRestfulController extends Controller {

    public Result getIndex() {

        //List<Locations> theLocations = Locations.find.all();
        List<Locations> locations = Locations.find.all();

        return ok(toJson(locations));
    }


}
