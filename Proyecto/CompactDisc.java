package Proyecto;

public class CompactDisc
  extends AbstractDisk
  implements InterfaceReproducibleDisk, InterfaceStorableDisk {

  @Override
  public void readData() {
    System.out.println("The compact disc (CD) is reading data.");
  }

  @Override
  public void writeData() {
    System.out.println("The compact disc (CD) is writing data.");
  }

  @Override
  public void reportInformation() {
    System.out.println("The compact disc (CD) is reporting information.");
  }

  @Override
  public void reproduce() {
    System.out.println("The compact disc (CD) is reproducing.");
  }

  @Override
  public void spin() {
    System.out.println("The compact disc (CD) is spinning.");
  }

  @Override
  public String toString() {
    return (
      "CompactDisc Info:\n" +
      "-------------------\n" +
      "Name: " +
      getName() +
      "\n" +
      "Content: " +
      getContent() +
      "\n" +
      "Type: " +
      getType() +
      "\n" +
      "Brand: " +
      getBrand() +
      "\n" +
      "Rotation Speed: " +
      getRotationSpeed() +
      "\n" +
      "Status: " +
      getStatus() +
      "\n" +
      "Manufacture Date: " +
      getManufactureDate() +
      "\n" +
      "Rewritable: " +
      isIsRewritable() +
      "\n"
    );
  }
}
