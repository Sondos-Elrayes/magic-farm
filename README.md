# 🌾 Magic Farm 
A simple console-based Magic Farm Simulation built with Java, applying Object-Oriented Programming (OOP) principles and the Design Patterns concept.

Manage magical creatures, feed them, and monitor their status through an interactive text-based menu.

## Key Features
🧩 Demonstrates OOP concepts: Inheritance, Polymorphism, Encapsulation.

📖 Implements Design Patterns (Action Pattern for executing creature actions).

🐄 Manage creatures with individual attributes (e.g., Milk Amount, Egg Quantity).

🍽️ Feed creatures and automatically adjust hunger levels:

MagicCow: Hunger reduced by 4.

MagicDuck: Hunger reduced by 3.

MagicShark: Hunger reduced by 2.

📋 Console-based Menu with Action Selection.

💾 Easy to extend with new creatures or actions.

## Project Structure

<pre>├── src/
│ ├── actions/
│ │ ├── Action.java
│ │ └── FeedAction.java
│ ├── creatures/
│ │ ├── Creature.java
│ │ ├── MagicCow.java
│ │ ├── MagicDuck.java
│ │ └── MagicShark.java
│ ├── farm/
│ │ └── MagicFarm.java
│ ├── main/
│ │ └── Application.java
│ └── menu/
│ └── Menu.java
</pre>




