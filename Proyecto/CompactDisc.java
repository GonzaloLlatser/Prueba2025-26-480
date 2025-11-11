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
}
