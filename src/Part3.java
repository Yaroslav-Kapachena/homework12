public class Part3 {
    public static void main(String[] args) {
        int numbersArray[] = new int[8];
        numbersArray[0] = 47;
        numbersArray[1] = 78;
        numbersArray[2] = 89;
        numbersArray[3] = 56;

        numbersArray[4] = 98;
        numbersArray[5] = 500;
        numbersArray[6] = 87;
        numbersArray[7] = 76;
        int max = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > max) {
                max = numbersArray[i];
            }
        }
        System.out.println(max);
    }
}