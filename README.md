# Password Checker

## Overview

The Password Checker program is a simple Java application designed to validate passwords based on specific criteria. The program checks if a password meets the following requirements:
- The password must be at least 4 characters long.
- The password must not start with a digit.
- The password must contain at least one uppercase letter and one numeric digit.
- The password must not contain spaces or forward slashes.

## Features

- **Password Length Check**: Ensures the password is at least 4 characters long.
- **Initial Character Check**: Ensures the password does not start with a digit.
- **Character Composition Check**: Validates that the password contains at least one uppercase letter and one numeric digit.
- **Character Validity Check**: Ensures the password does not contain spaces or forward slashes.

## Code Structure

- **`passwordChecker.java`**: Contains the main logic for checking the validity of passwords. Includes methods for:
  - Checking if the password meets the defined criteria (`checkPassword` method).
  - Taking user input and displaying validation results (`main` method).

## Usage

### Step 1: Compile the Java File

Open your terminal or command prompt, navigate to the directory where `passwordChecker.java` is located, and compile the file using the following command:

```bash
javac passwordChecker.java
java passwordChecker
