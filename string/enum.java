class Demo{
    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Weekday day = Weekday.MONDAY;


        String result = day.toString();

        
        System.out.println(result);
    }
}
