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

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }

    public void SetMiddleName(String middleName){
        this.name = middleName;
    }

    public String GetMiddleName(){
        return this.middleName;
    }

    public void SetFamilyName(String familyName){
        this.name = familyName;
    }

    public String GetFamilyName(){
        return this.familyName;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public int GetAge(){
        return this.age;
    }

    public String toString(){
        return "{" + familyName + " " + name + " " + middleName + " Возраст: " + age + "}";
    }

    public String AgeCalculation(){
        int year = Year.now().getValue();
        int born = year - this.age;
        return "Год рождения " + born;
    }
}
