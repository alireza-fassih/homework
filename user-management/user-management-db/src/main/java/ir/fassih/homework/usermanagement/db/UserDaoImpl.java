package ir.fassih.homework.usermanagement.db;


import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
class UserDaoImpl implements UserDao {

    private final EntityManager entityManager;



}
