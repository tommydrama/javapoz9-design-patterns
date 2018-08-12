package com.sda.builder;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class DocumentLombok {
    private String title;
    private String description;
    private String author;
    private Instant creationDate;
    private List<String> items;
}
