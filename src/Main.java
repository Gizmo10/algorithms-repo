import java.util.Arrays;

public class Main {

        public static void main(String [] args){

            int [] listA = {1,3,4,7,11,0,0,0};
            int [] listB = {2,5,12};

            int [] listC = Algos.mergedAndSorted(listA,listB);

            System.out.println(Arrays.toString(listC));
        }

}
