package mda.practico_1;

public interface IIntro {

    /** Prints to console a hello world message.*/
    public void HelloWorld();

    /** Prints to console the odd numbers between 0 and 50.*/
    public void EJ_1();

    /** Calculates and prints to console the average of the supplied params,
     * the amount of even ints in between the supplied params, and the sum
     * of the absolute value of the supplied params.
     * @param numA
     * @param numB
     * @return      Sum of absolute value of numA & numB*/
    public int EJ_2(int numA, int numB);

    /** Prints to console every digit of the supplied param.
     * @param numA  Positive non zero.*/
    public void EJ_3(int numA);

    /** Calculates and prints to console the sum of integers from the lowest supplied param
     * up to the highest supplied param, and prints to console the highest supplied param.
     * @param numA
     * @param numB*/
    public void EJ_4(int numA, int numB);


}
