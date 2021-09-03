package javapodstawy.algorytmy;

public class FindElement {

    public static boolean findGivenElement(int [] array, int givenElement){
        boolean isFound = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == givenElement){
                isFound = true;
            }
        }
        return isFound;
    }


    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(findGivenElement(array, 7));
    }
}
