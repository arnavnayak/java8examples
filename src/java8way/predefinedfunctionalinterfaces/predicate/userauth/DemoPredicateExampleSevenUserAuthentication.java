package java8way.predefinedfunctionalinterfaces.predicate.userauth;

import java.util.Scanner;
import java.util.function.Predicate;

public class DemoPredicateExampleSevenUserAuthentication {

    public static void main(String[] args){
        Predicate<User> userAuthPredicate = u->u.getUserName().equalsIgnoreCase("arnav") && u.getPassword().equals("admin");
        System.out.println("User Authentication Program");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter the username : ");
        String userName= sc.nextLine();
        System.out.println("Please enter the password : ");
        String password= sc.nextLine();
        User user = new User(userName,password);
        userAuth(userAuthPredicate,user);

    }

    public static void userAuth(Predicate<User> p,User user){
        if(p.test(user)){
            System.out.println("User Authenticated !!!");
            System.out.println("Welcome "+user.getUserName()+" !!! ");
        }else{
            System.out.println("Access Denied !!!");
        }
    }
}
