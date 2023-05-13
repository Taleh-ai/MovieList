package com.example.movielist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movie_list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private int year;
    private int score;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Column(columnDefinition = "boolean default false")
    private Boolean watchStatus;

}
