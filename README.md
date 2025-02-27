# Battle Strategy Game

## Overview
This is a **strategy-based battle game** where two teams deploy **element-based heroes** to attack the opposing **castle**. The game runs automatically once heroes are placed, with battles determined by hero stats. The objective is to destroy the enemy's castle by reducing its health to **zero**.

## Game Mechanics
1. **Game Setup**
   - Each team positions **heroes** on the battlefield before the game starts.
   - Each team has a **castle**, which must be defended.

2. **Heroes and Attributes**
   - **Fire Hero** 🔥: Power = 5, Health = 60, Speed = 1
   - **Wind Hero** 💨: Power = 3, Health = 60, Speed = 2
   - **Earth Hero** 🏔: Power = 3, Health = 70, Speed = 1
   - **Ice Hero** ❄: Power = 2, Health = 100, Speed = 1
   - Heroes attack based on their power, health, and speed attributes.

3. **Battle System**
   - Heroes automatically **move** toward the enemy castle.
   - If they encounter an **enemy hero**, a fight starts.
   - The **winning team** is the one that destroys the enemy castle first.

4. **User Interface**
   - A graphical **map** displays heroes, castles, and battle progress.
   - **Buttons** allow users to place heroes, start the game, and view scores.

## Installation & Setup
To run the game locally:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MohammadTvkl/Game-Project.git
   cd Game-Project
   ```

2. **Compile and Run:**
   ```bash
   javac src/*.java
   java src.Main
   ```

## Demo
![Game Demo](./demo.gif)

## Folder Structure
```
/Game-Project
│── /src                # Source code
│   ├── Main.java
│   ├── Game.java
│   ├── gamePage.java
│   ├── ScorePage.java
│   ├── Info.java
│   ├── /heroes        # Hero classes
│   │   ├── Hero.java
│   │   ├── Fire.java
│   │   ├── Wind.java
│   │   ├── Earth.java
│   │   ├── Ice.java
│   ├── /ui            # UI components
│   │   ├── assets/    # Images (fire, wind, etc.)
│── /docs              # Documentation
│── README.md          # Project documentation
│── demo.gif           # Gameplay demo GIF
```
