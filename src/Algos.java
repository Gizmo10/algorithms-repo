import java.util.ArrayList;

public class Algos {

    public static int[] mergedAndSorted(int [] listA,int [] listB){

        int listALength = listA.length;
        int listBLength = listB.length;
        int indexToAppendFrom = 0;

        for(int i = 0;i < listALength;i++){

            if(listA[i] == 0 ){

                indexToAppendFrom = i;
                i = listALength;
            }
        }

        if(listB[0] >= listA[indexToAppendFrom - 1]){

            int temp = indexToAppendFrom;

            for(int j = 0;j < listBLength;j++){

                listA[temp] = listB[j];
                temp++;
            }

        }else if(listB[listBLength - 1] <= listA[0]){

            for(int i = indexToAppendFrom - 1;i >= 0;i--){

                listA[i + listBLength] = listA[i];
            }

            for(int j = 0;j < listBLength;j ++){

                listA[j] = listB[j];
            }
        }else{

            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < indexToAppendFrom;i++){

                for(int j = 0; j < listBLength;j++){

                    if(listA[i] < listB[j]){

                        temp.add(listA[i]);
                        j = listBLength;
                    }else{

                        temp.add(listB[j]);
                    }
                }
            }

            System.out.println(temp);

        }

        return listA;
    }
}
