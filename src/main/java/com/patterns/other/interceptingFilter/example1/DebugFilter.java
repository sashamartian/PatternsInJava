package main.java.com.patterns.other.interceptingFilter.example1;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}