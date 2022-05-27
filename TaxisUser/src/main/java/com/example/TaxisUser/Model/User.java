package com.example.TaxisUser.Model;

import javax.persistence.*;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String Name;
    private String UserName;
    private int Age;
    private int NumberTaxi;
    private String Company;

    public long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getName(){return Name;}
    public void setName(String Name){this.Name = Name;}

    public String getUserName(){return UserName;}
    public void setUserName(String UserName){this.UserName = UserName;}

    public int getAge(){return Age;}
    public void setAge(int Age){this.Age = Age;}

    public int getNumberTaxi(){return NumberTaxi;}
    public void setNumberTaxi(int NumberTaxi){this.NumberTaxi = NumberTaxi;}

    public String getCompany(){return Company;}
    public void setCompany(String Company){this.Company = Company;}



    



}
