package com.googleKeep.Service;

import com.googleKeep.Models.NotesModel;
import com.googleKeep.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    @Autowired
    private UserRepo db;

    public NotesModel create(NotesModel obj){
        return db.save(obj);
    }

    public List<NotesModel> getbyUserName(String UserName){
        return db.findByUserName(UserName);
    }

    public List<NotesModel> getbyTitle(String UserName){
        return db.findByTitle(UserName);
    }

    public NotesModel updatebyId(String Id,String Content){
          Optional<NotesModel> saved=db.findById(Id);
          saved.get().setContent(Content);
          return db.save(saved.get());
    }

}
