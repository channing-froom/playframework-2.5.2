package controllers;


import models.Locations;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

public class LocationsRestfulController extends BaseRestfulController {

    public Result getIndex() {

        if(!super.Authenticated()) {
            return unauthorized("Could not authenticate");
        }

        List<Locations> locations = Locations.find.all();

        return ok(toJson(locations));
    }

    public Result getIndex(int locationId)
    {
        if(!super.Authenticated()) {
            return unauthorized("Could not authenticate");
        }

        return ok(toJson("hello world"));
    }

    public Result getLocationbyName(String locationName)
    {
        if(!super.Authenticated()) {
            return unauthorized("Could not authenticate");
        }

        return ok(toJson("Hello world 2"));
    }


}
