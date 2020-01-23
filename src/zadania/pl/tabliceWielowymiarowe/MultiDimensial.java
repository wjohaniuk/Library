package zadania.pl.tabliceWielowymiarowe;

public class MultiDimensial {
    public static void main(String[] args) {
//        int[][] tab = new int[3][3];
//
//        String[] firstNames = {"Jan", "Leszek", "Tomek"};
//        String[] lastNames = {"Nowak", "Kowal", "Wodecki"};
//        String[][] firstLast = {firstNames, lastNames};
//
//        System.out.println(firstLast[0][1] + " " + firstLast[1][2]);
//        System.out.println(firstLast[0][2] + " " + firstLast[1][0]);
//        System.out.println(firstLast[1].length);
//        System.out.println(firstLast[0].length);
//        System.out.println(firstLast.length);


        double[][] tab1 = new double[3][3];
        tab1[0][0] = (1.0);
        tab1[0][1] = (1.5);
        tab1[0][2] = (2.0);
        tab1[1][0] = (1.5);
        tab1[1][1] = (2.0);
        tab1[1][2] = (2.5);
        tab1[2][0] = (2.0);
        tab1[2][1] = (2.5);
        tab1[2][2] = (3.0);

        double product1 = tab1[0][0] * tab1[1][1] * tab1[2][2];
        double product2 = tab1[0][2] * tab1[1][1] * tab1[2][0];
        double sumOfProducts = product1 + product2;
        System.out.println(sumOfProducts);

        double centerSum1 = tab1[0][1] + tab1[1][1] + tab1[2][1];
        double centerSum2 = tab1[1][0] + tab1[1][1] + tab1[1][2];
        double productOfSums = centerSum1 * centerSum2;
        System.out.println(productOfSums);

        double sums = tab1[0][0] + tab1[0][1] + tab1[0][2] + tab1[1][2] + tab1[2][2] + tab1[2][1] + tab1[2][0] + tab1[1][0];
        System.out.println(sums);

    }
}
