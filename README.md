
# cs1302-ce14 Genericize is a Real Word

> Brevity is the soul of wit. 
> **--Polonius, _Hamlet_ by William Shakespeare**

This class exercise covers introduces the reader to generic methods.
It also provides a small demonstration of branched development.

## References

* Basic knowledge of Java Generics.
* [Oracle: Generic Methods](https://docs.oracle.com/javase/tutorial/extra/generics/methods.html)
* [Oracle: Bounded Type Parameters](https://docs.oracle.com/javase/tutorial/java/generics/bounded.html)
* [`@SafeVarArgs` API Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/SafeVarargs.html)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce14`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce14.git
   ```

1. Change into the `cs1302-ce14` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

### Exercise Steps

1. Examine the static `checkNull` method in the `cs1302.Utility` 
   class. 

   1. What is the minimum number of parameters that can be used 
      when invoking this method?
      Provide an example.
   1. What kind of references are allowed for the variadic 
      parameter of this method? 
      List two two or three examples.
   
1. Create and checkout a branch called `genericize` to perform
   the work related to this checkpoint. You can do this using
   the following command:
   
   ```
   $ git checkout -b genericize
   ```
   
1. Confirm that you are on the desired branch using `git status` and/or
   `git branch`. 
   
1. Rewrite and document the `checkNull` method so that it only 
   accepts references that are either all the same type or all 
   below a specific type in a hierarchy. **Keep the following in 
   mind:** Your implementation should only require a simple generic 
   type parameter -- an upper bound is not needed.
   You will need to also rewrite all calls to `checkNull` in other 
   files so that they explicitly paramterize the method to the 
   appropriate type. No raw types!
   
1. **Compile all of the code**, including your modified `Utility` 
   class, using `bin` as the default package for compiled code. 
   Make sure you compile the classes in the proper order considering 
   the dependencies. **When you encounter any compilation errors:**
   
   1. Look at the first error reported by `javac`;
   1. Write down the entire statement that caused the error.
   1. Write the error message down in your notes;
   1. If the error is related to heap polution, then consult the references
      mentioned at the top of this exercise for a potential
	  solution; 
   1. Fix the error;
   1. Recompile; 
   1. Stage and commit your changes using Git; and
   1. Repeat as needed. 
   
   **NOTE:** Your instructor or PLA will look at the list of things
   you tried. They will not sign off on this checkpoint if you do 
   not do the steps above for each and every error. You should have
   a log entry for each.

1. What is the complete signature of your modified `checkNull`
   method?
   
1. Now that everything on this branch compiles, ensure that all changes 
   in the current branch have been staged and committed. After that, 
   checkout the `master` branch using the following command:
   
   ```
   $ git checkout master
   ```
   
1. Examine the `checkNull` method in the `cs1302.Utility` 
   class. What do you notice?
   
1. Merge changes from the `genericize` branch into the current branch
   (`master`) using the following command:
   
   ```
   $ git merge test_genericize
   ```

1. Did the merge work? How do you know?
   
1. In a previous exercise, you combined the `--all`, `--decorate`,
   `--oneline`, and `--graph` options with `git log` to produce
   a condensed, graphical version of the Git log. While you
   **are expected to remember these options**, it is tiresome to
   write them out each time. Instead, create a `git adog` command
   by setting up a Git alias:

   ```
   $ git config --global alias.adog "log --all --decorate --oneline --graph"
   ```
   
1. View the condensed, graphical version of your Git log using `git adog`
   
1. What is the entire line of output for the most recent entry produced
   by your new `git adog` command?

**CHECKPOINT**

1. Checkout the existing branch called `genericize` you created in the
   previous checkpoint to perform the work related to this checkpoint. 
   
   ```
   $ git checkout genericize
   ``` 
   
1. Confirm that you are on the desired branch using `git status` and/or
   `git branch`.

1. Write and document a `Driver` class in the `cs1302.ce14` package. 
   The `main` method should demonstrate that your `checkNull` method 
   only accepts references that are either all the same type or all 
   below a specific type in a hierarchy. You may make use of the 
   `Shape`, `Ellipse`, and `Circle` classes that are in the same 
   package. 
   
   Try different statements. **If you do this properly, then 
   compile-time errors are expected** when calls to `checkNull`
   violate the conditions your earlier modifications adopted. 
   In other words, the changes you made are supposed to prevent 
   the programmer from using your method a particular way. 
   If you encounter any compilation errors:
   
   1. Look at the first error reported by `javac`;
   1. Write down the entire statement that caused the error.
   1. Write the error message down in your notes;
   1. In your notes, denote whether or not this error is expected;

	  1. If **yes**, then keep the line in your code but comment it 
	     out, and include the reason why it's expected in your notes.
	  1. If **no**, then fix the error in the code.
	  
   1. Recompile;
   1. Stage and commit your changes using Git; and
   1. Repeat as needed. 
   
   **NOTE:** Your instructor or PLA will look at the list of things
   you tried. You should have a log entry for each. 
   They will not sign off on this checkpoint if you do 
   not do the steps above for each and every error as 
   _errors are expected_ if you perform the steps correctly.

1. Now that everything on this branch compiles, ensure that all changes 
   in the current branch have been staged and committed, then 
   checkout the `master` branch.
   
1. Merge changes from the `genericize` branch into the current branch
   (`master`).

1. View the condensed, graphical version of your Git log using `git adog`
   
1. What is the entire line of output for the most recent entry produced
   by your new `git adog` command?
   
1. If you do not intend to revisit the `genericize` branch by name, then
   you can safely delete it using `git branch -d` followed by the branch
   name. The changes have already been merged into `master`.

**CHECKPOINT**

1. The combination of options for the `git adog` command that you created earlier
   was popularized by a StackOverflow user named [Patoshi パトシ](https://stackoverflow.com/users/1642231/patoshi-パトシ)
   in their [reply to another user's post](https://stackoverflow.com/a/35075021).  
   
   ![ADOG](https://i.stack.imgur.com/ElVkf.jpg)
   
1. The StackOverflow user [fracz](https://stackoverflow.com/users/878514/fracz) suggested the `adog` alias
   that you setup earlier in their reply to Patoshi's reply.

**NOT A CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
