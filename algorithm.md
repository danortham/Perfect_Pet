# The Perfect Pet
## General algorithm

> Create a pet that has specific attributes such as hunger, happiness and thirst 
> the pet class will be abstract so I will make a more specific animal
> The specific pet class will have new attributes or behaviors
> Attribute will be an abstract class that has a value 
> the specific attributes will be children of Attribute
> > Hunger will inherit the value from Attribute and use that to determine its status
> > This will be used for thirst and happiness as well

***

## classes

* Attribute (abstract)
	* is the base class of my specific attributes
* Hunger
	* holds the hunger value and displays it
* Thirst
	* holds thirst value and displays it
* Happiness
	* holds happiness value and displays it
* Pet (abstract)
	* has some of the methods that change the variable level
* Griffin
	* is the specific pet that has new flock and fly method
* Driver
	* just the main file
	* has my attempt at object serialzation


