package ch.jstollutions.primaveradata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://dzone.com/articles/spring-boot-and-spring-jdbc-with-h2<br>
 * https://springframework.guru/configuring-spring-boot-for-oracle/
 * 
 * access in memory DB console at http://localhost:8080/h2-console
 */
@SpringBootApplication
public class PrimaveraDataApplication implements CommandLineRunner {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  StudentJdbcRepository studenJdbcRepository;

  public static void main(String[] args) {
    SpringApplication.run(PrimaveraDataApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    logger.info("Student id 10001 -> {}", studenJdbcRepository.findById(10001L));
    logger.info("All users 1 -> {}", studenJdbcRepository.findAll());
    logger.info("Inserting -> {}", studenJdbcRepository.insert(new Student(10010L, "John", "A1234657")));
    logger.info("Update 10001 -> {}", studenJdbcRepository.update(new Student(10001L, "Name-Updated", "New-Passport")));
    studenJdbcRepository.deleteById(10002L);
    logger.info("All users 2 -> {}", studenJdbcRepository.findAll());
  }
}
