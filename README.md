# Pac-Man Logic: Object-Oriented Game Mechanics

## Project Overview
This repository contains the core logic implementation for a Pac-Man clone, developed as part of the Programming II course at the University of Bologna. Focuses specifically on the `gameObjects` layer, defining the behavior, system interactions, and state management for all dynamic and static game elements.

## Architecture & Implementation
The architecture heavily leverages Object-Oriented Programming (OOP) principles—such as inheritance and polymorphism—to extend the core framework, ensuring a highly modular and maintainable codebase.

### Core Components

*   **Player:** Manages continuous movement logic, life cycle state, and core game conditions (Win/Loss evaluation). It implements robust collision handling and coordinate resetting mechanisms upon entity interactions.
*   **Ghost:** Introduces foundational autonomous behavior. Entities dynamically calculate valid directional vectors at intersections to prevent immediate backtracking, effectively navigating the grid. It also includes an algorithmic visual "flicker" effect achieved through randomized color rendering.
*   **Food:** Handles the state management of collectible items, utilizing a soft-delete mechanism upon consumption coupled with dynamic visual feedback updates.
*   **Wall:** Defines the rigid physical boundaries, spatial constraints, and static rendering logic of the game environment.