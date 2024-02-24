package edu.eci.cvds.tdd;

import static edu.eci.cvds.tdd.ExceptionExam.ERROR_AGE;

public class Exam {
    public static boolean isUnderage(int age) throws Exception {

        if (age < 18 &&
                age >= 0) {
            return true;
        }
        if(age >= 18){
            return false;
        }
        if (age < 0) {
            throw new Exception(ERROR_AGE);
        }
        return false;
    }
}
