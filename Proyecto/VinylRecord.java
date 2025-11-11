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

  
  @Override
  public String toString() {
    return (
      "VinylRecord Info:\n" +
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
