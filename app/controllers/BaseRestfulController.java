package controllers;

import models.Oauth;
import play.mvc.Controller;

public class BaseRestfulController extends Controller {

    /**
     * Constant for authentication
     */
    private static final int OathTokenActive = 1;

    /**
     * Checks if the token provided is saved.
     * Collects the heading token, Compares it against the DB records.
     * WARNING : this is not a production method.
     * TODO : Compare vs user, Pass token securely to avoid SQL injection
     *
     * @author Channing Froom
     * @return
     */
    protected Boolean Authenticated()
    {
        String OauthToken = request().getHeader("token");

        if (OauthToken == null || OauthToken.isEmpty()) {
            return false;
        }

        Oauth token = Oauth
                .find
                .where()
                .eq("token", OauthToken)
                .eq("active", OathTokenActive)
                .findUnique();

        if (token != null) {
            return  true;
        }

        return false;

    }

}
