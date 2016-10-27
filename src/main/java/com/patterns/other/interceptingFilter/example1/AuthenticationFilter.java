package main.java.com.patterns.other.interceptingFilter.example1;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
