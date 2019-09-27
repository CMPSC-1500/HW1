# Problem 1

You have a friend who has a lot of files where each one contains the results from a race.  These files do not have a standard naming system.  
However you do know the names of the races, and also that each race puts it's name in the file name for it's results.

The races your friend is interested in are:
* BunRun
* Zombie
* Boston
* Spartan
* Mud

There happen to have an index file of all the file names.  Your friend is willing totype these names in on the command line to your program.  

They are asking you to find all file names that contain exactly one of the names of the races, and print them to the screen so they can find them.

Here is a small sampling of the list of races:

* 2014_Mud-run_for_fun.xml
* Spartan_run_in_the_Mud.doc
* Boston-Marathon_2019
* Bun_Run_In_The_Sun.pdf


Result for these file names:

* 2014_Mud-run_for_fun.xml
* Boston-Marathon_2019

## What to have in your answer:
* A file that has your program in it that can be compiled.   It should be named: <class name>.java
* A seperate file with at least 5 test possible file names that you create.
* A seperate file with the answers to the test cases you created (list the file name on one line and then the answer on the following line.)


## Bonus:
1.  Get your program to give an option to print either the file names that contain exactly one of the race names, or any/multiple of the race names, based upon input from the user (to decide which they want to do.)
2.  Your friend has found an additional batch of files that are in folders.  Look for the race names, ignoring any characters before the last '/' in the file name:
races/summer/north/Zombie_run_for_your_life.docx
