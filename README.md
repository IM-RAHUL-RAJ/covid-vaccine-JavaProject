# covid-vaccine-JavaProject

## Covid Vaccine Cerificate Generator


**This project can be used to generate the covid vaccine certificate and and also the RT-PCR test Report.**

**vaccine.java file**
**govInfo.java** is the **imported package** (ImportedPackage) class in the vaccine class.

Firstly when we run the program we need to authorize ourself by entering the correct username and password._(username- user123 password-user123)_ if any user enters anything other than these in those columns he wont be able to login into the system.
This is done by the **auth** class.it has default constructor and a parameterized constructor also here String handling function is used _equals_ inside the method boolean check which return true/false as per the value entered by the user.

Then there is a class **PersonalInformation** which asks for the personal information of the user ,name,age,mobileNumber,aadhar number to uniquely define a user for vaccination and RTPCR test.again, it also has a default constructor and parameterized constructor.and it has a **showReport()** to display all the information entered by the user.here method overloading is shown in showReport() method.

Then comes the **vaccineDetails** class which inherits the **personalDetails** class as the personalInformation need not to be entered again n again,this is done by the **super()** keyword.also new attributes are userID,vacciienName,doseCount,centre.
It also has the showReport function but this time parameters are passed in the **showReport(days,feedback)** function - this is known as method overriding .

Then comes the RTPCR class which also extends personalDetails class and all the attributes of personalDetails class are taken by **super()** keyword.New attributes are sampleID,sampleCollectionDate,resultDate,centre.
also like the vaccineDetails class it also has the **showReprt()** method and here also it is overridden.

**Note** - The sampleID and userID are randomly generated _alphanumeric 10 digit_ random String which is coded in this program.So that every time a new and unique userID and sampleID is shown. **RandomString()** method is made.

Then comes the **mobileSMS** abstract class which is likely to show that after vaccination or RTPCR test user is sent a message by the govt on their phones. As it an abstract class so its methods sendSMSforVaccine and sendSMSforRTPCR cannot be used by making its objects.
so **generateMessage** classes that inherits the abstract mobileSMS class is used to the above methods.

**ifpositive** interface is made to show the guidelines for the ones who are found covid positive as per the **RTPCR** test.
**showPositiveGuidelines()** method is just declared in the interface **ifpositive**

**covidMeasure** class which implemnets the ifPosiitve interface is made  and the showPositiveMeasures() body is entered inside it.

importedpackage is created in which there is govInfo.java class which has all the imp covid measures links that can be helpful in this pandemic situation.
**govInfo** class is made which extends the Thread class and has a **run()** function inside and shows the links per 1 sec.
this govInfo is called in the vaccine.java file  anmd thread is started by importing the package.

**import importedpackage.*.**


Finally a **creator** class is made to display the name,usn,dept of the creator.This class uses object as parameter concept. **display(creator c)** is created to display the developer credentials.

 ### Total Concepts used- 

Abstraction- Classes.<br>
Scope and Lifetime of variables.<br>
Declaring objects.<br>
Instance Variables of different data types.<br>
Constructors/Methods.<br>
'this' keyword.<br>
Inheritance.<br>
Overloading (Constructors/Methods)<br>
Overriding.<br>
Objects as parameters.<br>
Access control mechanism.<br>
Use of 'super'.<br>
Packages.<br>
Interfaces.<br>
Exception Handling.<br>
Creation of thread to execute a certain process.<br>


