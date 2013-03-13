package wypatlator;

import article.IArticle;

public class WypatlatorArticleDecorator implements IArticle {

    private IArticle article;

    public WypatlatorArticleDecorator(IArticle article) {
        this.article = article;
    }

    @Override
    public int getId() {
        return article.getId();
    }

    @Override
    public String getTitle() {
        return StringWypatlator.wypatlej(article.getTitle());
    }

    @Override
    public String getUrl() {
        return article.getUrl();
    }

    @Override
    public String getAuthor() {
        return StringWypatlator.wypatlej(article.getAuthor());
    }

    @Override
    public String getText() {
        return StringWypatlator.wypatlej(article.getText());
    }
}
