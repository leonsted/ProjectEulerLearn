public class Task06 {
    /*
     * Сумма квадратов первых десяти натуральных чисел
     * 12 + 22 + ... + 102 = 385
     * Квадрат суммы первых десяти натуральных чисел
     * (1 + 2 + ... + 10)2 = 552 = 3025
     * Следовательно, разность между суммой квадратов и квадратом суммы первых десяти натуральных чисел
     *  составляет 3025 − 385 = 2640.
     * Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.
     */

    public static void main(String[] args) {
        int sum =0;
        int i =0;
        int a=0;
        int b=0;
        int c=0;
        for (i=1;i<=100;i++)
        {
            a += i*i;
        }
        for (i=1;i<=100;i++)
        {
            c = c+i;
            b = c*c;
        }
        sum = b-a;
        System.out.println(sum);
    }
}
