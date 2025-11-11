package Proyecto;

public class HardDiscDrive
  extends AbstractDisk
  implements InterfaceStorableDisk {

  @Override
  public void readData() {
    System.out.println("The hard disk drive is reading data.");
  }

  @Override
  public void writeData() {
    System.out.println("The hard disk drive is writing data.");
  }

  @Override
  public void reportInformation() {
    System.out.println("The hard disk drive is reporting information.");
  }

  @Override
  public void spin() {
    System.out.println("The hard disk drive is spinning.");
  }

  @Override
  public String toString() {
    return (
      "HardDisc Info:\n" +
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
