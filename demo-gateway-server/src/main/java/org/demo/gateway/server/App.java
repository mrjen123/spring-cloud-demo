package org.demo.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	/*@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
		PatternServiceRouteMapper p = new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)",
				"${version}/${name}");
		return p;
	}*/
}
