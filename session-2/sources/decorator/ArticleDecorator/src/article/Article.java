package article;

public class Article implements IArticle {

    private int id;
    private String title;
    private String url;
    private String author;
    private String text;

    public Article(int id, String title, String url, String author, String text) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.author = author;
        this.text = text;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getText() {
        return text;
    }
}
