public class Task12 {
    public static void main(String[] args) {
        final float glassForThinSchoolboy = 0.2f;
        final float milkPackage = 0.9f;
        final int countcakeForSchoolboy = 1;
        final int councakeForThinSchoolboy = 2;

        int countSchoolboys = 500;

        int countCake = 0;
        int countMilkPackage = 0;

        System.out.println("Если в школе 100% всех учеников имеют вес меньше 30 кг.");
        countCake = countSchoolboys*councakeForThinSchoolboy;
        countMilkPackage = (int)Math.ceil((glassForThinSchoolboy*countSchoolboys)/milkPackage);
        System.out.printf("Школьников: %d\nНужно пирожков: %d\nНужно пакетов молока: %d\n",
                countSchoolboys,countCake,countMilkPackage);

        System.out.println("Если в школе 60% всех учеников имеют вес меньше 30 кг.");
        countCake = Math.round(0.6f*countSchoolboys)*councakeForThinSchoolboy
                +Math.round(0.4f*countSchoolboys)*countcakeForSchoolboy;
        countMilkPackage = (int)Math.ceil((glassForThinSchoolboy*Math.round(0.6*countSchoolboys))/milkPackage);
        System.out.printf("Школьников: %d\nНужно пирожков: %d\nНужно пакетов молока: %d\n",
                countSchoolboys,countCake,countMilkPackage);

        System.out.println("Если в школе 1% всех учеников имеют вес меньше 30 кг.");
        countCake = Math.round(0.01f*countSchoolboys)*councakeForThinSchoolboy
                +Math.round(0.99f*countSchoolboys)*countcakeForSchoolboy;
        countMilkPackage = (int)Math.ceil((glassForThinSchoolboy*Math.round(0.01*countSchoolboys))/milkPackage);
        System.out.printf("Школьников: %d\nНужно пирожков: %d\nНужно пакетов молока: %d\n",
                countSchoolboys,countCake,countMilkPackage);
    }
}
