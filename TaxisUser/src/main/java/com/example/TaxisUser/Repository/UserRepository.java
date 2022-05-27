package com.example.TaxisUser.Repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  CrudRepository<User, Long> {
}
