package org.example;

import org.example.mocks.PeopleMock;
import org.example.mocks.PeopleObject;

import java.util.Comparator;
import java.util.List;

public class People {

    public Integer calculateMeanHeight(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return peopleObjectList.stream().mapToInt(PeopleObject::getHeight).sum() / peopleObjectList.size();
    }

    public Integer calculateMeanAge(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return peopleObjectList.stream().mapToInt(PeopleObject::getAge).sum() / peopleObjectList.size();
    }

    public String youngestPerson(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return peopleObjectList.stream().sorted(Comparator.comparingInt(PeopleObject::getAge)).findFirst().get().getName();
    }

    public String tallestPerson(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return peopleObjectList.stream().sorted(Comparator.comparingInt(PeopleObject::getHeight).reversed()).findFirst().get().getName();
    }
}
