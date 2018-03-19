package com.epam.PlayRoom;

import com.epam.PlayRoom.Enum.ColorType;
import com.epam.PlayRoom.Enum.ToyType;
import com.epam.PlayRoom.Models.Car;
import com.epam.PlayRoom.Models.Doll;
import com.epam.PlayRoom.Models.Toy;
import java.util.ArrayList;

public class PlayRoom {


  private ArrayList<Toy> toyList = new ArrayList<Toy>();

  public PlayRoom(int price, boolean isBoy, ArrayList<Toy> allToys) {

    if (isBoy) {
      int priceOfToys = 0;
      int index = 0;
      while ((price >= priceOfToys) && (index <= allToys.size() - 1)) {
        if (!(allToys.get(index) instanceof Doll)) {
          toyList.add(allToys.get(index));
          index++;
        }else{
          index++;
        }
      }

    } else {
      int priceOfToys = 0;
      int index = 0;
      while ((price >= priceOfToys) && (index <= allToys.size() - 1)) {
        if (!(allToys.get(index) instanceof Car)) {
          toyList.add(allToys.get(index));
          index++;
        }
      }

    }
  }

  public ArrayList<Toy> getToysByColor(ColorType color) {
    {
      ArrayList<Toy> toyArrayList = new ArrayList<Toy>();
      for (Toy toyFromArr : toyList) {
        if (toyFromArr.getColor() == color){
          toyArrayList.add(toyFromArr);
        }
      }
      return toyArrayList;
    }
  }

  public ArrayList<Toy> getToysByType(ToyType toyType){
    {
      ArrayList<Toy> toyArrayList = new ArrayList<Toy>();
      for (Toy toyFromArr : toyList) {
        if (toyFromArr.getToyType() == toyType){
          toyArrayList.add(toyFromArr);
        }
      }
      return toyArrayList;
    }
  }
  public ArrayList<Toy> getToysByPrice(int maxPrice){
    ArrayList<Toy> toyArrayList = new ArrayList<Toy>();
    for (Toy toyFromArr : toyList) {
      if (toyFromArr.getPrice() <= maxPrice){
        toyArrayList.add(toyFromArr);
      }
    }
    return toyArrayList;
  }

}
