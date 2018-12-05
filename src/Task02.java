public class Task02 {
    public static void main(String[] args) {
        int n = 456;
        int tmp = n;
        int sum =0;
        while (tmp!=0){
            sum += tmp%10;
            tmp /= 10;
        }
        System.out.printf("Сумма цифр числа %d: %d\n",n,sum);
    }
}
