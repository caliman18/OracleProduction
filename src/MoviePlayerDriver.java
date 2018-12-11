/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: MoviePlayerDriver.java
 * description:
 */




//driver to test MoviePlayer ... step 12

public class MoviePlayerDriver {

  public static void main(String[] args) {

    MoviePlayer player=new MoviePlayer("my movie player");

    System.out.println("Created a movie player and calling methods..");

    System.out.println(player);

    player.play();

    player.previous();

    player.next();

    player.stop();

  }

}