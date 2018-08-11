package com.sda;

import com.sda.model.Document;

import java.time.Instant;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        //builder
        //all args constructor
        Document document = new Document("Plan dnia",
                "Opis dnia szkoleniowego",
                "Tomasz Darowski",
                Instant.now(),
                Arrays.asList("długopis", "zeszyt", "laptop"));

        //setters
        Document documentBySetters = new Document();
        documentBySetters.setTitle("Plan Tygodnia");
        documentBySetters.setDescription("No nieźle");
        documentBySetters.setAuthor("Janusz Polak");
        documentBySetters.setCreationDate(Instant.now());
        documentBySetters.setItems(Arrays.asList("elo", "pozdro", "-_-"));

        //builder
        Document documentByBuilder = Document.builder().
                title("Plan zajęć").
                description("coś tam").
                creationDate(Instant.now()).
                items(Arrays.asList("beka", "yolo")).
                item("beka123").
                item("beka321").
                author("Tomasz Darowski").
                build();


        System.out.println("Hello World");
    }
}
