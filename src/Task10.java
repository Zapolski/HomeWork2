public class Task10 {
    public static void main(String[] args) {
        final float height = 182;
        final float weight = 70;

        float idealWeight = height-110;

        float correct = idealWeight-weight;
        if (correct>0){
            //набрать
            System.out.printf("До идельного веса Вам нужно набрать %.2f кг",correct);
        } else if (correct<0){
            //похдуеть
            System.out.printf("До идельного веса Вам нужно похудеть на %.2f кг",Math.abs(correct));
        }else{
            System.out.println("У Вас идеальный вес!");
        }
    }
}
