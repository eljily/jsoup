package net.sidibrahim;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Connection connection =Jsoup.connect("https://www.voursa.com/").timeout(10000);
        try{
            Document document =connection.get();
            System.out.println(document.forms().size());
            Element productWrapper = document.getElementById("dync");
            assert productWrapper != null;
            Elements Links = productWrapper.getElementsByTag("a");
            System.out.println(Links);

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}