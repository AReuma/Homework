package com.example.demo.controller.crawl;

import com.example.demo.entity.crawl.DaumNews;
import com.example.demo.service.jpa.crawl.DaumNewsCrawlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/64th/crawl")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class DaumNewsCrawlController {

    @Autowired
    DaumNewsCrawlService service;

    @RequestMapping("/{category}")
    public List<DaumNews> getDaumNewsCategory (@PathVariable("category") String category) {
        log.info("Start Crawling: " + category);

        service.daumNewsMainCrawler(category);

        return service.daumNewsFindAll();
    }
}
