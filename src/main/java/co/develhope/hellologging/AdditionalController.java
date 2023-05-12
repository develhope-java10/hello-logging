package co.develhope.hellologging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("additional")
public class AdditionalController {
    private Logger logger = LoggerFactory.getLogger(AdditionalController.class);

    private AdditionalService service;

    public AdditionalController(AdditionalService service) {
        this.service = service;
    }

    @GetMapping
    public String get() {
        logger.info("Received GET request");
        return "Additional message";
    }

    @PostMapping("/{name}")
    public ResponseEntity<String> echo(@PathVariable("name") String name) {
        logger.info("Received POST request");

        try {
            String message = service.echoMessage(name);
            logger.debug("Successful request handling");
            return ResponseEntity.ok().body(message);
        } catch(RuntimeException e) {
            logger.error(name, e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
