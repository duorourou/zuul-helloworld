package codes.walery.research;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZuulApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@RequestMapping("/foo")
	public String sayHello(final @RequestHeader("x-foo") String xfoo) {
		System.out.println(xfoo);

		return "Hello World";
	}
}
