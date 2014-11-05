import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Circulo;

public class Pratica41 {
    public static void main( String[] args ){
        Elipse el = new Elipse(45, 10);
        Circulo ci = new Circulo(2);
        System.out.println(el.getArea());
        System.out.println(el.getPerimetro());
        System.out.println(ci.getArea());
        System.out.println(ci.getPerimetro());
    }
}