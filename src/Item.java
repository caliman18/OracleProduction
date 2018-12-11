
/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: Item.java
 * description: Interface called Item that will force all classes to implement the functions listed
 * bellow.
 */

import java.util.Date;

public interface Item {

  /**
   * Functions to be implemented by classes:
   * A string constant called manufacturer that is set to OracleProduction.
   * A method setProductionNumber that have one integer parameter (productionNumber).
   * A method setName that have one String parameter (String name).
   * A method getName that returns a String (String name).
   * A method getManufactureDate that returns a Date.
   * A method getSerialNumber that returns an int.
   */

  // a constant for MANUFACTURER's name

  public static final String MANUFACTURER = "OracleProduction";

  /**
   * To set new production number.
   *
   * @param productionNumber
   */

  public void setProductionNumber(int productionNumber);

  /**
   * To set new name of item.
   *
   * @param name
   */

  public void setName(String name);

  /**
   * @return name of item
   */


  public String getName();

  /**
   * To get the manufacture data of item.
   *
   * @return date
   */


  public Date getManufactureDate();

  /**
   * @return serial number of item.
   */

  public int getSerialNumber();

}


