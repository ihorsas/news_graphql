package com.lnu.service;

import com.lnu.entity.News;
import com.lnu.repository.NewsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    @Override
    public News getById(Integer id) {
        Optional<News> product = newsRepository.findById(id);
        return product.orElse(null);
    }

    @Override
    public List<News> getAll() {
        return newsRepository.findAll();
    }

    @Override
    public News create(News news) {
        return newsRepository.save(news);
    }

    @Override
    public News update(News news) {
        return newsRepository.save(news);
    }

    @Override
    public News remove(Integer id) {
        Optional<News> removedProduct = newsRepository.findById(id);
        if(removedProduct.isPresent()) {
            newsRepository.deleteById(id);
        }
        return removedProduct.orElse(null);
    }
}
