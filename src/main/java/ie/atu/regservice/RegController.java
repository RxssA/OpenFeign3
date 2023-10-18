package ie.atu.regservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegController {
    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        return String.format("Received details: %s + %s", userDetails.getEmail(), userDetails.getEmail());
    }
}
