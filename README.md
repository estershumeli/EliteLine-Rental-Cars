
---

## ⚙️ Technologies Used

- **Backend**: Spring Boot, Spring MVC, Spring Security
- **Frontend**: HTML5, CSS3, Thymeleaf
- **Database**: MySQL
- **Tools**: IntelliJ IDEA, GitHub, MySQL Workbench, GitHub Desktop

---

## 🔒 User Roles & Security

The app supports multiple user roles defined in the `User` entity and stored in the `user_roles` table.

- `ROLE_ADMIN` — Full access to all pages
- `ROLE_USER` — Restricted views (future enhancements planned)

Security configuration is handled in `SecurityConfig.java`, with route-based access control and session management.

---

## 📦 Running the Project

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

## 🛠️ Future Enhancements

- 💳 Booking system with payment integration
- 📊 Revenue analytics dashboard
- 🌐 Multiple branch filtering
- 📅 Reservation calendar with availability tracking
- 🧑‍💻 Admin/User dashboards with dynamic role control

---

## 🎬 Demo Screenshots

> _Include screenshots of:_  
![image](https://github.com/user-attachments/assets/9bbff748-b87b-4441-8b1d-80b551b80400)
![image](https://github.com/user-attachments/assets/918fcac8-84b4-41e9-8bda-4a301d7cc6b3)
![image](https://github.com/user-attachments/assets/af82f5dd-fb45-488d-aef3-e27de450a53b)
![image](https://github.com/user-attachments/assets/9954956f-e690-44de-aa92-1c692c9da071)
![image](https://github.com/user-attachments/assets/15fd9809-b9b8-4e58-ab66-729a46e8af8f)
![image](https://github.com/user-attachments/assets/5bc2aade-721b-48cd-bce2-ddb44dc33510)


---

## 📄 License

This project is for educational purposes and part of a **Web Programming CEN311 PROJECT** by [Estershumeli](https://github.com/estershumeli).

---



