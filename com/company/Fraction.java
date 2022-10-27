package com.company;


public class Fraction {
    float x;
    float y;
    public Fraction(){
        x= 0;
        y= 0;
    }
    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Вывод: 1-ый способ
    public String toString() {
        return "A"+" "+"(" + x+" "+";"+" "+ y +")";
    }
    public Fraction MoveXY(int t){
        Fraction result = new Fraction();
        result.x = x+t;
        result.y= y +t;
        return  result;
    }
    public Fraction MoveXandY(int t){
        Fraction result = new Fraction();
        result.x = x-t;
        result.y = y - t;
        return  result;
    }
}
