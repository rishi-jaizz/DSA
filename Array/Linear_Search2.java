package Array;

public class Linear_Search2 {
    public static int linearSearch(String[] names, String key){
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(key)){  // Use .equals() for string comparison
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String names[] = {"Rishi","Saksham","Himank","Shivang","Yashwant","Gaurang"};
        String key = "Himank";

        int index = linearSearch(names, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at the index: " + index);
        }
    }
}
