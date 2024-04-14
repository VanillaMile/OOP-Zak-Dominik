package Lab07Task2;

import Lab07Task1.IFlies;

public abstract class Animal implements Lab07Task2.ISwims, Lab07Task2.IFlies {
    public void swims(){
        System.out.println("Swims");
    }
    public void divesOut(){
        System.out.println("Dives Out");
    }
    public void divesIn(){
        System.out.println("Dives in");
    }
    public void excretes(){
        System.out.println("Excretes");
    }
    public void flies(){
        System.out.println("Flies");
    }
    public void lands(){
        System.out.println("Lands");
    }
}
