public class Task09 {
    public static void main(String[] args) {
        float n = 3.14f;

        if ((n-(int)(n/1))!=0){
            System.out.printf("Число %.2f имеет вещественную часть.",n);
        }else{
            System.out.printf("Число %.2f не имеет вещественную часть.",n);
        }
    }
}
