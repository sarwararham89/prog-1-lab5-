TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.
Question 24: A HashMap is a collection of key and value pairs of object and its mainly for a Map. Now a Map is used to store a flexible number of entries where each entry is a pair consisting a key and value object.
Question 25: Both of those type used to parameterize are put for exemple"put(String,String) and get for exemple "get(Object Key) meaning from the method,put, we can take the first String thats the Key object. Yes we can use the same of them like "String". 
Question 26: Call the method size(). 
Question 28: It will just change its Value since that Key as already been added.
Question 29: It will create two different Key. 
Question 30: public String generationResponse(String word) 
{
    String response = responseMap.get(word);
      if(response != null){
          return response; }
{     esle
          return pickDefaultReponse();}
}
Question 31: The methods returns a value of null. 
Question 32: I think you should retreive the collection of key by using the method "KeySet()" and then print out whatever is inside of it. 
Question 33: Check the code in package bluej. 
Question 34: Similarities:
1.Both ArrayList and HashSet are collection classes designed to store objects.
2.Both are used to hold  a variable number of entries.
Differences:
1. An ArrayList are for the order of elements and those are accessed by their index position starting from 0 unlike the HashSet does not have any of that. 
Question 35: If the word returned in ArrayList, their order is in "order" meaning it stays in the order they were originally added unlike HashSet, the order isnt in "order" meaning they wont stay in the order that they were originally added.
Question 36: 
