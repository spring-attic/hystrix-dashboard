package hystrixdashboard;

import hystrixdashboard.stream.MockStreamServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sgibb on 7/11/14.
 */
@Controller
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardApplication {

	@RequestMapping("/")
	public String home() {
		return "forward:/hystrix";
	}

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean mockStreamServlet() {
		return new ServletRegistrationBean(new MockStreamServlet(), "/mock.stream");
	}

}
