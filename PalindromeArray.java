public class PalindromeArray {
 public static void main(String[] args) {
    int [] num = {10,20,30,0,10};
    int i=0;
    int j=num.length-1;
    while (i<=j) {
        if (num[i]!=num[j]) {
            System.out.println("Given Array is not palindrom");
            break;
        }
     i++;
     j--;   
    }
    if (i>=j) {
        System.out.println("Given Array palindrom");
    }
    
 }   
}
