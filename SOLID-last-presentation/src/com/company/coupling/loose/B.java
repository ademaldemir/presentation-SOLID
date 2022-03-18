package com.company.coupling.loose;

class B
{
    public static void main(String... ar)
    {
        //Creating an object of class AA
        A ob= new A();

        //Calling setter method, as the direct access of "name" is not possible i.e. loose coupling between classes
        ob.setName(null);

        //Calling getter method, as the direct access of "name" is not possible i.e. loose coupling
        System.out.println("Name is " + ob.getName());
    }
}
