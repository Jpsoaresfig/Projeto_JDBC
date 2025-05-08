
</head>
<body>
  <h1>🔌 JDBC Project</h1>
  <p><strong>Author:</strong> João Pedro Soares</p>

  <h2>📌 Description</h2>
  <p>This is a Java project using <strong>JDBC (Java Database Connectivity)</strong> to demonstrate basic operations such as connecting to a database, performing CRUD operations, and managing database resources manually. It was developed as part of a study about JDBC and relational databases.</p>

  <h2>🛠️ Technologies</h2>
  <ul>
    <li>Java 11+</li>
    <li>JDBC</li>
    <li>MySQL (or compatible relational database)</li>
  </ul>

  <h2>📂 Project Structure</h2>
  <pre>
Projeto_JDBC/
├── src/
│   ├── application/
│   │   └── Program.java
│   ├── db/
│   │   ├── DB.java
│   │   └── DbException.java
│   └── model/
│       ├── entities/
│       └── dao/
├── db.properties
  </pre>

  <h2>⚙️ Setup Instructions</h2>
  <ol>
    <li>Clone this repository.</li>
    <li>Configure your database connection in <code>db.properties</code>.</li>
    <li>Import the project into your Java IDE (e.g., Eclipse or IntelliJ).</li>
    <li>Make sure your MySQL server is running and the schema is correctly created.</li>
    <li>Run the <code>Program.java</code> class.</li>
  </ol>

  <h2>🔧 Features</h2>
  <ul>
    <li>Database connection management</li>
    <li>Data access layer (DAO pattern)</li>
    <li>Simple entity modeling</li>
    <li>Error handling with custom exceptions</li>
  </ul>

  <h2>📄 License</h2>
  <p>This project is for educational purposes only.</p>

  <hr>
  <p align="center">📘 Developed by João Pedro Soares</p>
</body>
</html>
