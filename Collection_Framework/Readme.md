# 🚀 Java Collection Framework

## 📌 Overview

This repository contains Java programs demonstrating the concepts of the **Java Collection Framework**. The Collection Framework is a unified architecture for storing, retrieving, and manipulating groups of objects. It provides ready-made data structures and algorithms that make Java programming more efficient and flexible.

The project covers various collection interfaces and classes, including **List, Set, Queue, and Map**, along with practical examples of their usage.

## 🎯 Objectives

- Understand the Java Collection Framework.
- Learn the hierarchy of collection interfaces and classes.
- Implement data storage and retrieval efficiently.
- Explore different collection implementations and their use cases.

## 🛠 Technologies Used

- Java
- JDK 8 or Higher
- VS Code / Eclipse / IntelliJ IDEA

---

## 📚 Collection Framework Hierarchy

```text
Iterable
   │
Collection
├── List
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
│
├── Set
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
│
└── Queue
    └── PriorityQueue

Map (Separate Hierarchy)
├── HashMap
├── LinkedHashMap
└── TreeMap
```

## 📖 Collections Covered

### 1. List Interface

The List interface maintains insertion order and allows duplicate elements.

#### ArrayList
- Dynamic array implementation.
- Fast random access.
- Best for frequent retrieval operations.

#### LinkedList
- Doubly linked list implementation.
- Efficient insertion and deletion.

#### Vector
- Synchronized dynamic array.
- Thread-safe implementation.

### 2. Set Interface

The Set interface stores unique elements and does not allow duplicates.

#### HashSet
- Uses hashing technique.
- No guaranteed order.

#### LinkedHashSet
- Maintains insertion order.
- Prevents duplicate entries.

#### TreeSet
- Stores elements in sorted order.
- Implements NavigableSet.


### 3. Queue Interface

Queue follows the FIFO (First In First Out) principle.

#### PriorityQueue
- Elements are processed based on priority.
- Automatically sorts elements.

### 4. Map Interface

Map stores data in key-value pairs.

#### HashMap
- Fast access using keys.
- No ordering guarantee.

#### LinkedHashMap
- Maintains insertion order.

#### TreeMap
- Stores keys in sorted order.


## ✨ Features

- Add elements to collections
- Remove elements from collections
- Update collection data
- Search elements
- Sort collections
- Traverse collections using:
  - Iterator
  - ListIterator
  - Enhanced For Loop
- Work with Key-Value pairs
- Demonstrate collection hierarchy


## ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/your-username/Collection_Framework.git
```

### Navigate to Project Folder

```bash
cd Collection_Framework
```

### Compile Program

```bash
javac FileName.java
```

### Run Program

```bash
java FileName
```

## 🎓 Learning Outcomes

After completing this project, you will be able to:

- Understand Collection Framework architecture.
- Differentiate between List, Set, Queue, and Map.
- Select suitable collection classes for real-world applications.
- Perform collection operations efficiently.
- Implement sorting and searching techniques.
- Work with Java Generics and Iterators.

## 🌟 Advantages of Collection Framework

- Reduces programming effort.
- Improves performance and efficiency.
- Provides reusable data structures.
- Offers built-in algorithms for sorting and searching.
- Supports dynamic memory allocation.


## 🏢 Real-World Applications

- Student Management Systems
- Banking Applications
- E-Commerce Platforms
- Employee Management Systems
- Inventory Management Systems
- Social Media Applications
- Library Management Systems



