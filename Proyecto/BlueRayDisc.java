package Proyecto;

public class BlueRayDisc
  extends AbstractDisk
  implements InterfaceReproducibleDisk, InterfaceStorableDisk {

  @Override
  public void readData() {
    System.out.println("The Blue-Ray disc is reading data.");
  }

  @Override
  public void writeData() {
    System.out.println("The Blue-Ray disc is writing data.");
  }

  @Override
  public void reportInformation() {
    System.out.println("The Blue-Ray disc is reporting information.");
  }

  @Override
  public void reproduce() {
    System.out.println("The Blue-Ray disc is reproducing.");
  }

  @Override
  public void spin() {
    System.out.println("The Blue-Ray disc is spinning.");
  }
}
