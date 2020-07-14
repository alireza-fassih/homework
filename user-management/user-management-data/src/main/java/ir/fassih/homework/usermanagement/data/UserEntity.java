package ir.fassih.homework.usermanagement.data;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name = "USERS")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;


}
