package com.company.coupling.tight;

//Java - Example of tight coupling

class A
{
    public String name; 	//public data member of A class


    public String getName()
    {
        if(name!=null)  //Checking a valid access of instance variable, "name"
            return name;
        else
            return "not initiaized";
    }


    public void setName(String s)
    {
        if (s==null)  //Checking a valid setting of instance variable, "name"
            System.out.println("You can't initialized name to a null");
        else
            name = s;
    }
}