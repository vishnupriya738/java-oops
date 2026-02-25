
import java.io.*;
import java.util.*;

class userException extends Exception {
    public userException(String s) {
        super(s);
    }
}

class except {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String uname, pass;

        try {
            System.out.println("enter username:");
            uname = sc.nextLine();
            if (uname.equals("")) {
                throw new userException("No User Name...");
            }
            if (uname.length() < 8) {
                throw new userException("greater than 8 characters...");
            }
        } catch (userException e) {
            System.out.println("username error");
        }

        try {
            System.out.println("enter password");
            pass = sc.nextLine();
            if (pass.equals("")) {
                throw new userException("invalid password!!!");
            }
            if (pass.length() > 8) {
                throw new userException("password should not be greater than 8 characters...");
            }
        } catch (userException es) {
            System.out.println("password error");
        }
    }
}

