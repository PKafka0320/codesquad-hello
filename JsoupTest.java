import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
    public static void main(String[] args) throws IOException {
        String url = "https://www.joongang.co.kr/money";
        Document document = Jsoup.connect(url).get();//해당 URL에 연결
        Elements p_name = document.getElementsByClass("headline"); // class이름으로 긁기
        for(Element a : p_name)
            System.out.println(a.text()); // 해당 태그내용 출력
    }
}