# spring-security-with-mongodb-role-based-authentication 

This is an example of spring security role based authentication application.There are two roles "admin" and "user".Both have their own home page and access rights for this application. 

## Getting Started

clone this project to your IDE, thats it.

### Prerequisites
```
* 1) mongo db 
* 2) No-Sql booter( you can also use mongo db compus or mongo shell) 
* 3) Any web broswer
* 4) Eclipse Ide

```

### Project Setup

Now we can look into how to set up the application

```
* 1) Import project to your workspace.
* 2) Start Mongo db
* 3) Run Main class "StudentsMongodbApplication" which is inside the "com.student" package.
* 4) Open "http://localhost:8080/".
* 5) Sign up 2 accounts. One with role "user" and one with "admin" role.
* 6) Now we are goning to create student table.For this copy ans paste "http://localhost:8080/makeList"
*    in the url box and hit enter.

```

### Testing

Now we are going to test the links.

please note both "/getUsers" and "/getStudents" are accessible to user having "admin" role.
user have "user" role can only access to "/getStudents".

```
1) Log into the admin account.
	open both "/getUsers" and "/getStudents" links by clicking show users and show students respectively.
	It will list users and students respectively.
2) Log into user account.
	open both "/getUsers" and "/getStudents" links by clicking show users and show students respectively.
	"/getUsers" will gives an access denied page because it is restricted by role.(check line no 45 in SecurityConfig.java inside com.student.security package)
		
```

## Built With

* [www.callicoder.com](https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-1/) - Referance



## Authors

* **Joshy Paily** - 



## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* [Thanks Gibins](https://github.com/gibins) - Mentor
