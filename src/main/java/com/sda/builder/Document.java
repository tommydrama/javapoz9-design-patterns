package com.sda.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Document {

    private String title;
    private String description;
    private String author;
    private Instant creationDate;
    private List<String> items;

    public static DocumentBuilder builder(){
        return new DocumentBuilder();
    }

    public static DocumentBuilder builder(Document document) {
        return new DocumentBuilder(document);
    }


    public Document() {
    }

    public Document(String title, String description, String author, Instant creationDate, List <String> items) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.creationDate = creationDate;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public List <String> getItems() {
        return items;
    }

    public void setItems(List <String> items) {
        this.items = items;
    }

    public static class DocumentBuilder{
        private String title = "Default title";
        private String description = "Default decription";
        private String author = null;
        private Instant creationDate = Instant.now();
        private List<String> items = new ArrayList <>();

        public DocumentBuilder(){}

        public DocumentBuilder(Document document){
            this.title = document.title;
            this.description = document.description;
            this.author = document.author;
            this.creationDate = document.creationDate;
            this.items = document.items;
        }

        public DocumentBuilder title(String title) {
            this.title = title;
            return this;
        }
        public DocumentBuilder description(String description) {
            this.description = description;
            return this;
        }
        public DocumentBuilder author(String author) {
            this.author = author;
            return this;
        }
        public DocumentBuilder creationDate(Instant creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public DocumentBuilder items(List<String> items) {
            this.items.addAll(items);
            return this;
        }
        public  DocumentBuilder item (String item){
            this.items.add(item);
            return this;
        }
        public Document build(){
            return new Document(title, description, author, creationDate, items);
        }



    }
}
