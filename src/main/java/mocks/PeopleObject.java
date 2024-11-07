/* (C)2024 */
package mocks;

public class PeopleObject {

    public PeopleObject(String name, String lastname, Integer age, Integer weight, Integer height) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.lastname = lastname;
    }

    String name;
    String lastname;
    Integer age;
    Integer weight;
    Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
