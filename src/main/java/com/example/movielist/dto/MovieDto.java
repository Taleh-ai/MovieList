package com.example.movielist.dto;

import com.example.movielist.entity.Genre;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class MovieDto {
    private Long id ;
    private String name;
    private int year;
    private int score;

    private Genre genre;
    private Boolean watchStatus;


}
