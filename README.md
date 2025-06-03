

---

# Java File Handling — File Reading and Writing

## Description

This project demonstrates basic **file handling** operations in Java including reading from and writing to a file using `FileReader` and `FileWriter`. It provides simple examples to understand how to work with text files in Java.

## Features

* Reads contents of a text file and prints to the console.
* Writes a string ("Hello World") to a text file.
* Demonstrates usage of try-with-resources to safely manage file streams.
* Handles `IOException` for robust error management.

## Code Structure

* `FileReading` class: Reads a file character-by-character and prints its content.
* `FileWriting` class: Writes a fixed string into the specified file.

## How to Run

1. Make sure the file path exists or adjust the file path in the code (`Java.txt` file path).

2. Compile the classes:

   ```bash
   javac Concepts/FileHandling/*.java
   ```

3. Run the file writing program to create or overwrite the file:

   ```bash
   java Concepts.FileHandling.FileWriting
   ```

   Output:

   ```
   File written successfully
   ```

4. Run the file reading program to display the file content:

   ```bash
   java Concepts.FileHandling.FileReading
   ```

   Output:

   ```
   Hello World
   ```

## Requirements

* Java JDK 8 or above
* Basic knowledge of file system and file I/O in Java
* Make sure the file path specified in the code matches your system's directory structure

## Notes

* This example uses absolute file paths; consider using relative paths or configuration for portability.
* Try-with-resources ensures that file streams are closed automatically.

