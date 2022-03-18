package com.company.coupling.tight;

class B
{
    public static void main(String... ar)
    {
        //Creating an object of class A
        A ob = new A();

        //Directly setting the value of data member "name" of class A, due to tight coupling between the class A and B
        ob.name=null;

        //Direct access of data member "name" of class A, due to tight coupling between two classes
        System.out.println("Name is " + ob.name);
    }
}