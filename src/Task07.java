public class Task07 {
    public static void main(String[] args) {
        float yearPercent = 24f;
        float valueOfContribution = 2000;
        float countMonth = 0.5f;

        //формула простых процентов
        float result = valueOfContribution+(valueOfContribution*yearPercent*countMonth)/(12*100);

        System.out.printf("Сумма вклада через %.2f месяц при исходном вкладе %.2f и процентной ставке %.2f: %.2f",
                countMonth,valueOfContribution,yearPercent,result);
    }

}
