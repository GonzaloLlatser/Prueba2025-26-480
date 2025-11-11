package Proyecto;

public class VinylRecord extends AbstractDisk implements InterfaceReproducibleDisk{

  @Override
  public void reproduce() {
    System.out.println("The vinyl record is reproducing.");
  }

  @Override
  public void spin() {
    System.out.println("The vinyl record is spinning.");
  }
}
