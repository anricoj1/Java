# Java 
This Repository is all about Java!<br>
If you are learning Java this README will be a great guide!

# Install By OS
<h3><b> Linux (Ubuntu) </b> </h3>
<ul>
    <li style="list-style: none">
        <b>1. Install Java JDK and JRE</b> <br>
        <li style="margin-left: 30px">Java Development Kit</b> (JDK) <b>Java Runtime Environemt (JRE)</b></li>
        <li style="margin-left: 30px">JRE Runs Java Programs JDK for Development!</li>
        <li style="margin-left: 30px">sudo apt-get update</li>
        <li style="margin-left: 30px">sudo apt-get install openjdk-8-jre && sudo apt-get install openjdk-8-jre</li>
    </li>
    <li style="list-style: none">
        <b>2. Pick an IDE </b><br>
        <li style="margin-left: 30px"><b>Visual Studio Code</b> download Java extension</li>
        <li style="margin-left: 30px">Debug > Start Debugging</li>
    </li>
    <li style="list-style: none">
        <b>3. Eclipse </b><br>
        <li style="margin-left: 30px">Install Eclipse to Compile Java Programs</li>
    </li>
</ul>


# What is public static void main(String[] args)?
<ul>
    <li> <b>main()</b> is the entry point for any Java program. </li>
    <li><b> public: </b> Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class. </li>
    <li><b> static: </b> Is a keyword in Java which identifies it is class-based. main() is made static in Java so that it can be accessed without creating the instance of a Class. In case, main is not made static then the compiler will throw an error as main() is called by the JVM (Java Virtual Machine) before any objects are made and only static methods can be directly invoked via the class. </li>
    <li><b> void: </b> It is the return type of the method. Void defines the method which will not return any value.</li>
    <li><b> main: </b> It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.</li>
</ul>

# Why is Java not 100% Object-Oriented
Java is not 100% Object-oriented because it makes use of eight primitive data types such as<br> 
    <ul>
        <li>boolean</li>
        <li>byte</li>
        <li>char</li>
        <li>int</li>
        <li>float</li>
        <li>double</li>
        <li>long</li>
        <li>short</li>
    </ul>

These are not object data types.

# What are wrapper classes in Java?
Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class.

# What are constructors in Java
In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created.

There are two types of constructors:
    <ul>
        <li style="list-style: none">
            <b> Defualt Constructor: </b> In Java, a default constructor is the one which does not take any inputs. In other words, default constructors are the no argument constructors which will be created by default in case you no other constructor is defined by the user. Its main purpose is to initialize the instance variables with the default values. Also, it is majorly used for object creation. 
        </li><br>
        <li style="list-style: none">
            <b> Parmeterized Contructor: </b> The parameterized constructor in Java, is the constructor which is capable of initializing the instance variables with the provided values. In other words, the constructors which take the arguments are called parameterized constructors.
        </li>
    </ul>

# Difference between Array list Vector in Java
Array | Vector
----- | -----
Not Synchronized | Synchronized
Fast | Slow but thread safe
If an element is inserted into the Array List, it <br> increases its Array size by 50%. | Vector defaults to doubling size of its array.
Array List does not define the increment size. | Vector defines the increment size.
Array List can only use Iterator for traversing an Array List. | Vector can use both Enumeration and Iterator for traversing.

# Difference between equals() and == in Java
Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic. <br>

“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects.

# What are the differences between Heap and Stack Memory in Java?

Features | Stack | Heap
-------- | ----- | ----
Memory | Stack memory is used only by one <br> thread of execution. | Heap memory is used by all the parts of the application.
Access | Stack memory can’t be accessed by other threads. | Objects stored in the heap are globally accessible.
Memory Managment | Follows LIFO manner to free memory. | Memory management is based on the generation associated with each object.
Lifetime | Exists until the end of execution of the thread. | Heap memory lives from the start till the end of application execution.
Usage | Stack memory only contains local primitive and reference variables to objects in heap space. | Whenever an object is created, it’s always stored in the Heap space.