public class Task02 {
    /*
     * Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
     * Начиная с 1 и 2, первые 10 элементов будут:
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * Найдите сумму всех четных элементов ряда Фибоначчи,
     * которые не превышают четыре миллиона.
     */
    public static void main(String[] args) {
        double fibSumm = 0;
        double fA = 1;
        double fB = 1;
        double fC = 0;

        do {
            fC = fA + fB;
            fA = fB;
            fB = fC;

            if ((fC % 2) == 0)
                fibSumm += fC;
        }
        while (fC < 4000000);
        System.out.println(fibSumm);
    }
}

