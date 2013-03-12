package article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    public List<IArticle> getAllArticles() {
        List<IArticle> articles = new ArrayList<>();
        articles.add(new Article(
                1, "Balonky na poušti 1", "http://gdgpardubice.cz", "Pavel Novák",
                "Vítr skoro nefouká a tak by se na první pohled mohlo zdát, že se balónky snad vůbec nepohybují."));
        articles.add(new Article(
                2, "Balonky na poušti 2", "http://gdgpardubice.cz", "Pavel Novák",
                " Jenom tak klidně levitují ve vzduchu. Jelikož slunce jasně září a na obloze byste od východu "
                + "k západu hledali mráček marně, balónky působí jako jakási fata morgána uprostřed pouště."));
        articles.add(new Article(
                3, "Balonky na poušti 3", "http://gdgpardubice.cz", "Pavel Novák",
                "Zkrátka široko daleko nikde nic, jen zelenkavá tráva, jasně modrá obloha a tři křiklavě barevné "
                + "pouťové balónky, které se téměř nepozorovatelně pohupují ani ne moc vysoko, ani moc nízko nad zemí."));
        articles.add(new Article(
                4, "Balonky na poušti 4", "http://gdgpardubice.cz", "Pavel Novák",
                "Kdyby pod balónky nebyla sytě zelenkavá tráva, ale třeba suchá silnice či beton, možná by bylo vidět "
                + "jejich barevné stíny - to jak přes poloprůsvitné barevné balónky prochází ostré sluneční paprsky."));
        return articles;
    }
}
