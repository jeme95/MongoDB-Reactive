package com.example.demo.buch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Buch")
public class Buch {
    @Id
    private String id;
    private String homepage;
    private String isbn;
    private String datum;

    private boolean lieferbar;

    private double rabatt;
    private double preis;


    private String verlag;
    private String art;

    private int rating;
    private String titel;


}
