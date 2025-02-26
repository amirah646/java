import java.util.ArrayList;

public class MergeArray{
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] b = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        ArrayList<Integer> mergedList = mergeSortedArrays(a, b);
        System.out.println(mergedList);
    }

    public static ArrayList<Integer> mergeSortedArrays(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, lastAdded =0;

        while (i < a.length || j < b.length) {
            int val;
            if (i < a.length && (j >= b.length || a[i] < b[j])) {
                val = a[i++];
            } else if (j < b.length && (i >= a.length || a[i] > b[j])) {
                val = b[j++];
            } else { 
                val = a[i++];
                j++;
            }

            if (val != lastAdded) { 
                result.add(val);
                lastAdded = val;
            }
        }
        return result;
    }
}
