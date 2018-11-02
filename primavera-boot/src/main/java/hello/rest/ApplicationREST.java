package hello.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://spring.io/guides/gs/rest-service/
 * https://github.com/spring-projects/spring-boot/blob/v2.0.3.RELEASE/spring-boot-project/spring-boot-dependencies/pom.xml
 */
@SpringBootApplication
public class ApplicationREST {

  public static void main(String args[]) {
    SpringApplication.run(ApplicationREST.class, args);
  }

}