package mda.practico_1;

public class Main {

    public static void main(String[] args) {
        Intro i = new Intro();
        Utils u = new Utils();
        Triangle t = new Triangle();

        i.HelloWorld();
        u.PrintSeparatorLine();
        i.EJ_1();

        u.PrintSeparatorLine();
        i.EJ_2(34,56);
        i.EJ_2(-1,20);
        i.EJ_2(40,23);

        u.PrintSeparatorLine();
        i.EJ_3(5);
        i.EJ_3(1523);
        i.EJ_3(20);
        i.EJ_3(100000);

        u.PrintSeparatorLine();
        i.EJ_4(5,8);

        u.PrintSeparatorLine();
        int lado_5 = 5;
        int lado_3 = 3;
        int lado_4 = 4;
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_3 +", "+ lado_5 + " es Isoceles : " +      t.esIsosceles(lado_5,lado_3,lado_5));
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_3 +", "+ lado_5 + " es Escaleno : " +      t.esEscaleno(lado_5,lado_3,lado_5));
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_3 +", "+ lado_5 + " es Equilatero : " +    t.esEquilatero(lado_5,lado_3,lado_5));
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_3 +", "+ lado_5 + " es Recto : " +         t.esRecto(lado_5,lado_3,lado_5));
        System.out.println();
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_5 +", "+ lado_5 + " es Isoceles : " +      t.esIsosceles(lado_5,lado_5,lado_5));
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_5 +", "+ lado_5 + " es Escaleno : " +      t.esEscaleno(lado_5,lado_5,lado_5));
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_5 +", "+ lado_5 + " es Equilatero : " +    t.esEquilatero(lado_5,lado_5,lado_5));
        System.out.println("El triangulo de lados: "+ lado_5 +", "+ lado_5 +", "+ lado_5 + " es Recto : " +         t.esRecto(lado_5,lado_5,lado_5));
        System.out.println();
        System.out.println("El triangulo de lados: "+ lado_3 +", "+ lado_5 +", "+ lado_4 + " es Isoceles : " +      t.esIsosceles(lado_3,lado_5,lado_4));
        System.out.println("El triangulo de lados: "+ lado_3 +", "+ lado_5 +", "+ lado_4 + " es Escaleno : " +      t.esEscaleno(lado_3,lado_5,lado_4));
        System.out.println("El triangulo de lados: "+ lado_3 +", "+ lado_5 +", "+ lado_4 + " es Equilatero : " +    t.esEquilatero(lado_3,lado_5,lado_4));
        System.out.println("El triangulo de lados: "+ lado_3 +", "+ lado_5 +", "+ lado_4 + " es Recto : " +         t.esRecto(lado_3,lado_5,lado_4));

        u.PrintSeparatorLine();
        ClubMember c1 = new ClubMember("Juan");
        ClubMember c2 = new ClubMember("Pedro");

        System.out.println("Miembro numero: " + c1.GetID() + " nombre: " + c1.GetName());
        System.out.println("Miembro numero: " + c2.GetID() + " nombre: " + c2.GetName());
    }
}
