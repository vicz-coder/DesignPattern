package org.self.learn.creational.builder;

public class HttpClient {
    private String method;
    private String url;
    private String header;
    private String userName;
    private String password;
    private String body;

    public HttpClient(String method, String url, String header, String userName, String password, String body) {
        this.method = method;
        this.url = url;
        this.header = header;
        this.userName = userName;
        this.password = password;
        this.body = body;
    }

    public HttpClient(HttpClientBuilder builder){
        this.method = builder.method;
        this.url = builder.url;
        this.header = builder.header;
        this.userName = builder.userName;
        this.password = builder.password;
        this.body = builder.body;
    }

    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String header;
        private String userName;
        private String password;
        private String body;

        public HttpClientBuilder method(String method){
            this.method = method;
            return this;
        }
        public HttpClientBuilder url(String url){
            this.url = url;
            return this;
        }
        public HttpClientBuilder header(String header){
            this.header = header;
            return this;
        }
        public HttpClientBuilder body(String body){
            this.body = body;
            return this;
        }
        public HttpClientBuilder secure(String name,String pwd){
            this.userName = name;
            this.password = pwd;
            return this;
        }

        public HttpClient build(){
            return new HttpClient(this);
        }

    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", header='" + header + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
