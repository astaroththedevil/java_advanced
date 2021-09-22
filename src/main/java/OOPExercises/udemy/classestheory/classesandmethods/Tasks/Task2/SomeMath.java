package OOPExercises.udemy.classestheory.classesandmethods.Tasks.Task2;

public class SomeMath {

    private int[] array;

    public SomeMath(int[] array) {
        this.array = array;
    }

    public int sumArray(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public double average(int [] array){

        return sumArray(array) / array.length;
        }


    public int min(int [] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public int max(int [] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
