
class demo{
    public static void main(String[] args){
        String str="Ram";
        String temp="";
        for(int i=str.length()-1;i>=0;i--)
            temp=temp+str.charAt(i);
            if(str==temp)
            System.out.print("palindrome");
            else
            System.out.print("not palindrome");
        
    }
}