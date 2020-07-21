package ir.fassih.homework.core.database.springstarter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EntityScan(basePackages = "ir.fassih.homework.core.database.entity")
@ComponentScan(basePackages = "ir.fassih.homework.core.database")
public class CoreDatabaseAutoConfiguration {


    public CoreDatabaseAutoConfiguration() {
        log.info("Starting CoreDatabaseAutoConfiguration ....");
    }

}
