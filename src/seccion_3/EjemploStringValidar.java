public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNul = curso == null;

        System.out.println("esNul = " + esNul);

        if( esNul ) {
            curso = "Programacion Java";
            //curso = "";
        }
        boolean esvacio = curso.length() == 0;
        System.out.println("esvacio = " + esvacio);

        boolean esvacio2 = curso.isEmpty();
        System.out.println("esvacio2 = " + esvacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if( esBlanco == false ) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al " + curso);
        }
    }
}
