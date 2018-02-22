# Problem 2

There is an instructor of a free class who has lots of participants.  
They want the participants to divide themselves up into groups of three.  
The instructor asks that the particpants put there names on a sheet with the group members.
It is mentioned that there may not be a multiple of three, so if the participants do not find a group of three to be a part of, that is ok, but to make sure a sheet of paper with the names of the participants that they could find on it.
(Note this means that every participant needs to have there name on a sheet of paper.)

What the instructor didn't expect is that a large number of the participants didn't find a group of three to be a part of.

The instructor wants your help in finding how many groups of three can be formed without breaking up the groupings the students turned in.

The instructor wants a progam they can run, and then type into the commandline the number of students in a group then some white space (a space or return is most likely), and repeat until each groups size has been entered.
They will finish with a 0 and press return to indicate that they are done entering the group sizes.

The instructor wants the program to print out how many full groups can be created (the maximum number), and how many students will not be in a full group.

Sample Input 1:
~~~
1 2 2 2 1 3 2 2 3 3 2 3 0
~~~
Sample Output 1:
~~~
6 full groups can be formed, and 8 students will still need a group.
~~~

Sample Input 2:
~~~
1 
2 1
2 1 2 1 
2 
1 
1 1
0
~~~

Sample Output 2:
~~~
5 full groups can be formed, and no students will still need a group.
~~~


-----
### Bonus
Allow the program to take a number on the first line by itself that indicates the size of the groups that the instructor wants.
The following numbers may be any number from 1 to the size of the groups.  A 0 stil ends the sequence of input.
