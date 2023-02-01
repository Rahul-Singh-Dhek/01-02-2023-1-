package com.googleKeep.Repository;

import com.googleKeep.Models.NotesModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepo extends MongoRepository<NotesModel,String> {

    @Query
    List<NotesModel> findByUserName(String userName);

    @Query
    List<NotesModel> findByTitle(String title);

    @Query
    void deleteByUserName(String empId);
}
