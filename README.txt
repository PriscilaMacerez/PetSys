For run the proyect set environment variables : 
JAV_HOME with the location where java is and Path with the location where java bin is.
Copy the csv file into a location without spaces, and run the commnad prompt. In command prompt go to the location where jar is and type the following:

For search by name type, for example:
java - jar PetSystem.jar C:/leer.csv name=l

This will return all names that contains the letter "l" order by name.

For search by type, for example:
java - jar PetSystem.jar C:/leer.csv type=CAT

This will store all pets and show them and search all pets with type Cat the order will be acording to the date most recent to last recent.

For search by type and gender:
java - jar PetSystem.jar C:/leer.csv type=CAT gender=f

This will store all pets from csv file and search all pets with type Cat and gender Female the order will be according to the date most recent to last recent.



