package com.r4jrk.exchangerates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO: Add Swagger, Add cachowanie w mongodb (ale też w springu kalkulacje), Add reklamy, Add sugestie featurów, Add kontakt, Add legal,
// Add drukowanie (optional, możę kiedyś)

// package com.github.gdl;

// import io.swagger.v3.oas.annotations.OpenAPIDefinition;
// import io.swagger.v3.oas.annotations.info.Info;
// import io.swagger.v3.oas.annotations.info.License;

// @OpenAPIDefinition(
//         info = @Info(
//                 title = "Direct print service",
//                 description = "Direct print to client local printer API Documentation",
//                 version = "v0.0.1",
//                 license = @License(
//                         name = "Apache License Version 2.0",
//                         url = "https://www.apache.org/licenses/LICENSE-2.0"
//                 )
//         )
// )
// public class OpenAPIConfig {
// }

// https://github.com/thawat-th/direct-print-service/blob/master/src/main/java/com/github/gdl/DirectPrintController.java

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
