# Problem 3

We need your help generating user names for students.  

We want to use part of their first name and part of their last name.
In both cases we want to start at the begining of the name and take consecutive letters from there.
The username must use at least the first letter from the first and the first letter from the last name.

Longer user names are always considered better, however user names on the system can not be longer than 8 characters. 

If there are multiple choices for the user name, please return the one that would come first alphebetically, considering all letters to be lower case.

The program will receive a nmber saying how many names there are to compare, and then there will be that many lines of additinoal input.
Each of those lines will contain the first name, a space, and the last name of a student.

Plese print out for each student the optimal user name per the preferences above.  
Do not worry if two students end up with the same username (the system admins will deal with those issues.)

Sample Input:
~~~
5
Jeff Ifland
AAAA BBBBB
AAAAA BBBB
zy xwv
abcdefg bzyxwvucba
zzzzzzzz aaaaaaaaa
~~~

Sample Output:
~~~
jeffifla
aaaabbbb
aaaaabbb
zywxv
abbzyxwv
zaaaaaaa
~~~

