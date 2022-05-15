package com.lnu.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.lnu.entity.News;
import com.lnu.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsMutation implements GraphQLMutationResolver {
    private final NewsService newsService;

    public News newNews(News news) {
        return newsService.create(news);
    }

    public News updateNews(News news) {
        return newsService.update(news);
    }

    public News removeNews(int id) {
        return newsService.remove(id);
    }
}
