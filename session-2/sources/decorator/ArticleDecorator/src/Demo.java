
import article.ArticleRepository;
import article.IArticle;
import java.util.List;
import wypatlator.WypatlatorArticleDecorator;

public class Demo {

    public static void main(String[] args) {
        List<IArticle> articles = new ArticleRepository().getAllArticles();
        printArticles(articles);
    }

    private static void printArticles(List<IArticle> articles) {
        for (IArticle article : articles) {
            printArticle(new WypatlatorArticleDecorator(article));
        }
    }

    private static void printArticle(IArticle article) {
        System.out.println("ID článku: " + article.getId());
        System.out.println("Titulek: " + article.getTitle());
        System.out.println("URL: " + article.getUrl());
        System.out.println("Text:");
        System.out.println(article.getText());
        System.out.println();
    }
}
