package com.schoolars.schoolars.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolars.schoolars.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

    String[] users = {"Harry", "Potter", "potter@gmail.com", "potter5@"};

}
