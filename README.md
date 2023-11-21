# Using the Var Type Identifier:
The Var Keyword: Starting with Java SE 10, you can use the var type identifier to declare a local variable. In doing so, you let the compiler decide what is the real type of the variable you create. Once created, this type cannot be changed.
Consider the following example:
 ![o1](https://github.com/GuptaReena/JDK21/assets/151419809/fc7affc1-e1a9-4885-9f28-8b158445f718)

In that case, having to declare the explicit types of the three variables message, path and stream is redundant.
With the var type identifier the previous code can be written as follow:
 ![o2](https://github.com/GuptaReena/JDK21/assets/151419809/164dfac9-e832-4577-a502-fad6715d5b99)

Examples with Var
The following example shows you how you can use the var type identifier to make your code simpler to read. Here the strings variable is given the type List<String> and the element variable the type String.
 ![o3](https://github.com/GuptaReena/JDK21/assets/151419809/466de2c2-96ac-4746-b02c-302a707a8d29)

On this example, the path variable is of type Path, and the stream variable is of type InputStream.
 ![o4](https://github.com/GuptaReena/JDK21/assets/151419809/f16294aa-6c21-4d19-85ae-c9192c886169)

Two previous examples, you have used var to declare a variable in a for statement and in a try-with-resources statement.
Restrictions on Using Var
There are restrictions on the use of the var type identifier.
1.	You can only use it for local variables declared in methods, constructors and initializer blocks.
2.	var cannot be used for fields, not for method or constructor parameters.
3.	The compiler must be able to choose a type when the variable is declared. Since null has no type, the variable must have an initializer.


Following the these restriction, the following class does not compile, because using var as a type identifier is not possible for a field or a method parameter.

 ![o5](https://github.com/GuptaReena/JDK21/assets/151419809/21b3185d-d529-4758-a122-e9014915b946)

The same goes for the following code.
In that case, the compiler cannot guess the real type of message because is lacks an initializer.

 ![o6](https://github.com/GuptaReena/JDK21/assets/151419809/9d2e17a9-f1b7-4251-8a57-22d475167982)

