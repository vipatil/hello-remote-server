package com.bmc.arsys.rx.test.remote.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class TopResource {

    @GET
    public String hello() {
        return "Remote JIRA Connector";
    }
}
