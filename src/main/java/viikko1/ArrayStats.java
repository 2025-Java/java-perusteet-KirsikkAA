package viikko1;

//public static double average(int[] arr) — palauta keskiarvo double-tyyppisenä, tyhjän taulukon tapauksessa 0.0.
public class ArrayStats {
    public static double average(int[] arr) {
    if (arr.length == 0){
        return 0.0;
    }
    double sum = 0;
    for (int num : arr){
        sum += num;
    }
    return sum / arr.length;
}

//public static int max(int[] arr) — palauta suurin arvo, tyhjän taulukon tapauksessa Integer.MIN_VALUE.
public static int max(int[] arr) {
     if (arr.length == 0){
        return Integer.MIN_VALUE;
        }

        int largest = arr[0];
        for(int num : arr){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }
}


