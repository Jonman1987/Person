package org.example;

import java.time.Year;

public class Person {
    public String name;
    public String middleName;
    public String familyName;
    public int age;

    public Person(){
        name = "none";
        middleName = "none";
        familyName = "none";
        age = 0;
    }

    public Person(String name, String middleName, String familyName, int age){
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMiddleName(String middleName){
        this.name = middleName;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public void setFamilyName(String familyName){
        this.name = familyName;
    }

    public String getFamilyName(){
        return this.familyName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "{" + familyName + " " + name + " " + middleName + " Возраст: " + age + "}";
    }

    public String calculationAge(){
        int year = Year.now().getValue();
        int born = year - this.age;
        return "Год рождения " + born;
    }
}
