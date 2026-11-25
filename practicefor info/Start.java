public class Start{

    //reverse a string
    public static String ReverseString(String s)
    {
        String rev ="";
        
        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            rev +=ch;
            


        }
        return rev;


    }

    //palindrome
    public static boolean isPalindomeString(String s)
    {
        String original =s;
        String rev ="";
        boolean isPalindrome = false;
        
        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            rev +=ch;
            


        }

        if(original.equals(rev)){
            isPalindrome=true;
        }
        return isPalindrome;


    }
    //count words in string

    public static int CountNumberofWords(String s){
        int count =0;
        String[] arr = s.split(" ");
        for(String one:arr){
            count++;
        }
        return count;
    }
    //count how many time a given charcter accur

    public static int NumbercountCharcter(String s,char c)
    {
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==c){
                count++;

            }
        }
        return count;
    }
    
    public static void main(String[] args) {


        String str = "The king is back to rule";
        String s1 = "madam";
        char ch ='m';
        String one=ReverseString(str);
        System.out.println(one);

        boolean e=isPalindomeString(s1);
        System.out.println(e);

        int n = CountNumberofWords(str);
        System.out.println(n);
        System.out.println(str.trim());

         int ok = NumbercountCharcter(s1,ch);
        System.out.println(ok);
    }
}