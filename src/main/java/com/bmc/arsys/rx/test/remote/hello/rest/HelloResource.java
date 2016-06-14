package com.bmc.arsys.rx.test.remote.hello.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bmc.arsys.rx.test.remote.dto.descriptor.ActionOutput;
import com.bmc.arsys.rx.test.remote.hello.HelloRequest;

@Path(HelloResource.BASE_PATH)
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {
    public static final String BASE_PATH = "hello";
    public static final String SAY_HELLO_PATH = "sayHello";

    @POST
    @Path(HelloResource.SAY_HELLO_PATH)
    public ActionOutput createIssue(final HelloRequest request) {

        System.out.println("Received request to execute action");

        ActionOutput output = new ActionOutput() {
            {
                outputs.put("result", "THis is test remote connector -> " + request.inputs.summary);
            }
        };

        return output;

    }

}
