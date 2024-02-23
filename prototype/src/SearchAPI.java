public class SearchAPI implements CloneablePrototype<SearchAPI> {

    private String url;
    private String path;

    private String token;

    public SearchAPI() {

    }

    public SearchAPI(SearchAPI searchAPI) {
        this.url = searchAPI.url;
        this.path = searchAPI.path;
        this.token = searchAPI.token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public SearchAPI copy() {
        return new SearchAPI(this);
    }

    @Override
    public String toString() {
        return "SearchAPI{" +
                "url='" + url + '\'' +
                ", path='" + path + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
