package com.epam.PlayRoom.Models;

import com.epam.PlayRoom.Enum.ColorType;
import com.epam.PlayRoom.Enum.ToyType;

public class Car extends Toy {

  private boolean isFast;

  public Car(int price, boolean isFast, ColorType colorType, ToyType carType) {
    super(price, colorType, carType);
    this.isFast = isFast;
  }

  public boolean isFast() {
    return this.isFast;
  }
}
