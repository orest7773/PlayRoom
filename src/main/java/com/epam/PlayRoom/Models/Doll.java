package com.epam.PlayRoom.Models;

import com.epam.PlayRoom.Enum.ColorType;
import com.epam.PlayRoom.Enum.ToyType;

public class Doll extends Toy {

  private boolean isEvil;

  public Doll(int price, ColorType colorType, ToyType dollType) {
    super(price, colorType, dollType);
  }

  public boolean isEvil() {
    return this.isEvil;
  }
}
