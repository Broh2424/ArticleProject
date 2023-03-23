package com.assessment.articleproject.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Long> {

    @Query(value = "select * from #{entityName} m where m.title=?1",nativeQuery = true)
    public List<ArticleDTO>findArticleByTitle(@Param("title") String title);


}
