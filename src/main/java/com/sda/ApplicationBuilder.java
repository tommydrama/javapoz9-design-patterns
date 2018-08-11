package com.sda;

import com.sda.model.Document;
import com.sda.model.DocumentLombok;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

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

        Document.builder(documentByBuilder).author("Janusz Cebula").build();

        DocumentLombok build = DocumentLombok.builder().
                author("Pioter").
                description("ejojojo").
                build();

        List<String> items = Arrays.asList("Ala", "ma", "kota");
        String result = "";
        for (String item : items) {
            result += item + ' ';}

            //tak robić
            StringBuilder stringBuilder = new StringBuilder();


            for (String item : items) {
                stringBuilder.append(item).append(" ");}

                String message = stringBuilder.toString();
                System.out.println(message);
            }
        }



