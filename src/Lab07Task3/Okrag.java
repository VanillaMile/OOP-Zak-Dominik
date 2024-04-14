package Lab07Task3;

public class Okrag extends Figura implements IRuchFigury{
    @Override
    public String opis() {
        return null;
    }

    @Override
    public void skaluj(float skala) {
        System.out.println("Skaluje o " + skala);
    }

    @Override
    public void przesun(int x, int y) {
        System.out.println("Przesuwam o " + x + " i " + y);
    }
}
