public class ForPractice07 {
    public static void main(String[] args) {
        for (int r = 1; r <= 4; r++){
            System.out.println();
            for (int i = 1; i <= 5-r ; i++) {
                System.out.print("*");
            }
        }
    }
}