package Proyecto;

import java.util.Objects;

public class Frisbee extends AbstractRotatableObject {

  public Frisbee() {}

  @Override
  public void spin() {
    System.out.println("The Frisbee is spinning.");
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Frisbee)) {
      return false;
    }
    Frisbee frisbee = (Frisbee) o;
    return Objects.equals(this, frisbee);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return (
      "Frisbee Info:\n" +
      "-------------------\n" +
      "Name: " +
      getName() +
      "\n" +
      "Type: " +
      getType() +
      "\n" +
      "Rotation Speed: " +
      getRotationSpeed() +
      "\n" +
      "Status: " +
      getStatus() +
      "\n" +
      "Manufacture Date: " +
      getManufactureDate() +
      "\n"
    );
  }
}
