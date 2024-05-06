public class Demo{
    public static void main(String[] args) {
        String sentence = "ram is a good boy";
        
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
} 