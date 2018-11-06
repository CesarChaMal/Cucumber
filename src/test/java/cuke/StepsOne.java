package cuke;

import cucumber.api.java.en.Given;

public class StepsOne {
    DomainModel dm;

    public StepsOne(DomainModel dm) {
        this.dm = dm;
    }
    @Given("I start this with a count of (\\d+)")
    public void setupCount(int count) {
        dm.setCount(count);
    }

}
