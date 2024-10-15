package org.example.mocks;

import java.util.ArrayList;

public class PeopleMock {
    static final ArrayList<PeopleObject> people = new ArrayList<PeopleObject>(){
        {
            add(new PeopleObject(
                    "Julio",
                    "Cesar",
                    36,
                    163,
                    190
            ));
            add(new PeopleObject("Charlie",
                    "Snox",
                84,
               200,
               201));
            add(new PeopleObject("John",
                    "Doe",
                    15,
                    159,
                    170));
            add(new PeopleObject("Peter",
                    "Parker",
                    29,
                    150,
                    150));
            add(new PeopleObject("Gary",
                    "Nodal",
                    54,
                    165,
                    175));
            add(new PeopleObject("Julius",
                    "Martir",
                    67,
                    159,
                    180));
            add(new PeopleObject("Salma",
                    "Smith",
                    33,
                    170,
                    171));
            add(new PeopleObject("Tatiana",
                    "Soliban",
                    59,
                    179,
                    170));
            add(new PeopleObject("Michel",
                    "Salvador",
                    59,
                    179,
                    170));
            add(new PeopleObject("Katia",
                    "Moran",
                    41,
                    120,
                    160));
            add(new PeopleObject("Patty",
                    "Lue",
                    66,
                    133,
                    187));

        }};
    public ArrayList<PeopleObject> getPeopleList() {
        return people;
    }
}
