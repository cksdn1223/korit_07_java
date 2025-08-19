package practice.test;

import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}

public class Test1 {
    public static void main(String[] args) {
        Company company = new Company(100, "Apple",
                "Apple Computer Inc. 1 infinite Loop", "Cupertino",
                "CA","95014");
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        System.out.println(gsonBuilder.create().toJson(company));
    }
}
