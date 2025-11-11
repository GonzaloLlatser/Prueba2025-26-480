package Proyecto;

import java.util.Objects;

public class Frisbee extends AbstractRotatableObject {

  @Override
  public void spin() {}

  public Frisbee() {}

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
    return "{" + "}";
  }
}
