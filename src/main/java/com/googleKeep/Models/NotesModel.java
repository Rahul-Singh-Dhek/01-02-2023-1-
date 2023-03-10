package com.googleKeep.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Notes")
public class NotesModel {
    @Id
    private String id;
    @Indexed(unique = true)
    private String userName;
    private String title;
    private String content;

}
