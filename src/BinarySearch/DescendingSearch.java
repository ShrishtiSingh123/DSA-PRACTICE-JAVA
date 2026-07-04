package BinarySearch;

public class DescendingSearch  {
    public static void main(String[] args) {
        int [] arr = {100, 91, 87, 33, 28, 13, 10, 4};
        int s = 0;
        int e = arr.length - 1;
        int target = 13;
        while (s <= e) {
            int mid = s + (e - s) / 2;
if(arr[mid] == target)
{
    System.out.println(mid);
    return;
}else  if(arr[mid] > target)
{
    s = mid + 1;
} else
{
    e = mid - 1;
}
        }
        System.out.println("Element not found");
    }

}
