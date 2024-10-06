# Survey Application
This is a Java based console application that allows users to create, save, and take surveys.
The application supports multiple question types based on user selection. 

# Purpose
The primary purpose of this project is to learn and implement Object-Oriented Programming (OOP) principles in Java. By developing this survey application, I aimed to deepen my understanding of OOP concepts such as encapsulation, inheritance.

### How to Run the Application ###

# Prerequisites
Java Development Kit (JDK) installed on your system.

# Steps 
1. git clone https://github.com/HousamAT/Survery-Generator.git
2. cd Survey Generator 2 
3. Javac Main.java
4. java Main



### Example Usage ###

# Survey Creation
Below is an example interaction with the application, demonstrating how to create a basic survey about Customer Satisfaction. It explores various question types supported by the application.


Enter survey title: Customer Satisfaction Survey

Enter survey description: A survey to gather feedback on our service.

Add a question (1: Yes/No, 2: Rating Scale, 3: Text, 4: Multiple Choice, 0: Finish):

1

Enter the question text: Did you enjoy our service?

Add a question (1: Yes/No, 2: Rating Scale, 3: Text, 4: Multiple Choice, 0: Finish):

2

Enter the question text: How would you rate our service from 1 to 5?

Enter min value for rating: 1

Enter max value for rating: 5

Add a question (1: Yes/No, 2: Rating Scale, 3: Text, 4: Multiple Choice, 0: Finish):

3

Enter the question text: What did you like most about our service?

Add a question (1: Yes/No, 2: Rating Scale, 3: Text, 4: Multiple Choice, 0: Finish):

4

Enter the question text: Which of the following best describes your overall experience with us?

Enter multiple choice options (separated by commas): Excellent,Good,Neutral,Poor

Add a question (1: Yes/No, 2: Rating Scale, 3: Text, 4: Multiple Choice, 0: Finish):

0

Survey saved to survey.txt


### Survey Taking ### 
After creating the survey, the user is asked whether they want to take the survey immediately or not. Here’s an example of what the survey-taking process looks like:


Do you want to take the survey now? (yes/no): yes

Did you enjoy our service? (yes/no)

yes

You answered: yes

How would you rate our service from 1 to 5?
5
You rated: 5

What did you like most about our service?

Customer support was quick and helpful.

You answered: Customer support was quick and helpful.

Which of the following best describes your overall experience with us?
1. Excellent
2. Good
3. Neutral
4. Poor
Enter your choice (1-4): 1
You selected: Excellent

### Conclusion
This survey application serves as an effective tool for learning Java OOP principles while providing 
a functional and user-friendly survey experience.


