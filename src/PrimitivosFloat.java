public class PrimitivosFloat {

    public static void main(String[] args) {

        float realFloat = 0.00000000015f;//1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde a byte a = " + Float.BYTES);
        System.out.println("float corresponde a bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("máximo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("float corresponde en byte a = " + Double.BYTES);
        System.out.println("float corresponde en bites a = " + Double.SIZE);;
        System.out.println("máximo valor para float = " + Double.MAX_VALUE);
        System.out.println("máximo valor para float = " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
