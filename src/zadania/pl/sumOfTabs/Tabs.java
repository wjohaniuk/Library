package zadania.pl.sumOfTabs;

public class Tabs {
    public static void main(String[] args) {
        ArrayUtilis utilis = new ArrayUtilis();
        int[] tab1 = {3,5,6};
        int[] tab2 = {8,1,9};

        int sum = utilis.sumArrays(tab1,tab2);
        System.out.println(sum);
    }
}
