# Lab 6: Define Your REST API Endpoints


### Admin's Side

| Resource  | HTTP Verb | Resource URL                        | Use Case                           |
|-----------|-----------|-------------------------------------|-------------------------------------|
| Ticket    | GET       | `/api/admin/tickets`               | View all tickets                    |
| Ticket    | PUT       | `/api/admin/tickets/{id}`          | Update ticket details               |
| Ticket    | DELETE    | `/api/admin/tickets/{id}`          | Delete a ticket                     |
| Enclosure | POST      | `/api/admin/enclosures`            | Add a new enclosure                 |
| Enclosure | PUT       | `/api/admin/enclosures/{id}`       | Update an enclosure                 |
| Enclosure | DELETE    | `/api/admin/enclosures/{id}`       | Delete an enclosure                 |
| Animal    | POST      | `/api/admin/animals`               | Add a new animal                    |
| Animal    | PUT       | `/api/admin/animals/{id}`          | Update animal information           |
| Animal    | DELETE    | `/api/admin/animals/{id}`          | Remove an animal                    |
| Shop      | POST      | `/api/admin/shops`                 | Add a new shop                      |
| Shop      | PUT       | `/api/admin/shops/{id}`            | Update shop details                 |
| Shop      | DELETE    | `/api/admin/shops/{id}`            | Delete a shop                       |
| Lecture   | POST      | `/api/admin/lectures`              | Schedule a new science lecture      |
| Lecture   | PUT       | `/api/admin/lectures/{id}`         | Update lecture details              |
| Lecture   | DELETE    | `/api/admin/lectures/{id}`         | Cancel a lecture                    |



### Visitor's Side

| Resource        | HTTP Verb | Resource URL                          | Use Case                             |
|----------------|-----------|----------------------------------------|--------------------------------------|
| Ticket         | GET       | `/api/tickets`                         | View available tickets               |
| Ticket         | POST      | `/api/tickets`                         | Buy a ticket                         |
| Ticket         | GET       | `/api/tickets/{id}`                    | Show a valid ticket by ID            |
| Zoo Entry      | POST      | `/api/zoo-entry`                       | Enter the zoo with a valid ticket    |
| Enclosure      | GET       | `/api/enclosures`                      | View available enclosures            |
| Enclosure Visit| POST      | `/api/enclosures/{id}/visit`           | Visit an enclosure                   |
| Feed Animal    | POST      | `/api/enclosures/{id}/feed`            | Feed an animal in an enclosure       |
| Shop           | GET       | `/api/shops`                           | View available shops                 |
| Purchase       | POST      | `/api/shops/{id}/purchase`            | Make a purchase at a shop            |
| Hospital       | GET       | `/api/hospital`                        | View hospital information            |
| Lecture        | POST      | `/api/hospital/lecture`                | Listen to a science lecture          |
| Exit           | POST      | `/api/zoo-exit`                        | Leave the zoo                        |
