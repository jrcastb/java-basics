package valorRef;

public class PasoPorReferencia {
    static class Objeto {
        private int variable;

        public Objeto(int variable) {
            this.variable = variable;
        }
    }
    public static void main(String[] args) {
        int var1;
        Objeto obj;

        var1 = 2;
        obj = new Objeto(1);// Instanciación

        System.out.println("obj.variable = " + obj);
        System.out.println("var1 = " + var1);

        increment(var1, obj);

        System.out.println("var1 = " + var1);//
        System.out.println("obj.variable = " + obj);//


    }
    public static void increment(int var, Objeto objeto){
        var++;
        objeto.variable++;
    }
}
