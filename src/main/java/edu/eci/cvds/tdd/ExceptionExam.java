package edu.eci.cvds.tdd;

public class ExceptionExam extends Exception {
    public final static String ERROR_AGE ="edad invalida";
    public  ExceptionExam(String message){
        super(message);
    }
}
