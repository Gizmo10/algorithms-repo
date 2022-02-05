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

            for(int i = 0;i < listBLength;i++){

                for(int j = 0;j < indexToAppendFrom;j++){

                    if(listB[i] < listA[j]){

                        for(int k = indexToAppendFrom - 1;k >= j;k--){

                            listA[k + 1] = listA[k];
                        }

                        indexToAppendFrom++;
                        listA[j] = listB[i];
                        j = indexToAppendFrom;

                    }else if((listB[i] > listA[j]) && (j == indexToAppendFrom - 1)) {

                        listA[indexToAppendFrom] = listB[i];
                        indexToAppendFrom++;
                    }
                }
            }

        }

        return listA;
    }
}
