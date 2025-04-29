# 🌐 Java Web Server (Single-threaded & Multithreaded)

## 📌 Project Overview

This project is a **custom web server** built in Java, designed to handle HTTP requests using both **single-threaded** and **multithreaded** approaches. It serves static HTML and other resources over HTTP, demonstrating low-level socket programming and thread management in Java.

It provides a foundational understanding of how real-world web servers work internally, including request parsing, response formatting, and concurrent client handling using Java's **Thread** and **Runnable** interfaces.

---

## 🎯 Learning Objectives

- Understand how HTTP works at the socket level
- Learn Java **socket programming**
- Implement **multi-client support** using threads
- Compare **single-threaded vs multithreaded** server performance
- Serve static content (HTML, CSS, images)

---

## 🧱 Project Structure

- `HttpServer.java` – Entry point; starts server socket
- `SingleThreadedServer.java` – Handles one client at a time (blocking)
- `MultiThreadedServer.java` – Handles each client in a separate thread
- `ClientHandler.java` – Implements the `Runnable` interface for request processing
- `RequestParser.java` – Parses HTTP GET requests
- `ResponseBuilder.java` – Formats HTTP responses
- `public/` – Folder containing static files to serve (e.g., `index.html`, `style.css`, images)

---

## ⚙️ Features

- 📡 Handles HTTP GET requests
- 📁 Serves static files from `public/` directory
- 🧵 Switch between **single-threaded** and **multithreaded** modes
- 🔀 Uses `Socket`, `ServerSocket`, `Thread`, and `Runnable`
- 📃 Parses HTTP 1.0/1.1 headers manually
- 🕒 Logs each client connection with timestamp

---

## 🧪 Sample Console Output

[INFO] Server started on port 8080 [INFO] Accepted connection from 127.0.0.1 [INFO] Serving: /index.html to 127.0.0.1


## 🧰 Technologies Used

- **Java SE (JDK 8+)**
- **Socket Programming**
- **Multithreading with `Thread` and `Runnable`**
- **I/O Streams**

---

## 🚀 How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/JavaWebServer.git
cd JavaWebServer
2. Compile the Code
javac *.java

3. Run the Single-threaded Server
Edit
java SingleThreadedServer

4. Run the Multithreaded Server
java MultiThreadedServer
5. Open Browser

Go to:


http://localhost:8080/index.html
🔍 Difference: Single vs. Multithreaded Mode

Feature	Single-threaded Server	Multithreaded Server
Client handling	One at a time	Concurrent
Performance	Slower with more load	Scales with connections
Code complexity	Simpler	Requires synchronization
Use case	Learning/demo	Real-world simulation
📈 Possible Enhancements
Add POST method support

Implement thread pool (e.g., ExecutorService)

Add content-type header support (MIME types)

Add directory listing or 404 handling

HTTPS (SSL/TLS) support using Java Secure Sockets


🙌 Acknowledgements
Inspired by how web servers like Apache and Nginx handle requests

Built as an educational project to demonstrate low-level networking and multithreading in Java

