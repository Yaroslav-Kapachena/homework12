public class Partt5 {
    public static void main(String[] args) {
        int[] numbersArray = new int[9];
        numbersArray[0] =98;
        numbersArray[1] =56;
        numbersArray[2] =67;
        numbersArray[3] =797;
        numbersArray[4] =684;
        numbersArray[5] =56;
        numbersArray[6] =32;
        numbersArray[7] =6;
        numbersArray[8] =4;
        int min = numbersArray[0];
        for(int i = 0; i< numbersArray.length;i++){
            if(numbersArray[i] < min){
               min = numbersArray[i];
            }
        }
        System.out.println(min);
    }
}
