import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value){
        for (int i : arr){
            if (i == value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {3,44,2,3,44,5,6,77,8,9,8,88,91,22,22};
        int[] repeatList = new int[list.length];
        int indexNumber = 0;
        for (int i = 0;i < list.length;i++){
            for (int j = 0;j < list.length;j++){
                if ((i != j) && list[i] == list[j] && list[i] % 2 == 0){
                    if (isFind(repeatList,list[i])){
                        repeatList[indexNumber] = list[i];
                        indexNumber++;
                    }
                }
            }
        }
        for (int value : repeatList){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}