package com.bmc.arsys.rx.test.remote.hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HelloConnectionInstance {

    public String login;
    public String password;
}
