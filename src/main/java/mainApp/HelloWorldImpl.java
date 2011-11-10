
package mainApp;

import javax.jws.WebService;

@WebService(endpointInterface = "mainApp.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

