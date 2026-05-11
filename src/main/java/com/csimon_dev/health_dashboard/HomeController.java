package com.csimon_dev.health_dashboard; // our file's package. Has to match the folder it lives in

import org.springframework.web.bind.annotation.GetMapping; // Spring's web annotations
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant; //modern Java timestamps
import java.util.Map; // used to build a quick immutable map

@RestController // This is an annotation. It tells Spring that this class is an HTTP request handler, and whatever its methods
// return should be serialized to JSON and sent back as the response body
public class HomeController {

    @GetMapping("/") // this annotation tells Spring our home() method handles get requests from the "/" url
    public Map<String, Object> home() {
        return Map.of(
            "service", "Health Dashboard API",
            "status", "ok",
            "timestamp", Instant.now()
        );

    }

}
