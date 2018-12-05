public class Task08 {
    public static void main(String[] args) {
        final float timeSec = 5;
        final float speedSoundMetrPerSec = 331f;
        System.out.printf("Расстояние до места удара молнии при времени между вспышкой и раскатом %.2f секунд: %.2f метров",
                timeSec,timeSec*speedSoundMetrPerSec);
    }
}
