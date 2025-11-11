package Proyecto;

import Proyecto.AbstractDisk.Estatus;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class AbstractRotatableObject
  implements InterfaceRotationalDisk {

  private String name;
  private String type;
  private int rotationSpeed;
  private Estatus status;
  private LocalDateTime manufactureDate;

  public AbstractRotatableObject() {}

  public AbstractRotatableObject(
    String name,
    String type,
    int rotationSpeed,
    Estatus status,
    LocalDateTime manufactureDate
  ) {
    this.name = name;
    this.type = type;
    this.rotationSpeed = rotationSpeed;
    this.status = status;
    this.manufactureDate = manufactureDate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getRotationSpeed() {
    return this.rotationSpeed;
  }

  public void setRotationSpeed(int rotationSpeed) {
    this.rotationSpeed = rotationSpeed;
  }

  public Estatus getStatus() {
    return this.status;
  }

  public void setStatus(Estatus status) {
    this.status = status;
  }

  public LocalDateTime getManufactureDate() {
    return this.manufactureDate;
  }

  public void setManufactureDate(LocalDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public AbstractRotatableObject name(String name) {
    setName(name);
    return this;
  }

  public AbstractRotatableObject type(String type) {
    setType(type);
    return this;
  }

  public AbstractRotatableObject rotationSpeed(int rotationSpeed) {
    setRotationSpeed(rotationSpeed);
    return this;
  }

  public AbstractRotatableObject status(Estatus status) {
    setStatus(status);
    return this;
  }

  public AbstractRotatableObject manufactureDate(
    LocalDateTime manufactureDate
  ) {
    setManufactureDate(manufactureDate);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof AbstractRotatableObject)) {
      return false;
    }
    AbstractRotatableObject abstractRotatableObject = (AbstractRotatableObject) o;
    return (
      Objects.equals(name, abstractRotatableObject.name) &&
      Objects.equals(type, abstractRotatableObject.type) &&
      rotationSpeed == abstractRotatableObject.rotationSpeed &&
      Objects.equals(status, abstractRotatableObject.status) &&
      Objects.equals(manufactureDate, abstractRotatableObject.manufactureDate)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, rotationSpeed, status, manufactureDate);
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", type='" +
      getType() +
      "'" +
      ", rotationSpeed='" +
      getRotationSpeed() +
      "'" +
      ", status='" +
      getStatus() +
      "'" +
      ", manufactureDate='" +
      getManufactureDate() +
      "'" +
      "}"
    );
  }
}
