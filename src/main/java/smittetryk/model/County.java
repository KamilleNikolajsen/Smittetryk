package smittetryk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumns;

@Entity
public class County {

  @Id
  @Column(name="county_code")
  private String countyCode;
  private String name;
  private String href;
  private String fkRegionCode;

  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
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

  public String getFkRegionCode() {
    return fkRegionCode;
  }

  public void setFkRegionCode(String fkRegionCode) {
    this.fkRegionCode = fkRegionCode;
  }
}
