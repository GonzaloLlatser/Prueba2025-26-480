package Proyecto;

import java.util.Objects;

public class Wheel extends AbstractRotatableObject {

  public Wheel() {}

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Wheel)) {
      return false;
    }
    Wheel wheel = (Wheel) o;
    return Objects.equals(this, wheel);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "{" + "}";
  }

  @Override
  public void spin() {
    System.out.println("The wheel is spinning.");
  }
}
