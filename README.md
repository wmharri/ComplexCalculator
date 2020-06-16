# ComplexCalculator

A calculator program written with electrical engineering applications in mind, written for practice with creating graphic interfaces in Java; it is encouraged that students in an EE course instead work problems by hand, or else use an exam-legal handheld calculator.

## Design Plan

UPDATE: I plan to switch from Swing to JavaFX on this project.

The planned design is to convert the input string into a string of tokens, which is then converted into a parse tree, and this parse tree will be evaluated from its leaf nodes to its root. There will be no loops, and all quantities will have fixed values, so this project will not require the full force of a modern compiler; for example, I will not be implementing symbol tables or activation records. After the initial version is developed, I plan to extend the calculator's functionality so that it can solve matrix multiplication problems using standard elimination-with-pivot algorithms from numerical linear algebra; see [1].

## References

[1] Watkins, David, _Fundamentals of Matrix Computations_.
