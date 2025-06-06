# EliteLine Car Rental

EliteLine is a full-featured **car rental management system** built with **Spring Boot**, designed to offer a stylish, dynamic, and user-friendly experience for managing rentals, customers, employees, and more.

## Features

- **Role-Based Access**
  - 👤 `ADMIN`: Full control (Manage cars, customers, employees)
  - 👥 `USER`: Limited access (e.g., view or book vehicles — future feature-ready)
  
- **Modern UI**
  - Dynamic video backgrounds, blurred glass effects, responsive layout
  - Section-based navigation for management modules
  
- **CRUD Operations**
  - **Cars**: Add, edit, delete, view
  - **Customers**: Add, edit, delete, view
  - **Employees**: Add, edit, delete, view
  -  *Modular design allows easy extension for Bookings, Reports, etc.*

- **Login & Authentication**
  - Secure login with encrypted passwords using **BCrypt**
  - Form-based login and logout with session invalidation
  
- **Database Integration**
  - Connected to **MySQL**
  - Tables auto-created and updated via `spring.jpa.hibernate.ddl-auto=update`
  - `users`, `user_roles`, `cars`, `customers`, `employees` tables used

- **Video-Enhanced Pages**
  - Management dashboard with looping car showreel
  - "Coming Soon" animated teaser for future branches (Shkodër branch launch)

---

---

## Technologies Used

- **Backend**: Spring Boot, Spring MVC, Spring Security
- **Frontend**: HTML5, CSS3, Thymeleaf
- **Database**: MySQL
- **Tools**: IntelliJ IDEA, GitHub, MySQL Workbench, GitHub Desktop

---

## User Roles & Security

The app supports multiple user roles defined in the `User` entity and stored in the `user_roles` table.

- `ROLE_ADMIN` — Full access to all pages
- `ROLE_USER` — Restricted views (future enhancements planned)

Security configuration is handled in `SecurityConfig.java`, with route-based access control and session management.

---

## Running the Project

1. **Clone the repo**  
   `git clone https://github.com/yourusername/EliteLine-Car-rental.git`

2. **Set up MySQL Database**
   - Create a database named `car_rental`
   - Modify `application.properties`:
     ```properties
     spring.datasource.username=yourUsername
     spring.datasource.password=yourPassword
     ```

3. **Run the app**
   - Open in IntelliJ or run:  
     `mvn spring-boot:run`

4. **Login Credentials**
   - Default `ADMIN`:  
     `username: admin`  
     `password: admin123` *(stored encrypted in DB)*
   - Default `USER`:  
     `username: user`  
     `password: user123`


---

## 🎬 Demo Screenshots

> _Include screenshots of:_  
![image](https://github.com/user-attachments/assets/9bbff748-b87b-4441-8b1d-80b551b80400)
![image](https://github.com/user-attachments/assets/918fcac8-84b4-41e9-8bda-4a301d7cc6b3)
![image](https://github.com/user-attachments/assets/af82f5dd-fb45-488d-aef3-e27de450a53b)



---

## 📄 License

This project is for educational purposes and part of a **Web Programming CEN311 PROJECT** by [Estershumeli](https://github.com/estershumeli).

---



