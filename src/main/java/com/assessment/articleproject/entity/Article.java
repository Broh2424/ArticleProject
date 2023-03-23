package com.assessment.articleproject.model;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Article")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Article extends ArticleDTO {
    @Id
    @GeneratedValue
    private  Long id;
    private String title;
    private String content;

}
