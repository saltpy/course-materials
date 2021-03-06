#Terms

* Single Responsibility Principle - abstractions do one specific thing and one thing only;
* Public/Private (visibility) - public class/method/variable is referenceable from any method or class and private class/method/variable is only referneceable to the class it is defined in;
* Polymorphism - the same method/object does something different given a different type or variable;
* Abstraction - reliable contact between two things;
* Inheritance - derrive subclass from superclass in doing this you can reuse the variables and methods without having to rewrite the existing class;
* Don't Repeat Yourself - Don't Repeat Yourself;
* Composition - ability to combine abstractions quickly and easily;
* Hardcoded - on each run that value is the same;
* Vaiable - different on each run potentially;
* Mutation - changing a variable;
* Final - remove the ability to be mutated;
* Static - call a class or method without instantiating an object - can slow down tests due to contentition for access;
* Refactor - change the way something works without changing that it works - alt+shift+r;
* Constructor - blueprint, foundations of what would be in the object, on instantiating an object of a class takes variables in;
* Class - template for an object - defines how an object is built;
* Object - that which is instantiated from a class - container for state and behaviour;
* State - the variables involved in doing a thing;
* Behaviour - the methods involved in doing a thing;
* Continuous Integration - things are built, merged, tested and integrated regularly;
* Instantiation - creating of an object from a class;
* Dependencies - something the code relies on - cant work without it - added to the pom.xml and JUnit and WebDriver are examples;
* Interface - way of making sure a number of classes have the same methods;
* Annotation - way of adding behaviour to a method;
* Local Test Environments - Web Server on local PC - BeforeClass AfterClass to start and stop it
* Conventional Approach to Selectors - CSS or XPATH rarely both - accessing a parent of a node is much easier in xpath;
* Asynchronous Tools Make Life Hard - (1) things happen at indeterminate times and (2) the number of inputs does not relate to the number of actions;
* Investigate with the Console - cheaper to make mistakes in than webdriver and more information about failures;
* Reliable Selectors - ease of use, ease of understanding, reliability and accuracy all important as is cost to produce the selector;
* Learn and Use General Skills - self defining;
* Known States - with Before, After, BeforeClass, AfterClass and other helper methods;
* Knowledge is Cheap - skills are expensive.
