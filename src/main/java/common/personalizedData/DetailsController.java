package common.personalizedData;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
    @PostMapping("/hello")
    public String test() {
        return "hello";
    }
}
