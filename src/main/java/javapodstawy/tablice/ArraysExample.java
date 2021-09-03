package javapodstawy.tablice;


public class ArraysExample {
    public static void main(String[] args) {
        int tab[] = {1, 2, 3, 4};
        char tab2[] = {'a', 'b', 'c'};

        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

        for (char el : tab2){
            System.out.println(el);
        }
    }

}

