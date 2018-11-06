package cuke;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;
import org.junit.Assert;

import java.util.List;

public class StepsThree {
    DomainModel dm;

    public StepsThree(DomainModel dm) {
        this.dm = dm;
    }

    @Then("^I find there are (\\d+)$")
    public void discovery(int count) {
        Assert.assertEquals("There should be " + count, count, dm.getCount());
    }

    @Given("I have these soldiers")
    public void army(List<MyData> md) {

//    public void army(@Transform(MyDataConverter.class) List<MyData> md) {
        System.err.println("Got MyData: " + md);

//    public void army(List<List<String>> lls) {
//        System.err.println("list size is " + lls.size());;
//        lls.forEach(l -> {
//            System.err.println("--------------");
//            l.forEach(System.err::println);
//        });
    }
}
