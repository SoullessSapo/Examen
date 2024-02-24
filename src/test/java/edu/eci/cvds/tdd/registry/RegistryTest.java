package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private final Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
    @Test
    public void validateDeadPerson() {
        Person person = new Person();
        person.setAlive(false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateAgePerson(){
        Person person = new Person();
        person.setAge(118);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(
                RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateUnderagePerson(){
        Person person = new Person();
        person.setAge(17);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals( RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateGenre(){
        Person person = new Person();
        person.setGender(Gender.UNIDENTIFIED);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(result, RegisterResult.ZOO_SAMPLE);
    }
    @Test
    public void validaten(){

    }
}