import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: EmployeeInfo.java
 */
public class EmployeeInfo {

  // Attributes
  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  /**
   * Constructor to get details from
   * user and set it.
   */
  public EmployeeInfo() {

    // To take input from console.
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();

  }

  /**
   * @return name
   */
  public StringBuilder getName() {

    return name;

  }

  /**
   * @return code
   */
  public String getCode() {

    return code;

  }

  /**
   * Inputting name from user and
   * checking if it is contains space
   * or not.
   */
  private void setName() {

    // Taking name from user.
    String inputName = inputName();
    name = new StringBuilder();
    name.append(inputName);

    // Checking its validity and creating code.
    if(checkName(name)) {
      createEmployeeCode(name);
    }else {
      this.code = "Guest";
    }


  }

  /**
   * Creating a employee code by take the first initial from the first name and
   * add it to the full surname to create the code. If there is no space then
   * default value of guest is to be used as the value for code.
   *
   * @param name
   */
  private void createEmployeeCode(StringBuilder name) {

    String[] nameParts = name.toString().split(" ");
    this.code = nameParts[0].substring(0, 1) + nameParts[1];

  }

  /**
   * To get input of name from user and return back.
   *
   * @return name
   */
  private String inputName() {

    return in.nextLine();

  }

  /**
   * Using Regex, to check that does name have a
   * space or not.
   *
   * @param name
   * @return true if it contains space else false.
   *
   */
  private boolean checkName(StringBuilder name) {

    // Setting the regex.
    p = Pattern.compile("^(([a-zA-Z]*) ([a-zA-Z]*))$");
    Matcher matcher = p.matcher(name.toString());

    return matcher.matches();

  }

  /**
   * @return department id.
   */
  public String getDeptId() {

    return this.deptId;

  }

  /**
   * Setting department id by taking input
   * from user and validating it.
   */
  private void setDeptId() {

    String id = getId();
    if(validId(id)) {
      this.deptId = reverseString(id);
    }else {
      this.deptId = "None01";
    }

  }

  /**
   * Taking input from user and returning it.
   *
   * @return department id
   */
  private String getId() {

    return in.nextLine();

  }

  /**
   * Using Regex, to check that does department id have a
   * first letter big and 3 small and 2 integers
   *
   * @param id
   * @return true if it is valid else false.
   *
   */
  private boolean validId(String id) {

    // Setting the regex.
    p = Pattern.compile("^([A-Z][a-z]{3}[0-9]{2})$");
    Matcher matcher = p.matcher(id);

    return matcher.matches();

  }

  /**
   * To reverse the string.
   *
   * @param id
   * @return reversed string.
   */
  public String reverseString(String id) {

    if(id.isEmpty()) {
      return id;
    }else {

      return reverseString(id.substring(1)) + id.charAt(0);

    }

  }

  /**
   * @return date of employee info.
   */
  public String toString() {

    return "Code: "+code.toString()+"\n"
        + "Department ID: "+deptId;

  }

}
