import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Palindrome {
    public static boolean isPalindrome(String word) {
        String kalimat = toUpperCase(word);
        String kebalikan = "";
        int panjang = kalimat.length();
        
        for(int i = panjang - 1; i >= 0; i--){
            kebalikan = kebalikan + kalimat.charAt(i);
        }
        return kalimat.equals(kebalikan);
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
