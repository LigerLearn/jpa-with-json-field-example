# Creating Java JPA Entities with a JSON Field

This is the code sample to accompany the blog post: [Creating Java JPA entities with a JSON field](https://ligerlearn.com/creating-java-jpa-entities-with-a-json-field/).

This repository illustrates the usage of an JSON field within a JPA entity. The point is to show how you can use JPA
 entities and still have JSON persisted in your underlying PostgreSQL database.

Steps to see everything in action:
1. Ensure that you have created the PostgreSQL DB, and the schema (see `src/main/resources/db` for the schema scripts).
2. Update the `src/main/resources/application.properties` file to have the correct values for your data source.
3. Run the `bootRun` Gradle task to launch the Spring Boot application.
4. Make a POST request to create a new Person
   ```shell script
   # Create a new person
   curl -X POST -H "Content-Type:application/json" -d '{
       "firstName": "John",
       "surname": "Smith",
       "address": {
           "doorNumber": 2,
           "roadName": "London Road",
           "postalCode": "EC34AWE"
       }
   }' http://localhost:8080/people
   ```
6. Check the DB - you will have stored JSON!
7. Make a PUT request to update the Person
   ```shell script
   # Update an existing person
   curl -X PUT -H "Content-Type:application/json" -d '{
       "firstName": "John",
       "surname": "Smith",
       "address": {
           "doorNumber": 35,
           "roadName": "New York Road",
           "postalCode": "12345"
       }
   }' http://localhost:8080/people/1
   ```
8. Check the DB - your JSON would have been updated!

Enjoy!

Also - if you have not yet already: check out the LigerLearn [website](https://ligerlearn.com/) and [YouTube](https://www.youtube.com/LigerLearn) channel.