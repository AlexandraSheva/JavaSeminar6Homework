public class Laptops {
  private String firm;

  private int ozu;

  private int obZhD;

  private String os;


  public Laptops (String firm, int ozu, int obZhD, String os) {
    this.firm = firm;
    this.ozu = ozu;
    this.obZhD = obZhD;
    this.os = os;
  }

  public String getFirm () {
    return firm;
  }

  public int getOzu () {
    return ozu;
  }

  public int getObZhD () {
    return obZhD;
  }

  public String getOs () {
    return os;
  }

  public void showAll () {
    System.out.printf("Параметры ноутбука: %s, %s, %s, %s", getFirm(), getOzu(), getObZhD(), getOs());
  }

}