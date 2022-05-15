package com.lnu.service;

import com.lnu.entity.News;

import java.util.List;

public interface NewsService {
    News getById(Integer id);
    List<News> getAll();
    News create(News product);
    News update(News product);
    News remove(Integer id);
}
