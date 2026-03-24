# 🧠 LeetCode Practice (Java + Python)

A structured collection of LeetCode solutions in **Java** and **Python**, organized by topic and supported by reusable data structures, unit tests, and CI.

This repository is used for consistent coding interview preparation and collaborative practice.

---

## 🚀 Goals

- Build strong problem-solving and algorithmic skills  
- Maintain clean, readable, and testable code  
- Practice multiple languages (Java and Python)  
- Reuse common data structures and patterns  
- Track progress across topics and difficulty levels  

---

## 📂 Repository Structure

```
leetcode-solutions/
├── java/
│   ├── src/
│   │   ├── datastructures/
│   │   └── problems/
│   │       ├── arrays/
│   │       ├── hashmap/
│   │       ├── linked_list/
│   │       ├── tree/
│   │       ├── graph/
│   │       ├── dp/
│   │       └── ...
│   ├── tests/
│   └── pom.xml
│
├── python/
│   ├── datastructures/
│   ├── problems/
│   │   ├── arrays/
│   │   ├── hashmap/
│   │   ├── linked_list/
│   │   ├── tree/
│   │   ├── graph/
│   │   ├── dp/
│   │   └── ...
│   └── requirements.txt
│
├── .github/
│   ├── workflows/
│   │   └── ci.yml
│   └── CODEOWNERS
│
└── README.md
```

---

## 🧠 Problem Organization

Problems are grouped by topic:

- Arrays  
- Hash Maps  
- Linked Lists  
- Trees  
- Graphs  
- Dynamic Programming  
- Backtracking  
- Heaps / Priority Queues  
- Math / Misc  

Each problem lives in its own folder:

```
0001_two_sum
0013_roman_to_integer
```

---

## 🧪 Testing & Coverage

### Java

- Uses **JUnit + Maven**

Run tests + coverage:

```bash
cd java
mvn verify
```

Coverage report:
```
java/target/site/jacoco/index.html
```

---

### Python

- Uses **pytest + pytest-cov**

Install dependencies:

```bash
cd python
python -m pip install -r requirements.txt
```

Run tests:

```bash
python -m pytest
```

Run tests with coverage:

```bash
python -m pytest --cov=problems --cov-report=term-missing --cov-report=html --cov-fail-under=80
```

Coverage report:

```
python/htmlcov/index.html
```

---

## ⚙️ Setup

### Requirements

- Java (JDK 17 recommended)  
- Maven  
- Python 3.12+  
- pip  

Verify:

```bash
java -version
mvn -version
python --version
```

---

## 🤝 Contribution Workflow

All changes go through **Pull Requests (PRs)**.

### 1. Sync latest code

```bash
git checkout main
git pull origin main
```

### 2. Create a branch

```bash
git checkout -b java-0001-two-sum
```

### 3. Run tests locally

```bash
cd java
mvn verify
```

```bash
cd python
python -m pytest
```

### 4. Commit and push

```bash
git add .
git commit -m "Add solution"
git push -u origin branch-name
```

### 5. Open a Pull Request

- CI runs automatically
- Requires approval before merge

---

## 👥 Code Ownership

- Java → @wardm5  
- Python → @xjiang16  

---

## ✍️ Solution Format

Each solution should include:

- brief problem summary  
- approach explanation  
- time and space complexity  

---

## ⭐ Notes

This is an evolving repository intended for long-term learning and interview preparation.
