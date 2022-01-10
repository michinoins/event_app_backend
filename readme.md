## OverView
Event Reservation API

### setup

set up mysql

`cd /docker`

`docker-compose up -d `

start Application ( IntellJ IDEA openjdk-17 work fine )

`./gradlew bootrun`

### Functions
* View Events
* Reserve Tickets for Events
* Manage an existing Ticket reservations
  * change Amount of tickets
  * cancel tickets

  
### Libraries

| name                    | version | description         |
|-------------------------|---------|---------------------|
| Kotlin                  | 1.6.0   | language            |
| SpringBoot              | 2.6.2   | FrameWork           |
| Spring-boot-startar-web | 1.5.0   | Web MVC             |
| doma2                   | 2.50.0  | O/R Mapper          |
| mysql-connector-java    | 8.0.27  | connector for mysql |


### not meet the requirement
* run the service by dockerfile,without installing anything locally.
* can not access database( struggling with the setting of doma), 
but dao/sql file are already added,so if that can be fixed, it should work fine. 