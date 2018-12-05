public class Task11 {

    public static void main(String[] args) {
        int totalTimeSec = 50000000;

        int secInMinute = 60;
        int secInHour = secInMinute*60;
        int secInDay = secInHour*24;


        System.out.printf("До Нового года осталось %d секунд.\n",totalTimeSec);

        int tmp = totalTimeSec;
        System.out.printf("Или: %d дней, ",tmp/secInDay);
        tmp %= secInDay;
        System.out.printf("%d часов, ",tmp/secInHour);
        tmp %= secInHour;
        System.out.printf("%d минут, ",tmp/secInMinute);
        tmp %= secInMinute;
        System.out.printf("%d секунд.",tmp);
    }


}
