# cs1302-ce14 TBD

> Quote TBD

This class exercise covers introduces the reader to generic methods and .

## Prerequisite Knowledge

* Basic knowledge of Java Generics.
* [Oracle: Generic Methods](https://docs.oracle.com/javase/tutorial/extra/generics/methods.html)
* [Oracle: Bounded Type Parameters](https://docs.oracle.com/javase/tutorial/java/generics/bounded.html)

## References

* [`cs1302.util.ArrayUtility` API Documentation](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce14-api/)

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

1. Examine the static `checkNull` method in the `cs1302.ce14.Utility` class. 

   1. What is the minimum number of parameters that can be used when invoking this method?
      Provide an example.
   1. What kind of references are allowed for the variadic parameter of this method? 
      List two two or three examples.
   
1. Rewrite and document the `checkNull` method so that it only accepts references that either
   the same type or below a specific type in a hierarchy. Your implementation should only
   require a simple generic type parameter. To avoid confusion with the type parameter
   of the `cs1302.ce14.Container` class, please call this method's type parameter `U`
   instead of `T`. Also rewrite all calls to `checkNull` in other files so that they explicitly 
   paramterize `U` to the appropriate type.
   
1. Compile all of the code, including your modified `Utility` class, using `bin` as the default package
   for compiled code. Make sure you compile the classes in the proper order considering the dependencies. 
   If you encounter any compilation errors:
   
   1. Look at the first error reported by `javac`;
   1. Write the error down in your notes;
   1. Fix the error in the code using type casting;
   1. Recompile;
   1. Note the fix in your notes; then
   1. Repeat as needed. 
   
1. Run the `cs1302.ce14.Driver` class ot make sure everything works as intended.

1. Generate and host the API documentation website for the code contained in this exercise.

   1. When generating the website, use the `-link` option with the `javadoc` command to 
   automatically link external types (e.g., `Object`) to the official Oracle API documentation website
   [here](https://docs.oracle.com/javase/8/docs/api).
   1. What is the full URL for the API documentation for the `checkNull` method?

1. Commit the changes to your local copy of the exercise repository. 
   Be sure to include a good log message.

**CHECKPOINT**

1. Examine the [`ArrayUtility.sort`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce14-api/cs1302/util/ArrayUtility.html#sort-T:A-)
   method overload in the `cs1302.ce14.Utility` API documentation.
   In your notes, answer the following:
   
   1. What is the complete method sigature for this method?
   1. What is the datatype and role of each parameter?
   1. For each generic type parameter, what is the range of types that can replace it?
   
1. Based on the following UML diagram, create and document an `Employee` class in the
   `cs1302.ce14` package, specifying `src` as the default package for source code.
   **OR GIVE THIS TO THEM and HAVE THEM MODIFY TO IMPLEMENT COMPARABLE?**
   
1. Compile.

1. Create driver to test...

1. Commit the changes to your local copy of the exercise repository.
   Be sure to include a good log message.

**CHECKPOINT**

1. Similarly for the overload that takes a comparator.



1. Commit the changes to your local copy of the exercise repository.
   Be sure to include a good log message.

**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
