package com.example.demo.service.jpa.crawl;


import com.example.demo.entity.crawl.DaumNews;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public interface DaumNewsCrawlService {
    Document connectUrl(String url); // 이걸 통해 접근함
    List<DaumNews> daumNewsFindAll();
    void daumNewsMainCrawler(String category); // 카테고리로 판정
    void daumNewsCrawling (Elements elements, String category);

}
