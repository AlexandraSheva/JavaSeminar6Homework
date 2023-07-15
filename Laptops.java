public class Laptops {
  private String firm;

  private String model;

  private int ozu;

  private Double obzhestd;

  private String os;

  private String color;

  public Laptops (String firm, String model, int ozu, Double obzhestd, String os, String color) {
    this.firm = firm;
    this.model = model;
    this.ozu = ozu;
    this.obzhestd = obzhestd;
    this.os = os;
    this.color = color;
  }

  public String getFirm () {
    return firm;
  }

  public String getModel () {
    return model;
  }

  public int getOzu () {
    return ozu;
  }

  public Double getObzhestd () {
    return obzhestd;
  }

  public String getOs () {
    return os;
  }

  public String getColor () {
    return color;
  }

  public void features () {
    
  }

}