# Calculator-using-Java-

<h1 align="center">🧮 Java Swing Calculator</h1>

<p align="center">
  <b>A modern, fully functional Calculator built using Java Swing and AWT</b>  
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-red?style=flat-square">
  <img src="https://img.shields.io/badge/Library-Java%20Swing%20%26%20AWT-orange?style=flat-square">
  <img src="https://img.shields.io/badge/License-MIT-green?style=flat-square">
  <img src="https://img.shields.io/badge/Made%20with-%E2%9D%A4-red?style=flat-square">
</p>

---

## 🌟 Overview

This **Java Swing Calculator** provides a clean and intuitive interface for performing basic arithmetic operations.  
It’s a beginner-friendly GUI project showcasing **event-driven programming** and **object-oriented design** in Java.

💡 Designed to replicate the functionality of a real calculator with modern UI styling.

---

## 🧠 Features

✨ **Basic Operations:** Addition, Subtraction, Multiplication, Division  
✨ **Decimal Support:** Handles floating-point numbers  
✨ **Clear Button:** Instantly resets the display  
✨ **Responsive Interface:** Real-time updates with every click  
✨ **User-Friendly Design:** Bold fonts, smooth layout, and modern button design  

---

## 🪶 Technologies Used

| Component | Description |
|------------|-------------|
| **Java Swing** | For creating GUI components (buttons, labels, frame) |
| **Java AWT** | For fonts, colors, and layout customization |
| **ActionListener** | Handles user input and events |
| **OOP Concepts** | Used for class-based design and modularity |

---

## 🧩 How It Works

### ⚙️ Logical Flow
1. User clicks a number ➜ Display updates  
2. User clicks an operator ➜ Stores value and operator  
3. User enters second number ➜ Display updates  
4. User clicks `=` ➜ Computes and shows result  

### 🧠 Behind the Scenes
The program tracks:
- `oldvalue` → first number entered  
- `newvalue` → second number entered  
- `operator` → operation type (`+`, `-`, `x`, `/`)  

When `=` is pressed:
```java
float result = 0;
if (operator.equals("+")) result = oldvalueF + newvalueF;
else if (operator.equals("-")) result = oldvalueF - newvalueF;
else if (operator.equals("x")) result = oldvalueF * newvalueF;
else if (operator.equals("/")) result = oldvalueF / newvalueF;
