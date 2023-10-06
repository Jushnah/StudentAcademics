# Student Information System (SIS) - Gradle Project

## Overview

The Student Information System (SIS) is a Gradle project that allows you to create, fetch, and manage academic and personal details of students. It also includes a feature to calculate the percentage of a subject when the student passes the mark. This project is designed to help educational institutions or individuals keep track of student information efficiently.

## Features

1. **Student Management**:
   - Create new student records with personal and academic details.
   - Update existing student records.
   - Delete student records.
   - fetch a specific student details
   - fetch all student's details

2. **Academic Details**:
   - Add subject scores.
   - Calculate the percentage for each subject.

## Usage
To use the Student Information Management System, you can make HTTP requests to the provided endpoints. You can find the list of available endpoints in the StudentController class.

**Example API endpoints:**

- To create a new student record: POST /student/add
- To fetch student details by ID: GET /student/get/{id}
- To fetch all students details: GET /student/get
- To update student details by ID: PUT /student/edit/{id}
- To calculate the percentage of a student's subjects when they pass: GET /student/{id}/mark

You can use tools like Postman or curl to interact with these endpoints.
