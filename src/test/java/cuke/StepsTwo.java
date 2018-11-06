package cuke;

import cucumber.api.java.en.When;

public class StepsTwo {
    DomainModel dm;

    public StepsTwo(DomainModel dm) {
        this.dm = dm;
    }

    @When("^I ponder how many there are$")
    public void doTheTrigger() {
        dm.trigger();
    }
}
