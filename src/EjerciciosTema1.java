import java.util.ArrayList;
import java.util.Scanner;


public class EjerciciosTema1 {
 

    //Ejercicio 1
    /*
     public static void main(String[] args) {

       1:Hágase un programa en el que se declare constantes locales con tu nombre completo,
       la dirección de tu casa (sólo la calle), el número del portal, el piso, la letra del piso, el código postal,
       la localidad, la provincia y el país. Muéstrese por consola dichos datos almacenados en las constantes como si
       fuera la dirección a la que se enviaría una carta.


        String nombre_completo = "Agustin Pastor Mantecon";
        String direccion = "C/Amadeo I, nº6, 7";
        String codigo_postal = "12001";
        String localidad = "Castellon de la Plana";
        String provincia = "Castellon";
        String pais = "España";

        System.out.println(nombre_completo);
        System.out.println(direccion);
        System.out.println(codigo_postal);
        System.out.println(localidad);
        System.out.println(provincia);
        System.out.println(pais);

    }
    */

    //Ejercicio 2
    /*
    2: Programa que lee el nombre completo y la edad de una persona, y muestra los datos leídos.
    (leerNombreEdad)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo");
        String nombre_completo = scanner.nextLine();

        System.out.print("Introduce tu edad");
        int edad = scanner.nextInt();

        System.out.printf("Mi nombre es %s y tengo %d años", nombre_completo, edad);
    }
    */

    //Ejercicio 3
    /*
    public static void main(String[] args) {

        metodoSuma();
        metodoResta();
        metodoMultiplicacion ();
        metodoDivisionEntera ();
        metodoResto ();
    }

        private static void metodoSuma () {
            int num_1 = 24;
            int num_2 = 7;
            int suma = num_1+num_2;
            System.out.printf("La suma de %d + %d es %d\n", num_1, num_2, suma);
        }

        private static void metodoResta () {
            int num_1 = 24;
            int num_2 = 7;
            int resta = num_1-num_2;
            System.out.printf("La resta de %d - %d es %d\n", num_1, num_2, resta);
        }

        private static void metodoMultiplicacion () {
            int num_1 = 24;
            int num_2 = 7;
            int multiplica = num_1*num_2;
            System.out.printf("La multiplicacion de %d * %d es %d\n", num_1, num_2, multiplica);
        }

        private static void metodoDivisionEntera () {
            int num_1 = 24;
            int num_2 = 7;
            float division = num_1/num_2;
            System.out.printf("La division de %d / %d es %.2f\n", num_1, num_2, division);
        }

        private static void metodoResto () {
            int num_1 = 24;
            int num_2 = 7;
            float resto_real = num_1%num_2;
            System.out.printf("El resto de %d %% %d es %.2f\n", num_1, num_2, resto_real);
        }
        */

    //Ejercicio 4

    /*
    Ejercicio 4: Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les
    pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de
    las bebidas y de los bocadillos. (Bar)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas bebidas quereis?");
        int bebidas=scanner.nextInt();
        System.out.print("¿Cuántos bocadillos quereis?");
        int bocadillos=scanner.nextInt();

        float coste_bebida = 1.25f;
        float coste_bocadillo=2.05f;
        float costeTodasBebidas=coste_bebida*bebidas;
        float costeTodosBocadillos=coste_bocadillo*bocadillos;
        float costeTotal=costeTodasBebidas+costeTodosBocadillos;

        System.out.printf("Numero de bebidas:%d\n Numero de bocadillos:%d\n Coste de las bebidas:%.2f€\n Coste de los bocadillos:%.2f€\n Coste total:%.2f€\n",bebidas,bocadillos,costeTodasBebidas, costeTodosBocadillos, costeTotal);
    }
*/

    //Ejercicio 5
    /*Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

    public static void main(String[] args) {
        System.out.print("Escribe los segundos que quieres calcular:");
        Scanner scanner = new Scanner(System.in);
        long segundosTotales=scanner.nextLong();

        int horas= (int) segundosTotales/3600;
        int minutos= (int) (segundosTotales%3600)/60;
        int segundos= (int) segundosTotales%60;

        System.out.printf("Un total de %d segundos, equivalen a:\n %d horas\n %d minutos\n %d segundos\n",segundosTotales,horas,minutos,segundos);

    }
*/

    //Ejercicio 6
    /*Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€
    ni inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?
    ¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.

    public static void main(String[] args) {
        System.out.print("Indique el valor del producto:");
        Scanner scanner = new Scanner(System.in);
        float valor_producto= scanner.nextFloat();

        if (valor_producto>=0.0 && valor_producto<=500.0){
            System.out.printf("Compra:%.2f\n",valor_producto);
        }else {
            System.out.print("El valor no es correcto, debe ser un valor de entre 0 y 500€");
        }

        System.out.print("Indique el IVA del producto:");
        int IVA= scanner.nextInt();

        if (IVA>=0 && IVA<=25){
            System.out.printf("IVA:%d%%\n",IVA);
        }else {
            System.out.print("El valor no es correcto, el IVA debe ser entre 0 y 25%");
        }

        float cantidad_IVA = valor_producto*(IVA/100.0f);
        System.out.printf("Tienes que pagar de IVA: %.2f€\n", cantidad_IVA);
        float precio_final = valor_producto+cantidad_IVA;
        System.out.printf("El precio final de compra es: %.2f€\n", precio_final);

    } */

    //Ejercicio 7
    /*
    Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100. Obténgase la longitud de la
    circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia) NOTA El valor de PI se obtiene con Math.PI

    public static void main(String[] args) {
        System.out.print("Introduce el valoe del radio de la circunferencia entre 0 y 100:\n");
        Scanner scanner =new Scanner(System.in);
        int radio= scanner.nextInt();

        double PI = Math.PI;
        double longitud = 2*PI*radio;
           if (longitud >=0 && longitud <=100){
            System.out.printf("Longitud de la circunferencia: %f\n",longitud);

        } else {
               System.out.print("El valor introducido no esta entre 0 y 100\n");
           }
           
        double area = PI*(radio*radio);
            System.out.printf("Area de la circunferencia: %f\n",area);
    }
     */

    //Ejercicio 8
    /*
    Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
    centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
    decimales). (Temperaturas)

    public static void main(String[] args) {
        System.out.print("Indica el tipo de conversion que quieres realizar:\n");
        Scanner scanner = new Scanner(System.in);

        while (true){
        System.out.println("Conversor de temperaturas:");
        System.out.println("Seleccione la opcion a realizar:");
        System.out.println("1.centigrados a farenheit:");
        System.out.println("2.centigrados a kelvin:");
        System.out.println("3.kelvin a farenheit:");
        System.out.println("4.kelvin a centrigrados:");
        System.out.println("5.farenheit a kelvin:");
        System.out.println("6.farenheit a centigrados:");
        System.out.println("7.Salir del programa");

        int opcion= scanner.nextInt();

        if (opcion==7){
        System.out.println("Saliendo del programa... ¡gracias por utilizar nuestra aplicacion!");
         break;
        }

        System.out.println("Introduce la temperatura:");
        double temperatura = scanner.nextDouble();
        double resultado = 0;

        switch (opcion){
            case 1: //centigrados a farenheit
                resultado=((9*temperatura)/5)+32;
                System.out.printf("Farenheit: %.2f\n",resultado);
                break;
            case 2: //centigrados a kelvin
                resultado=temperatura+273.15;
                System.out.printf("Kelvin: %.2f\n",resultado);
                break;
            case 3: //kelvin a farenheit
                resultado=((9*(temperatura-273.15))/5)+32;
                System.out.printf("Farenheit: %.2f\n",resultado);
                break;
            case 4: //kelvin a centrigrados
                resultado=temperatura-273.15;
                System.out.printf("Centigrados: %.2f\n",resultado);
                break;
            case 5: //farenheit a kelvin
                resultado=((5*(temperatura-32))/9)+32;
                System.out.printf("Kelvin: %.2f\n",resultado);
                break;
            case 6: //farenheit a centigrados
                resultado=(5*(temperatura-32))/9;
                System.out.printf("Centigrados: %.2f\n",resultado);
                break;
*/

    //Ejercicio 9
    /*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
    Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo
    (valor entre 0.00 € y 5.00 €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos)
    y la cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)

    public static void main(String[] args) {
        System.out.println("Indica el número de bebidas:");
        Scanner scanner =new Scanner(System.in);
        int num_bebidas= scanner.nextInt();

        if (num_bebidas <0 || num_bebidas>20){
            System.out.print("El numero de bebidas no puede ser menor a 0 ni mayor a 20");
        }

        System.out.println("Indica el número de bocadillos:");
        int num_bocadillos= scanner.nextInt();

        if (num_bocadillos <0 || num_bocadillos>20){
            System.out.print("El numero de bocadillos no puede ser menor a 0 ni mayor a 20");
        }

        System.out.println("Indica el precio de la bebida:");
        double precio_bebida= scanner.nextDouble();

        if (precio_bebida <0 || precio_bebida>3){
            System.out.print("El el precio de la bebida no puede ser menor a 0 ni mayor a 3€");
        }

        System.out.println("Indica el precio del bocadillo:");
        double precio_bocadillo= scanner.nextDouble();

        if (precio_bocadillo <0 || precio_bocadillo>3){
            System.out.print("El el precio del bocadillo no puede ser menor a 0 ni mayor a 3€");
        }

        double coste_bebidas=num_bebidas*precio_bebida;
            System.out.printf("El precio total de las bebidas es de %.2f €\n",coste_bebidas);
        double coste_bocadillos=num_bocadillos*precio_bocadillo;
            System.out.printf("El precio total de los bocadillos es de %.2f €\n",coste_bocadillos);
        double precio_final=coste_bebidas+coste_bocadillos;
            System.out.printf("El precio final es de %.2f €\n",precio_final);
*/

    //Ejercicio 10
    /*
    Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades),
    y se obtiene el número correspondiente. (Numero)

    public static void main(String[] args) {
        System.out.println("Introduce las decenas de mil:");
        Scanner scanner=new Scanner(System.in);
        int decenas_de_mil= scanner.nextInt();

        System.out.println("Introduce las unidades de mil:");
        int unidades_de_mil= scanner.nextInt();

        System.out.println("Introduce las centenas:");
        int centenas= scanner.nextInt();

        System.out.println("Introduce las decenas:");
        int decenas= scanner.nextInt();

        System.out.println("Introduce las unidades:");
        int unidades= scanner.nextInt();

        System.out.printf("Numero introducido:%d%d%d%d%d\n",decenas_de_mil,unidades_de_mil,centenas,decenas,unidades);
    }
 */

    //Ejercicio 11
    /*
    Hágase una aplicación que lea un entero entre 0 y 100.
    Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
     a) Es par
     b) Es mayor que 50
     (CompararEntero)

    public static void main(String[] args) {
        System.out.println("Introduce un valor entero entre el 0 y 100:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero >100 || numero<0) {
            System.out.println("El valor introducido no es valido. Prueba de nuevo");
            return;
        }

        boolean esPar;
        if ((numero % 2 == 0)) {
            esPar = true;
            System.out.printf("Par:%b\n",esPar);
        } else {
            esPar = false;
            System.out.printf("Par:%b\n",esPar);
        }
        boolean mayor50;
        if (numero > 50) {
            mayor50 = true;
            System.out.printf("Mayor que 50:%b\n",mayor50);
        } else {
            mayor50 = false;
            System.out.printf("Par:%b\n",mayor50);
        }
*/
    /*
    public static void main(String[] args) {
        System.out.println("Introduce un valor entero entre el 0 y 100:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        while(true){
                boolean esPar;
            if (numero >100 || numero<0) {
                System.out.println("El valor introducido no es valido. Prueba de nuevo");
                break;
            } else if ((numero % 2 == 0)) {
                esPar = true;
                System.out.printf("Par:%b\n", esPar);
                break;
            } else if ((numero % 2 != 0)){
                esPar = false;
                System.out.printf("Par:%b\n",esPar);
                break; }
            }

        while (true){
            boolean mayor50;
            if (numero >100 || numero<0) {
                break;
            } else if (numero > 50) {
                    mayor50 = true;
                    System.out.printf("Mayor que 50:%b\n",mayor50);
                    break;
                } else if (numero < 50){
                    mayor50 = false;
                    System.out.printf("Mayor que 50:%b\n",mayor50);
                    break;
            }

        }
    }
    */

    //Ejercicio 12
    /*
    1. Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
    a) Son iguales
    b) La primera es menor que la segunda
    c) Son distintas
    (CompararCadenas)


    public static void main(String[] args) {
        System.out.println("Escribe la primera palabra:");
        Scanner scanner=new Scanner(System.in);
        String cadena1 = scanner.nextLine();
        System.out.println("Escribe la segunda palabra:");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)){
        System.out.println("a)Son iguales: true");
        }else {
        System.out.println("a)Son iguales: false");
        }

        if (cadena1.compareTo(cadena2)<0){
        System.out.println("a)La primera es menor que la segunda: true");
        }else {
        System.out.println("a)La primera es menor que la segunda: false");
        }
        */
    /*
        boolean comparacionUno=cadena1.equals(cadena2);
        System.out.printf("Son iguales: %b\n",comparacionUno);

        boolean comparacionDos=cadena1.compareTo(cadena2)<0;
        System.out.printf("La primera es menor que la segunda: %b\n",comparacionDos);
        */

    //Ejercicio 13
    /*
    1. Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso) las siguientes
    condiciones e indíquese cómo se evalúan:
    a) El primero es par y el segundo impar
    b) El primero es superior al doble del segundo e inferior a 8
    c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
    (CompararEnteros)


    public static void main(String[] args) {
        System.out.println("Escribe el primer numero del 0 al 9:");
        Scanner scanner =new Scanner(System.in);
        int numero1= scanner.nextInt();
        System.out.println("Escribe el segundo numero del 0 al 9:");
        int numero2= scanner.nextInt();

        if (numero1%2==0 && numero2%2!=0){
        System.out.println("a) El primero es par y el segundo es impar: cierto");
        } else {
        System.out.println("a) El primero es par y el segundo es impar: falso");
        }

        if (numero1>(2*numero2) && numero1<8) {
        System.out.println("b) El primero es superior al doble del segundo e inferior a 8: cierto");
        } else {
        System.out.println("b) El primero es superior al doble del segundo e inferior a 8: falso");
        }

        if (numero1==numero2 || (numero1-numero2<2 && numero1-numero2>-2)) {
            System.out.println("c) Son iguales o la diferencia entre el primero y el segundo es menor que 2: cierto");
        } else {
            System.out.println("b) Son iguales o la diferencia entre el primero y el segundo es menor que 2: falso");
        }
    }
    */

    //Ejercicio 14
    /*
    Hágase una aplicación que permita introducir la edad de una persona (valores enteros entre 0 y 100),
    su nivel de estudios (valores entre 0 y 10) y sus ingresos (valores enteros entre 0 y 25000).
    Compruébese (mostrándose verdadero o falso) si dicha persona tiene más de 40 años, un nivel de estudios entre 5 y 8,
     ambos incluisives, y gana menos de 15000 €. (CondicionLogica)


    public static void main(String[] args) {
        System.out.println("Introduce tu edad (entre 0 y 100):");
        Scanner scanner = new Scanner(System.in);
        int edad= scanner.nextInt();

        System.out.println("Introduce tu nivel de estudios (entre 0 y 10):");
        int estudios= scanner.nextInt();

        System.out.println("Introduce tus ingresos (entre 0 y 25000):");
        int ingresos= scanner.nextInt();

        boolean comprobacion = edad>40 && estudios >=5 && estudios <=8 && ingresos>=15000;
        System.out.printf("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000:%b\n",comprobacion);

    }
    */

    //Ejercicio 15
    /*
    Se lee un entero que se modifica de la siguiente manera:
    a) Incrementar en 5 unidades (+=5).
    b) Decrementar en 3 unidades(-=3).
    c) Multiplicar por 10 (*=10)
    d) Dividir por 2 (/=2)
    e) Mostrar dicho entero en cada uno de los apartados anteriores.
    (AsignarEntero)

    public static void main(String[] args) {
        System.out.println("Introduce un numero entero:");
        Scanner scanner=new Scanner(System.in);
        int numero= scanner.nextInt();

        numero +=5;
        System.out.printf("Incrementar en 5 unidades:%d\n",numero);
        numero -=3;
        System.out.printf("Decrementar en 3 unidades:%d\n",numero);
        numero *=10;
        System.out.printf("Multiplicar por 10:%d\n",numero);
        numero /=2;
        System.out.printf("Dividir por 2:%d\n",numero);



    }
 */

}


















