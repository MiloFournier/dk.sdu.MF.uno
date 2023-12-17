# dk.sdu.MF.uno
## OOP - Uno game

### Summary
| Section | Description |
| ------- | ----------- |
| 1. File Structure | Structure diagram |
| 2. Simple Cards | Class diagram |
| 3. Players | Class diagram |

---
### Progression
- [X] Subtask 1: Card and NumberedCard Classes
- [X] Subtask 2: The DrawPile Class
- [X] Subtask 3: The DiscardPile Class
- [X] Subtask 4: The Abstract Player Class
- [X] Subtask 5: The Player Sub-classes
- [ ] Subtask 6: The UnoGame Class
- [ ] Subtask 7: The Descriptable Interface
- [ ] Subtask 8: The Main Class
- [ ] Subtask 9: Extending the Game with ActionCards
- [ ] Subtask 10: To Infinity and Beyond

---
### 1. File Structure
```
/dk.sdu.MF.uno
     |___ Descriptable.java
     |___ Main.java
     |___ UnoGame.java
     |___ /players
     |      |___ ComputerPlayer.java
     |      |___ HumanPlayer.java
     |      |___ Player.java
     |___ /piles
     |      |___ DiscardPile.java
     |      |___ DrawPile.java
     |___ /cards
     |      |___ Card.java
     |      |___ Color.java
     |      |___ NumberCard.java
     |      |___ /actioncards
     |      |         |___ ActionCard.java
     |      |         |___ Draw2.java
     |      |         |___ ReverseCard.java
     |      |         |___ SkipCard.java
     |      |         |___ WildCard.java
     |      |         |___ WildDraw4Card.java
```

---
### 2. Simple Cards
Here is the UML class diagram showing how the simple Uno cards are implemented:
<p align="center">
     <img width="555" alt="image" src="https://github.com/MiloFournier/dk.sdu.MF.uno/assets/132404970/a8f3ca78-aad8-42b6-af99-46a4ff3928e1">
</p>

---
### 3. Players
Here is the UML class diagram showing how the Players are implemented:
<p align="center">
     <img width="366" alt="image" src="https://github.com/MiloFournier/dk.sdu.MF.uno/assets/132404970/6db9528d-1f03-4bcd-8ccb-9fcfb0059f8c">
</p>

There are 2 sublcasses to the Player class:
- ComputerPlayer
- HumanPlayer

They both override the `playCard(DiscardPile)` method.

