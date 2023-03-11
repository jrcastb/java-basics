package valorRef;

public class PasoPorValor {
    public static void main(String[] args) {
        int  x = 10;
        System.out.println("x = " + x);
        x = valueChange(x);
        System.out.println("x = " + x);
    }

    public static int valueChange(int x){
        System.out.println("x = " + x);
        x = 15;
        return x;
    }
}
