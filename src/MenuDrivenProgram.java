import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018 fileName: MenuDrivenProgram.java description:
 */
public class MenuDrivenProgram {

  // Attributes
  private Scanner scan;
  private int option;
  private ArrayList<Product> products;

  /**
   * Constructor to execute menu.
   */
  public MenuDrivenProgram() {

    // Read data from console.
    scan = new Scanner(System.in);
    products = new ArrayList<>();
    int subMenu = 0;
    Product product;
    do {

      System.out.print("** Menu **\n"
          + "1: Add Product\n"
          + "2: Product Statistics\n"
          + "3: Exit\n"
          + "Enter your choice: ");
      option = scan.nextInt();

      if(option == 1) {

        // Adding product here.
        System.out.print("Select Product to Add..\n"
            + "1: Audio Player\n"
            + "2: Movie Player\n"
            + "Enter your choice: ");
        subMenu = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Name of Product: ");
        String name = scan.nextLine();

        if(subMenu == 1) {
          System.out.println("Enter Audio Specifications: ");
          String audioSpecs = scan.nextLine();
          product = new AudioPlayer(name, audioSpecs);
        }else {
          product = new MoviePlayer(name);
        }
        System.out.println("How many times you want to add: ");
        int count = scan.nextInt();
        // Adding products for many times..
        for(int i = 0; i < count; i++) {
          products.add(product);
        }

      }else if(option == 2) {

        //Printing Statistics..
        System.out.println("Statistics.."
            + "\nTOTAL ITEMS PRODUCTED: "+products.size()+"\nItems..");
        ArrayList<String> items = new ArrayList<>();
        int itemCount = 0, unique = 0;

        // iterating through all products..
        for(int i = 0; i < products.size(); i++) {

          if(i == 0) {
            items.add(products.get(i).getName());
            itemCount++;
            unique++;
            continue;
          }

          if(items.contains(products.get(i).getName())) {
            itemCount++;
          }else {
            System.out.println(items.get(items.size() - 1)+": "+itemCount+" ITEMS");
            items.add(products.get(i).getName());
            itemCount = 1;
            unique++;
          }

        }

        // Printing the last item if it exists..
        if(products.size() > 0) {
          System.out.println(items.get(items.size() - 1)+": "+itemCount+" ITEMS");
        }
        System.out.println("TOTAL UNIQUE PRODUCTS: "+unique);

      }else if(option == 3) {
        break;
      }else {
        System.out.println("Select appropriate menu option.");
      }

      // closing the loop if option == 3.
    }while(option != 3);

    System.out.println("Thank You for using this program.");

  }

  /**
   * Main method to start the program.
   *
   * @param args
   */
  public static void main(String[] args) {

    // Calling method.
    new MenuDrivenProgram();

  }

}
