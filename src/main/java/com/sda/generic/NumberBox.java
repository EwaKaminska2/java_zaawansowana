package com.sda.generic;

public class NumberBox <T extends Number> extends Box<T> {

//<U extends Number> boolean hasSameValue (NumberBox<U> otherBox){
  //  return otherBox.getT().doubleValue()==this.getT().doubleValue();
//}
    public boolean hasSameValue(NumberBox<?> otherBox) {
        //    return this.getT().equals(otherBox.getT());
        return otherBox.getT().doubleValue()==this.getT().doubleValue();


    //public boolean hasSameValue(NumberBox<? extends Integer> otherBox) {
    //    return this.getT().equals(otherBox.getT());

    }


}
