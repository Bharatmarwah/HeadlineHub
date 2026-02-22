package in.bm.NewsApp.Configuration;

import in.bm.NewsApp.DTO.NewResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class NewsWebClient {

    private final WebClient.Builder webClientBuilder;

    public NewsWebClient(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @Value("${news.api.key}")
    private String apiKey;

    public NewResponse getNews(String q){
        return webClientBuilder
                .build()
                .get()
                .uri("https://newsapi.org/v2/everything?q={q}&from=2026-01-22&sortBy=publishedAt&apiKey={apiKey}",
                        q,apiKey)
                .retrieve()
                .bodyToMono(NewResponse.class)
                .block();

    }



}
