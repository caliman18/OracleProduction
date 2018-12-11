/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: MediaCollectionDemo.java
 * description:
 */




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//driver to demonstrate the sorting and printing of products steps 13 - 16

public class MediaCollectionDemo {

  private static void print(List<Product> list)
  {
    for(Product p : list)
      System.out.println(p +"\n");
  }
  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<Product>();

    list.add(new AudioPlayer("my audio player 3", "audio spec1"));
    list.add(new MoviePlayer("my movie player 3"));

    list.add(new AudioPlayer("my audio player 1", "audio spec1"));
    list.add(new MoviePlayer("my movie player 1", new Screen("1024x768", 70,20), MonitorType.LED));

    list.add(new AudioPlayer("my audio player 2", "audio spec1"));
    list.add(new MoviePlayer("my movie player 2"));

    Collections.sort(list);

    print(list);

  }
}
