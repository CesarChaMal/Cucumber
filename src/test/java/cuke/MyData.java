package cuke;

import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;
import cucumber.deps.com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;

@XStreamConverter(JavaBeanConverter.class)
public class MyData {
    private String name;
    private String rank;
    private String d2 = "Unset";

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", d2='" + d2 + '\'' +
                '}';
    }
}
