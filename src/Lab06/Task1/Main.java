package Lab06.Task1;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(),
                new Point(2.5, -3.45),
                new Point(7.5, 2.5)
        };
        for (Point item: points){
            item.view();
        }
        for (Point item: points){
            item.set0();
        }
        for (Point item: points){
            item.setX(5);
        }
        for (Point item: points){
            item.setY(10);
        }
        for (Point item: points){
            item.view();
        }
        Prostokat prostokat = new Prostokat(new Point(5.5, 9.9), 5, 9.9);
        prostokat.move(3f,5f);
        Square square = new Square(4,9);
        System.out.println(square.opis());
        System.out.println(prostokat.opis());
        Trojkat trojkat = new Trojkat(5,2);
        System.out.println(trojkat.opis());

        Ring ring1 = new Ring(9,9,3);
        Ring ring2 = new Ring(points[2], 3);
        Ring ring3 = new Ring();

        System.out.println(ring1.opis());
        System.out.println(ring2.opis());
        System.out.println(ring3.opis());

        ring3.setR(5);

        System.out.println(ring3.opis());

        if(ring1.isInside(new Point(8,8))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
