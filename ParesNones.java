public class ParesNones {
    public static void main(String[] args) {
        System.out.println("Introduce 2 números enteros: ");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());

        System.out.println("Que quieres buscar? (Pares = 1 | Impares = 2)");

        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1: 
                        if (a > b) {
                            while (a >= b) {
                                if (a % 2 == 0) {
                                    System.out.println(a);
                                }
                                a++;            
                            }
                        } else {
                            while (b >= a) {
                                if (b % 2 == 0) {
                                    System.out.println(b);
                                }
                                b++;            
                            } 
                        }
                break;
            case 2:
                        if (a < b) {
                            while (a <= b) {
                                if (a % 2 != 0) {
                                    System.out.println(a);
                                }
                                a++;            
                            }
                        } else {
                            while (b <= a) {
                                if (b % 2 != 0) {
                                    System.out.println(b);
                                }
                                b++;            
                            } 
                        }
                break;
        
            default: System.out.println("Opción no válida");
                break;
        }
    }
}