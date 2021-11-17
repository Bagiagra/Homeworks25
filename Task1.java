package by.overone.lesson25homework;

public class Task1 {
    public static void main(String[] args){

    String a = null ;
    try {
        System.out.println(a.length());
    } catch (NullPointerException e) {
        System.out.println("Error!Please change the value of the String a");
    }

}
}
