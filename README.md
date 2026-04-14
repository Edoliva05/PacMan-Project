🎮 Pac-Man Logic: Object-Oriented Game Mechanics
💡 Project Overview
This repository contains the core logic implementation for a Pac-Man clone, developed as a project for the Programming II course at the University of Bologna. 
My contribution focused specifically on the gameObjects layer, defining the behavior, interactions, and state management for all dynamic and static game elements.

🛠️ Architecture & Developed Classes
I leveraged Object-Oriented Programming (OOP) principles—such as inheritance and polymorphism—to extend the provided framework, ensuring modular and maintainable code:

- Player.java: Manages smooth movement logic, the life system (starting with 3 lives), and game state conditions (Win/Loss). It includes sophisticated collision handling and coordinate resetting.

- Ghost.java: Implements basic "AI" for enemy entities. Ghosts autonomously choose directions at intersections while avoiding immediate backtracking, unless hitting a dead end. It also features a dynamic visual "flicker" effect using randomized color variations.

- Food.java: Handles the state of collectible items, including "mark-as-deleted" logic upon consumption and dynamic visual feedback.

- Wall.java: Defines the physical boundaries and static rendering of the game map.
