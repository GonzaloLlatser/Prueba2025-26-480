package Proyecto;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class AbstractDisk implements InterfaceRotationalDisk {

  private String name;
  private String content;
  private String type;
  private String brand;
  private int rotationSpeed;
  private Estatus status; 
  private LocalDateTime manufactureDate;
  private Boolean isRewritable;

  public AbstractDisk() {}

  public AbstractDisk(
    String name,
    String content,
    String type,
    String brand,
    int rotationSpeed,
    Estatus status,
    LocalDateTime manufactureDate,
    Boolean isRewritable
  ) {
    this.name = name;
    this.content = content;
    this.type = type;
    this.brand = brand;
    this.rotationSpeed = rotationSpeed;
    this.status = status;
    this.manufactureDate = manufactureDate;
    this.isRewritable = isRewritable;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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

  public Boolean isIsRewritable() {
    return this.isRewritable;
  }

  public Boolean getIsRewritable() {
    return this.isRewritable;
  }

  public void setIsRewritable(Boolean isRewritable) {
    this.isRewritable = isRewritable;
  }

  public AbstractDisk name(String name) {
    setName(name);
    return this;
  }

  public AbstractDisk content(String content) {
    setContent(content);
    return this;
  }

  public AbstractDisk type(String type) {
    setType(type);
    return this;
  }

  public AbstractDisk brand(String brand) {
    setBrand(brand);
    return this;
  }

  public AbstractDisk rotationSpeed(int rotationSpeed) {
    setRotationSpeed(rotationSpeed);
    return this;
  }

  public AbstractDisk status(Estatus status) {
    setStatus(status);
    return this;
  }

  public AbstractDisk manufactureDate(LocalDateTime manufactureDate) {
    setManufactureDate(manufactureDate);
    return this;
  }

  public AbstractDisk isRewritable(Boolean isRewritable) {
    setIsRewritable(isRewritable);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof AbstractDisk)) {
      return false;
    }
    AbstractDisk abstractDisk = (AbstractDisk) o;
    return (
      Objects.equals(name, abstractDisk.name) &&
      Objects.equals(content, abstractDisk.content) &&
      Objects.equals(type, abstractDisk.type) &&
      Objects.equals(brand, abstractDisk.brand) &&
      rotationSpeed == abstractDisk.rotationSpeed &&
      Objects.equals(status, abstractDisk.status) &&
      Objects.equals(manufactureDate, abstractDisk.manufactureDate) &&
      Objects.equals(isRewritable, abstractDisk.isRewritable)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name,
      content,
      type,
      brand,
      rotationSpeed,
      status,
      manufactureDate,
      isRewritable
    );
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", content='" +
      getContent() +
      "'" +
      ", type='" +
      getType() +
      "'" +
      ", brand='" +
      getBrand() +
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
      ", isRewritable='" +
      isIsRewritable() +
      "'" +
      "}"
    );
  }

  public enum Estatus {
    NEW,
    USED,
    DAMAGED,
  }

  @Override
  public void spin() {}
}
