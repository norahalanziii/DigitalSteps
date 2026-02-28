# 🎮 DigitalSteps — Game-Based Java Learning Platform

> An interactive, gamified learning system that makes mastering Java Object-Oriented Programming fun and accessible for all skill levels.

---

## 📖 About the Project

**DigitalSteps** is a desktop application developed as a course project for *Object-Oriented Programming (2)* at Imam Abdulrahman Bin Faisal University. It combines structured Java education with gamification elements — offering adaptive learning paths, level-based progression, quizzes, and a worldwide competition mode — all backed by a relational MySQL database.

Whether you're a complete beginner or an experienced programmer brushing up on Java OOP, DigitalSteps meets you where you are and guides you forward step by step.

---

## 🚀 Features

### 👤 User Management
- Secure player registration and login with input validation
- Unique username, email, and phone number enforcement
- Player profile with password visibility toggle and account deletion
- Session-based level tracking stored per player in the database

### 📚 Adaptive Learning Path
- **50+ lessons** organized into three tiers: Beginner (15), Intermediate (15), and Advanced (19+)
- Lesson completion is tracked and saved to the database per player
- Programming basics module for users with no prior experience (covers definitions, language levels, famous languages, and error types)
- Level assessment quiz to automatically determine or confirm a player's starting level

### 🧠 Quizzes & Assessments
- Level-specific quizzes (10 questions each, 1 point per question)
- Quiz results update the player's level automatically upon completion
- Admin-managed question bank: add, modify, delete, and display quizzes

### 🌍 Worldwide Competition Mode
- Anonymous, open-to-all competition with 11 questions
- Players choose a nickname and avatar before competing
- Real-time leaderboard displaying scores and player rankings
- Play/replay option after results are shown

### 🔐 Admin Dashboard
- Secure admin-only login (admin accounts are pre-seeded; users cannot create admin accounts)
- Dashboard with total player count, total quizzes, and top player leaderboard
- **Player Management:** view and delete player accounts; filter displayed info by field
- **Feedback Viewer:** read player feedback submitted from the About Us screen (file I/O)
- **Quiz System:** full CRUD operations — add, delete, modify, and display quizzes
- **Worldwide Competition Access:** admins are signed out before entering the competition

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| **Java (Swing / javax.swing)** | Application logic and GUI (JFrame, JButton, JComboBox, etc.) |
| **MySQL** | Relational database for users, lessons, quizzes, and scores |
| **JDBC** | Java–MySQL connectivity |
| **NetBeans IDE** | Development and project management environment |
| **File I/O** | Player feedback (written by players, read by admins) |

---

## 🗄️ Database Schema

The database (`DigitalStep1`) contains the following tables:

- **Administrative** — Admin accounts (pre-seeded, not user-creatable)
- **Player** — Registered player accounts with level tracking
- **Lesson** — Lesson catalog with category (Beginner / Intermediate / Advanced)
- **Question** — Quiz questions linked to lessons
- **Quiz** — Full quiz records with choices and correct answers
- **player\_Take\_lesson** — Tracks which lessons each player has completed
- **player\_anwser\_qustion** — Tracks player answers and scores per question
- **Administrative\_Display\_player** — Audit log of admin–player display operations
- **Administrative\_Update\_Quize** — Audit log of admin quiz modifications

### ERD Highlights
- `Player` ↔ `Lesson` via `player_Take_lesson` (M:N)
- `Player` ↔ `Question` via `player_anwser_qustion` (M:N with score)
- `Administrative` ↔ `Quiz` via `Administrative_Update_Quize` (M:N)
- `Administrative` ↔ `Player` via `Administrative_Display_player` (M:N)

---

## 📂 Project Structure

```
DigitalSteps/
├── src/
│   ├── Welcome/            # Intro video and landing screen
│   ├── Auth/               # Login, sign-up, admin login
│   ├── Player/             # Player home, profile, experience flow
│   ├── Lessons/            # 50+ lesson frames (Beginner/Intermediate/Advanced)
│   ├── Quiz/               # Level quizzes and result frames
│   ├── LevelAssessment/    # Level measurement quiz
│   ├── ProgrammingBasics/  # Intro module for beginners
│   ├── WorldwideComp/      # Worldwide competition frames
│   └── Admin/              # Admin dashboard, player control, quiz system
├── database/
│   └── DigitalStep1.sql    # Full schema and seed data
└── feedback.txt            # Player feedback file (read by admin)
```

---

## ⚙️ Setup & Installation

### Prerequisites
- Java JDK 8 or higher
- MySQL Server 5.7+
- NetBeans IDE (recommended) or any Java IDE
- MySQL Connector/J (JDBC driver)

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/DigitalSteps.git
   cd DigitalSteps
   ```

2. **Set up the database**
   ```sql
   -- Run the SQL script in MySQL Workbench or CLI
   source database/DigitalStep1.sql;
   ```

3. **Configure the database connection**  
   Update the JDBC connection details in your database utility class:
   ```java
   String url = "jdbc:mysql://localhost:3306/DigitalStep1";
   String user = "your_mysql_username";
   String password = "your_mysql_password";
   ```

4. **Open in NetBeans**  
   Open the project folder as an existing NetBeans project, ensure the MySQL Connector/J `.jar` is added to the project libraries, then build and run.

---

## 🎓 Application Flow

```
Launch → Welcome Screen → After Welcome
         ├── Learn Java with Steps
         │   └── Admin or Player?
         │       ├── Admin Login → Admin Dashboard
         │       │   ├── Manage Players & Feedback
         │       │   ├── Quiz System (CRUD)
         │       │   └── Worldwide Competition
         │       └── Player Login / Sign Up
         │           └── Experience Check
         │               ├── No Experience → Programming Basics Module
         │               └── Has Experience → Level Check
         │                   ├── Know Level → Choose Level
         │                   └── Don't Know → Level Quiz → Auto-assign Level
         │                       └── Player Home (Beginner / Intermediate / Advanced)
         │                           ├── Lessons
         │                           ├── Level Quiz
         │                           ├── Worldwide Competition
         │                           └── About Us / Feedback
         └── Play Worldwide Competition (Anonymous)
```

---

## 👩‍💻 Team

| Name | Role |
|---|---|
| Norah H. Al-Anzi | Developer |
| Nada B. Al-Rshidi | Developer |
| Wajood Kh. Al-Jearah | Developer |
| Sarah A. Alhethily | Developer |
| Renad Alkahtani | Developer |
| Waad Alshammeri | Developer |
| Miad Alosaimi | Developer |

**Instructors:** L. Reem Alshammari · L. Nourah Alqahtani · L. Raja Alyafer  
**Institution:** Imam Abdulrahman Bin Faisal University — College of Science and Humanities, Computer Science Department

---

## 📄 License

This project was developed for academic purposes as part of the OOP (2) course project, Second Semester 2023/2024.
