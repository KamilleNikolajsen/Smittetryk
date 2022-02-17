package smittetryk.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Region {

  @Id
  private String regionCode;
  private String name;
  private String href;

  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }
}
