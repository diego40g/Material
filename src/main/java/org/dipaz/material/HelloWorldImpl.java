
package org.dipaz.material;

import javax.jws.WebService;

@WebService(endpointInterface = "org.dipaz.material.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

