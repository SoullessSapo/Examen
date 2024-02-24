package edu.eci.cvds.tdd;
import org.junit.Assert;
import org.junit.Test;

public class ExamTest {
    @Test
    public void validateUnderagePerson() throws Exception {
        Assert.assertTrue(Exam.isUnderage(17));
    }
    @Test
    public void validateIsNotUnderage() throws Exception {
        Assert.assertFalse(Exam.isUnderage(18));
    }
    @Test
    public void validateNegative() {
        try {
            Exam.isUnderage(-10);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals(ExceptionExam.ERROR_AGE,
                    e.getMessage());
        }
    }
}
