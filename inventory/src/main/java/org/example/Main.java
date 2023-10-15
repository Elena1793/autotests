package org.example;

import mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements;
import mfc.properties.entitiesProperties.*;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LocalTime marker = LocalTime.now();
        System.out.println(marker);
        LocalDate DateTime=LocalDate.now();
        System.out.println(DateTime);

        String FirstName="test";
        String date = "28-05_1";
        List<Object[]> data = new ArrayList<Object[]>();
        Object [] en={UserMenu_WebElements.English_language, new BookingType(UserMenu_WebElements.English_language).Private  ,
                new Source(UserMenu_WebElements.English_language).Call, new JobType(UserMenu_WebElements.English_language).Export,
                new Mode(UserMenu_WebElements.English_language).Air_AIR, new ServiceType(UserMenu_WebElements.English_language).DTD,
                new ServiceLevel(UserMenu_WebElements.English_language).Full_Origin_Service,FirstName+"En"+date, "check", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.English_language).Albania,
                new Country(UserMenu_WebElements.English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"};


        data.add(new Object[]{UserMenu_WebElements.English_language, new BookingType(UserMenu_WebElements.English_language).Private  ,
                new Source(UserMenu_WebElements.English_language).Call, new JobType(UserMenu_WebElements.English_language).Export,
                new Mode(UserMenu_WebElements.English_language).Air_AIR, new ServiceType(UserMenu_WebElements.English_language).DTD,
                new ServiceLevel(UserMenu_WebElements.English_language).Full_Origin_Service,FirstName+"En"+date, "check", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.English_language).Albania,
                new Country(UserMenu_WebElements.English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Franch_language, new BookingType(UserMenu_WebElements.Franch_language).Private,
                new Source(UserMenu_WebElements.Franch_language).Call,
                new JobType(UserMenu_WebElements.Franch_language).Export,
                new Mode(UserMenu_WebElements.Franch_language).Air_AIR, new ServiceType(UserMenu_WebElements.Franch_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Franch_language).Full_Origin_Service,FirstName+"Fr"+date, "check", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Franch_language).Albania,
                new Country(UserMenu_WebElements.Franch_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.German_language, new BookingType(UserMenu_WebElements.German_language).Private,
                new Source(UserMenu_WebElements.German_language).Call,
                new JobType(UserMenu_WebElements.German_language).Export,
                new Mode(UserMenu_WebElements.German_language).Air_AIR, new ServiceType(UserMenu_WebElements.German_language).DTD,
                new ServiceLevel(UserMenu_WebElements.German_language).Full_Origin_Service,FirstName+"Gd"+date, "check", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.German_language).Albania,
                new Country(UserMenu_WebElements.German_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        Object [] fa=data.get(1);
        for (Object ob:fa) {
            System.out.println(ob.toString());
        }
        Object[] pr={UserMenu_WebElements.English_language,UserMenu_WebElements.German_language};


        for (Object[] l:data) {
            for (Object pro : pr){
                if (l[0].equals(pro)) {
                    System.out.println(l[0].toString());
                } else {
                    System.out.println("absent " + l[0].toString());
                }
        }
        }

    }
}