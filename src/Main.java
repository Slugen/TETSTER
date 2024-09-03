public class Main {
    public static void main(String[] args) {
        System.out.println("Спокойной ночи мир !!!");
        int year=4320;
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+"год являесться високосным");
        }else{
            System.out.println(year+"год не являесться високосным");
        }


        for (int i = 1; i <= 5; i++) {

        }
    }
}