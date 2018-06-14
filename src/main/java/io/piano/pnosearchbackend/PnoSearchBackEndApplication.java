package io.piano.pnosearchbackend;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import io.piano.pnosearchbackend.feign.StackExchangeFeignClient;
import io.piano.pnosearchbackend.service.SearchParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.reactive.config.EnableWebFlux;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Dmitry Mikhaylenko
 */
@EnableWebFlux
@EnableSwagger2
@SpringBootApplication
public class PnoSearchBackEndApplication {
	public static void main(String[] args) {
		SpringApplication.run(PnoSearchBackEndApplication.class, args);
	}

	/**
	 * Stach exchange client bean
	 * @return stack exchange client
	 */
	@Bean
	public StackExchangeFeignClient stackExchangeFeignClient() {
		return Feign
				.builder()
				.encoder(new JacksonEncoder())
				.decoder(new JacksonDecoder())
				.client(new OkHttpClient())
				.target(StackExchangeFeignClient.class, "http://api.stackexchange.com/2.2");
	}

	/**
	 * Search parameters prototype bean
	 * @return search parameters prototype
	 */
	@Bean
	@Scope("prototype")
	public static SearchParameters searchParameters() {
		return new SearchParameters(
				"stackoverflow",
				100L,
				"creation",
				"desc"
		);
	}

	/**
	 * Swagger 2 documentation plugin bean
	 * @return documentation plugin
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
				.build();
	}
}
