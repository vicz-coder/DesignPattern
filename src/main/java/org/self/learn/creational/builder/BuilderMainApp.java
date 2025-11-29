package org.self.learn.creational.builder;

public class BuilderMainApp {
    public static void main(String[] args) {
        //Before
        //HttpClient client = new HttpClient("POST","/api","json","user","pass","body");
        //After
        HttpClient client = new HttpClient.HttpClientBuilder()
                .method("POST")
                .url("/api")
                .header("head")
                .secure("user","pass")
                .body("body")
                .build();
        System.out.println(client);

    }
}
