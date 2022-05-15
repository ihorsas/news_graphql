package com.lnu.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lnu.entity.News;
import com.lnu.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class NewsQuery implements GraphQLQueryResolver {
    private final NewsService newsService;

    public List<News> news() {
        return newsService.getAll();
    }

    public News newsById(int id) {
        return newsService.getById(id);
    }
}