# Password Generator (Java)
 
## Description

This is a simple and efficient **Password Generator** written in Java. It allows users to generate strong and random passwords based on customizable criteria such as length, inclusion of numbers, uppercase and lowercase letters, and special characters.

## Features

- Generate secure random passwords
- Customizable password length 
- Option to include:
  - Uppercase letters
  - Lowercase letters
  - Numbers
  - Special characters
- Simple and intuitive CLI interface

## Installation
 
1. Clone the repository:
   ```sh
   git clone https://github.com/RostyslavBegej/password_generator_java.git
   ```
2. Navigate to the project directory:
   ```sh
   cd password_generator_java
   ```
3. Compile the Java files:
   ```sh
   javac PasswordGenerator.java
   ```

## Usage

Run the program using:
```sh
java PasswordGenerator
```
Follow the on-screen instructions to generate a password based on your preferences.

## Example Output
```
**********************************************
*                                            *
*    WELCOME TO THE ULTIMATE PASSWORD        *
*              GENERATOR!                    *
*                                            *
*    Your fortress of security starts here.  *
*    Let's create passwords so strong,       *
*    even hackers will need a coffee break!  *
*                                            *
**********************************************


Let's create a password that's uniquely
yours. Choose what to include:

1. Small Letter (e.g., a, b, c)
2. Big Letter (e.g, A, B, C)
3. Numbers (e.g., 1, 2, 3)
4. Symbols (e.g., !, @, #)

Please select options (separate by commas, e.g., 1,2,3,4): 1,2,3,4
Enter the length of the password: 10

Your password is: *!7ChXB=4Z
Do you want to save the password? (y/n): y
Password saved to 'password.txt'.
Password saved to file!
```

### File "password.txt"

```
[04/02/2025 19:10:45]    Generated Password: *!7ChXB=4Z
```

## Requirements

- Java 8 or later

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### Happy Coding! 🚀
