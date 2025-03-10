import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    static int binarySearch(List<Integer> list, int low, int high, int ele)
    {
        int mid = low + (high - low) / 2;

        if(list.get(mid) == ele)
            return mid;

        if(list.get(mid) > ele)
            return binarySearch(list,low,mid-1,ele);


       return binarySearch(list,mid+1,high,ele);

    }

    public static void main(String[] args)
    {

        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);

        int position = binarySearch(elements,0,elements.size()-1,3);
        position++;

        System.out.println(" the element is present at position " + position);


    }
}
