package co.develhope.hellologging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String get() {
        logger.info("Received GET request");
        return "Hello World!";
    }
}
