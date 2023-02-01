package com.googleKeep.Contollers;

import com.googleKeep.Models.NotesModel;
import com.googleKeep.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {


    @Autowired
    private userService service;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody NotesModel obj){
        return ResponseEntity.status(HttpStatus.OK).body(service.create(obj));
    }

    @GetMapping("/note/get/{userName}")
    public ResponseEntity<?> getNotesByUserName(@PathVariable String userName){
        System.out.println("Username-->"+userName);
        return ResponseEntity.status(HttpStatus.OK).body(service.getbyUserName(userName));
    }

    @GetMapping("/note/title/{title}")
    public ResponseEntity<?> getNotesByTitle(@PathVariable String title){
        return ResponseEntity.status(HttpStatus.OK).body(service.getbyTitle(title));
    }

    @PutMapping("/note/update/{id}")
    public ResponseEntity<?> updateNotes(@PathVariable String id ,@RequestBody NotesModel obj ){
        return ResponseEntity.status(HttpStatus.OK).body(service.updatebyId(id,obj.getContent()));
    }




}
