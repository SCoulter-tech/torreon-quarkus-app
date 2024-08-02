package uk.co.torreon.quarkus;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import uk.co.torreon.quarkus.util.GreetingUtil;

@QuarkusMain
public class QuarkusApp implements QuarkusApplication {

    GreetingUtil greetingUtil;

    public QuarkusApp(GreetingUtil greetingUtil) {
        super();
        this.greetingUtil = greetingUtil;
    }
    @Override
    public int run(String... args) throws Exception {
        System.out.println(this.greetingUtil.getGreeting());
        return 0;
    }
}
