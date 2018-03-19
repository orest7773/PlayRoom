package com.epam.PlayRoom.Models;

import com.epam.PlayRoom.Enum.ColorType;
import com.epam.PlayRoom.Enum.ToyType;

public abstract class Toy {

  private int price;
  private ColorType colorType;
  private boolean isUsed;
  private ToyType toyType;

  public Toy(int price, ColorType colorType, ToyType toyType) {
    this.price = price;
    this.colorType = colorType;
    this.isUsed = true;
    this.toyType = toyType;
  }

  public int getPrice() {
    return this.price;
  }

  public ColorType getColor() {
    return this.colorType;
  }

  public void setToyNotUsed() {
    this.isUsed = false;
  }

  public ToyType getToyType() {
    return this.toyType;
  }

  @Override
  public String toString() {
    return "Toy: " + this.toyType + this.colorType;
  }
}
