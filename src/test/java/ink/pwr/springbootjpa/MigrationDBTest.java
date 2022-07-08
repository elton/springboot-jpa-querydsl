package ink.pwr.springbootjpa;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MigrationDBTest {

  @Autowired
  private Flyway flyway;

  @Test
  void initDB(){
    // Start the migration
    flyway.migrate();
  }
}
