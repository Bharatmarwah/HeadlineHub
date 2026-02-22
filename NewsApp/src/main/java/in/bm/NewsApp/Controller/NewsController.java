package in.bm.NewsApp.Controller;

import in.bm.NewsApp.Configuration.NewsWebClient;
import in.bm.NewsApp.DTO.NewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsWebClient newsWebClient;


    @GetMapping
    public NewResponse getNews(@RequestParam String q){
        return newsWebClient.getNews(q);
    }





}
