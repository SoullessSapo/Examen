package edu.eci.cvds.tdd.registry;
public class Registry {
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        if(p.isAlive() && p.getAge()!= 0 && p.getGender() != null) {
            return RegisterResult.VALID;
        };
        if(!p.isAlive()&& p.getAge()!= 0 && p.getGender() != null){
            return RegisterResult.DEAD;
        }
        if(p.getAge() >= 118){
            return RegisterResult.INVALID_AGE;
        }
        if(p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        }
        if (p.getGender() == Gender.UNIDENTIFIED){
            return RegisterResult.ZOO_SAMPLE;
        }
        return RegisterResult.GOOD;
    }
}