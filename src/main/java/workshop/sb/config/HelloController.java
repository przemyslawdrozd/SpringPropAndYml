package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // TODO 4 zdefiniuj pola hello, bar, foo, wstrzyknij do nich wartości używając @Value

    @Value("${custom.hello}")
    private String hello;

    @Value("${custom.bar}")
    private String bar;

    @Value("${custom.foo}")
    private String foo;

    // TODO 5 utwórz metodę obsługującą GET, "/hello"

    @RequestMapping("/hello")
    public String getHello(){
        return hello;
    }

    // TODO 7 utwórz metodę obsługującą GET, "/bar"

    @RequestMapping("/bar")
    public String getBar(){
        return bar;
    }

    // TODO 9 utwórz metodę obsługującą GET, "/foo"
    @RequestMapping("/foo")
    public String getFoo(){
        return foo;
    }
}


