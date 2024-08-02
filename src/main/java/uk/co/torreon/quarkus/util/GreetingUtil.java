package uk.co.torreon.quarkus.util;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingUtil {
    @ConfigProperty(name="greeting.name", defaultValue = "Sue")
    String greetingName;

    public String getGreeting() {
        return "Hello " + greetingName;
    }
}
