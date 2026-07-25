**difference between JPA, Hibernate and Spring Data JPA**





1\. JPA (Java Persistence API)

It is a specification (standard).

It defines how Java objects should be stored in a database.

It does not provide any implementation.

It requires an implementation such as Hibernate.



2\. Hibernate

Hibernate is an ORM (Object Relational Mapping) framework.

It implements JPA.

It converts Java objects into database records and supports operations such as save, update, delete, and retrieve.



3\. Spring Data JPA

Spring Data JPA is another layer built on top of JPA implementations like Hibernate.

It reduces boilerplate code.

It manages transactions and lets you use repository interfaces such as JpaRepository instead of writing most database access code yourself.

