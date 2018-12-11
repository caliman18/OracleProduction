/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: ItemType.java
 * description: Enum called ItemType that will store product information.
 */

public enum ItemType {

  // fields for audio type and respective codes.

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");


  public final String code;

  /**
   * Constructor to set value of item.
   *
   * @param code
   */

  ItemType(String code) {
    this.code = code;
  }

  /**
   * To get code of item type.
   *
   * @return item type.
   */

  public String getCode() {
    return code;
  }
}
