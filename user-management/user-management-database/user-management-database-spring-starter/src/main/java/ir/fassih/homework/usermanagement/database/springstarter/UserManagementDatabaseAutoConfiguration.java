package ir.fassih.homework.usermanagement.database.springstarter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EntityScan(basePackages = {"ir.fassih.homework.core.database.entity", "ir.fassih.homework.usermanagement.database.entity"})
public class UserManagementDatabaseAutoConfiguration {

    public UserManagementDatabaseAutoConfiguration() {
        log.info("Starting UserManagementDatabaseAutoConfiguration ....");
    }
}
