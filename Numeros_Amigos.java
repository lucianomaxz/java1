import java.util.Scanner;

public class Numeros_Amigos {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int nro=entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int nro2=entrada.nextInt();

        amigos(nro, nro2);

        perfecto(nro);

        narcisista(nro);

    }


    public static void amigos(int a, int b){

        int result=0,result2=0;
        for (int i=1;i<a-1;i++){
            if(a % i==0){
                result=result+i;
            }
        }

        for (int j=1;j<b-1;j++){
            if(b % j==0){
                result2=result2+j;
            }
        }

        if(result==b && result2==a){
            System.out.println("Son numeros amigos");
        }else {
            System.out.println("No son numeros amigos");

        }

    }


    public static void perfecto(int a){
        int total=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                total=total+i;
            }
        }

        if(total==a) {
            System.out.println("Es perfecto");
        }else {
            System.out.println("No es perfecto");
        }
    }


public static void narcisista(int a){
        int cifras=a,cont=0,resto=0;
        double total=0;

        for(int j=0;j<10;j++){
            if(a>0){
                a=a/10;
                cont++;
            }
        }
        a=cifras;

        for(int i=0;i<cont;i++){
                resto = cifras % 10;
                total=total+Math.pow(resto,cont);
                cifras=cifras/10;

        }
          if (a==total) {
              System.out.println("Es narcisista");
          }else {
            System.out.println("No es narcisista");
          }
}




}