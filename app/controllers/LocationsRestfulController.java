package controllers;


import models.Locations;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

public class LocationsRestfulController extends BaseRestfulController {

    /**
     * Returns a response of all locations
     * /api/v1/locations
     *
     * @author Channing Froom
     * @return
     */
    public Result getIndex() {

        if(!super.Authenticated()) {
            return unauthorized("Could not authenticate");
        }

        List<Locations> locations = Locations.find.all();

        if(locations.isEmpty()) {
            String response = "Could not find locations";
            return notFound(toJson(response));
        }

        return ok(toJson(locations));
    }

    /**
     * Returns a single result of a location
     *
     * @author Channing Froom
     * @param id
     * @return
     */
    public Result getLocationById(Integer id)
    {
        if(!super.Authenticated()) {
            return unauthorized("Could not authenticate");
        }

        Locations location = Locations.find.byId(id);

        if(location == null) {
            String response = "Could not find locations with ID ";
            response += id.toString();
            return notFound(toJson(response));
        }

        return ok(toJson(location));
    }

    /**
     * Returns multiple results matching the location name
     *
     * @author Channing Froom
     * @param locationName
     * @return
     */
    public Result getLocationbyName(String locationName)
    {
        if(!super.Authenticated()) {
            return unauthorized("Could not authenticate");
        }

        List<Locations> locations = Locations.findByName(locationName);

        if(locations.isEmpty()) {
            String response = "Could not find locations with name ";
            response += locationName;
            return notFound(toJson(response));
        }

        return ok(toJson(locations));
    }


}
