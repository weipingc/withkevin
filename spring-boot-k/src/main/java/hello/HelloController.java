package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Grabbed from https://spring.io/guides/gs/spring-boot/
@RestController
public class HelloController {
    private static String name = null;

    @RequestMapping("/")
    public String index() {
        System.out.println("Requested root");
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/kevin")
    public String kevin() {

        //System.out.println(name.length()+"Requested /kevin");
        return "<html><head><title>Greeting from Kevin</title></head><body><h1>Greetings from Kevin Chen!</h1><h2>Greetings from Kevin Chen!</h2><h3>Greetings from Kevin Chen!</h3></body></html>";
    }

    @RequestMapping("/getStudentsOfClass")
    public String getStudentsOfClass(int year) {

        //System.out.println(name.length()+"Requested /kevin");
        return "{\"firstName\":\"Kevin\"}";
    }

}
