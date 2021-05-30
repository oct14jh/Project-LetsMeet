package com.ssafy.crawling;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class 밥카페술 {

   public static void main(String[] args) throws IOException{


        File file = new File("C:\\ssafy\\test03.txt");
        
        BufferedWriter bw;
         bw = new BufferedWriter(new FileWriter(file));
         


        String arr[]= {"대구%20수성구%20", "대구%20중구%20","대구%20남구%20","대구%20서구%20","대구%20북구%20","대구%20동구%20","대구%20달서구%20","대구%20달성군%20"};
        int no=1;
      while(no<=50) {
         
         Connection.Response response = Jsoup.connect("https://www.siksinhot.com/hot/search/places?keywords=%EB%8C%80%EA%B5%AC%20%EC%88%A0%EC%A7%91&rankHide=Y&nO="+no)
               .method(Connection.Method.GET)
               .execute();
         Document Document = response.parse();	// URL 따서 해당 페이지를 DOC에 집어넣겟다.

         
         Elements li=Document.select("div>ul>li.place-item");	

         for (Element e : li) {
            System.out.println(no);
            Elements temp=e.select("div.gridInfo");
            
            
            Elements title=temp.select("span>a");
            System.out.println(title.text());
            
            Elements score=e.select("span.starNum");
            System.out.println(score.text());
            
            String href=e.select("a").attr("href");
            
            Connection.Response response02 = Jsoup.connect("https://www.siksinhot.com"+href)
                  .method(Connection.Method.GET)
                  .execute();
            Document Document02 = response02.parse();
            
            Elements imgtemp=Document02.select("div.slick-list");
            Element img=imgtemp.select("img").get(0);
            System.out.println(img.attr("src"));
            Elements content=Document02.select("div.content");

               
               System.out.println("상세조회");
               Elements detail=content.select("div.store_info");
               Elements text=detail.select("div>p");
               
               System.out.println(text.get(1).text());
               System.out.println(text.get(3).text());
               System.out.println(text.select(".txt_adr").text());
               
               bw.write(title.text() + ",술," + text.get(1).text() + "," + text.select(".txt_adr").text() + "," + text.get(3).text() + ","
                     + ",,," + img.attr("src") + "," + score.text());
               bw.newLine();

         }
         no++;
      }
      bw.close();

   }
}