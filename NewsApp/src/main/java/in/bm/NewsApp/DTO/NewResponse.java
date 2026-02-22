package in.bm.NewsApp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

@Data
public class NewResponse {

    private List<Article> articles;

    @Data
    public static class Article{

        private String author;
        private String title;
        private String description;
        private String content;
        private String url;
        private String urlToImage;
    }



}
