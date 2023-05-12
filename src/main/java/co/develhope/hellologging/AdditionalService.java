package co.develhope.hellologging;

import org.springframework.stereotype.Service;

@Service
public class AdditionalService {
    public String echoMessage(String name) {
        if(name == null || name.isBlank()) {
            throw new RuntimeException("Name cannot be blank");
        }
        return "Echo message: " + name;
    }
}
