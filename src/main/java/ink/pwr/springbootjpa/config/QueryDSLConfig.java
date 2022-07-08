package ink.pwr.springbootjpa.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueryDSLConfig {

  @Bean
  Flyway flyway() {
    return Flyway.configure().dataSource("jdbc:mysql://localhost:3306/querydsl?useUnicode=true&character_set_server=utf8mb4&useSSL=false&timezone=Asia/Shanghai", "root", "").load();
  }
}
