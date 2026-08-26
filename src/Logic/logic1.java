public class logic1 {
    public static void main(String[] args) {
        int money = 15;
        int chocolates = money;
        int wrappers = chocolates;

        while (wrappers >= 3) {
            int newChocolates = wrappers / 3;
            chocolates += newChocolates;
            wrappers = (wrappers % 3) + newChocolates;
        }

        System.out.println("Total chocolates = " + chocolates);
    }
}