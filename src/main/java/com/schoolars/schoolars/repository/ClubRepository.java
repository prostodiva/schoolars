package com.schoolars.schoolars.repository;
import com.schoolars.schoolars.entity.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<Club, Integer>{
    
}
