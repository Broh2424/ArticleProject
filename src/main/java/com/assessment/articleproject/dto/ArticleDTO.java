package com.assessment.articleproject.model;
import lombok.Data;

import java.util.List;
@Data
public class ArticleDTO {
    private String title;
    private String content;
    private List<String> tags;
}
