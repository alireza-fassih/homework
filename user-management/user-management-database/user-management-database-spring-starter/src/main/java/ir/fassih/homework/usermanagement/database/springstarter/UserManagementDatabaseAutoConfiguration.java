package ir.fassih.homework.usermanagement.database.springstarter;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration
@EntityScan(basePackages = {"ir.fassih.homework.core.database.entity", "ir.fassih.homework.usermanagement.database.entity"})
public class UserManagementDatabaseAutoConfiguration {

}
