package mda.practico_1;

public class Intro implements IIntro{


    @Override
    public void HelloWorld(){
        System.out.println("Hello World!");
    }

    @Override
    public void EJ_1(){
        System.out.println("Numeros impares entre 1 y 50: ");
        String s  = "";
        int max = 50;
        for (var i = 0; i < max; i++){
            if(i % 2 != 0 ){
                s += (i != max-1)? i +", " : i +".";
             }
        }
        System.out.println(s);
    }

    @Override
    public int EJ_2(int numA, int numB){
        int sumOfabs = Math.abs(numA) + Math.abs(numB);
        int avg =  Math.round((sumOfabs)/2);
        int ammountOfEven = 0;

        // make sure numA is lower than numB
        if (numA > numB){
            int temp = numA;
            numA = numB;
            numB = temp;
        }

        for (int i = numA; i < numB ; i++){
            if(i % 2 == 0){
                ammountOfEven++;
            }
        }

        System.out.println("Promedio entre los dos parametros: " + avg);
        System.out.println("Suma de valores absolutos de parametros: " + sumOfabs);
        System.out.println("Cantidad de numeros pares entre los parametros: " + ammountOfEven);

        return sumOfabs;
    }

    @Override
    public void EJ_3(int numA){
        String s = Integer.toString(numA);
        String result = "";
        int l = s.length();

        for (int i = 0; i< l; i++){
            result += (i != l-1)? s.charAt(i) +", " : s.charAt(i) +".";
        }

        System.out.println(result);
    }

    @Override
    public void EJ_4(int numA, int numB){
        boolean numAIsLowest = (numA<numB);

        // make sure numA is lower than numB
        if (!numAIsLowest){
            System.out.println("El mayor de los parametros es: " + numA);
            int temp = numA;
            numA = numB;
            numB = temp;
        }else{
            System.out.println("El mayor de los parametros es: " + numB);
        }

        int sum = numA;
        for (int i = numA+1; i <= numB ; i++){
            sum += i;
        }
        System.out.println("La suma de los numeros entre "+numA+" y "+numB+" es: " + sum);
    }

}
