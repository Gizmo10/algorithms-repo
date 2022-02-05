import java.util.Arrays;

public class Main {

        public static void main(String [] args){

            int [] listA = {6,60,67,700,756,800,0,0,0,0};
            int [] listB = {10,65,1200,5105};

            int [] listC = Algos.mergedAndSorted(listA,listB);

            System.out.println(Arrays.toString(listC));
        }

}
