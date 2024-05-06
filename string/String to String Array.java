
class Demo{
    public static void main(String[] args) {
        // Define a string
        String str = "hello ,india";
        String[] strArray = str.split(",");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
} 