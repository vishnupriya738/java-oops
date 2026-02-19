import java.io.*;
import java.util.*;

class Student {
    String name = "Jerin";
    String batch = "MCA";
}

class Sports extends Student {
    String sports = "Cricket";
}

class Result extends Sports {
    String result = "Wins";

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student class: " + batch);
        System.out.println("Student participated in: " + sports);
        System.out.println("Student result: " + result);
    }
}

class Score {
    public static void main(String args[]) {
        Result r = new Result();
        r.display();
    }
}

