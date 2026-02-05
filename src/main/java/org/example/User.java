package org.example;

public record User(Integer id,String name,String location) {
}
class mainDemo{
    public static void main(String[] args) {
        User user=new User(101,"anil","hyderabad");
        System.out.println(user);
    }

}
