package com.keyword;

class Animal
{
    public void Color()
    {
        System.out.println("What is the Color ? ");
    }
    public void Category()
    {
        System.out.println("What is the Category ?");
    }
    public final void Sound()
    {
        System.out.println("I Barks.");
    }
    public void ChildName()
    {
        System.out.println("What is the Child Name ? ");
    }
    public void Competitor()
    {
        System.out.println("Who is the Competitor ? ");
    }
}
class Dog extends Animal
{
    public void Color()
    {
        System.out.println("I am Brown in Color. ");
    }
    public void Category()
    {
        System.out.println("My Category is Pug.");
    }
     /*public void Sound()      // The error will be thrown if we try to Override Sound method in class Dog
    {
        System.out.println("I Barks.");
    }*/
    public void ChildName()
    {
        System.out.println("My Child Name is Puppy. ");
    }
    public void Competitor()
    {
        System.out.println("My Competitor is Cat. ");
    }
}
public class FinalAsMethod
{
    public static void main(String[] args)
    {
        Dog puppy = new Dog();
        System.out.println("Dog Says: ");
        puppy.Color();
        puppy.Category();
        puppy.ChildName();
        puppy.Competitor();
    }
}
