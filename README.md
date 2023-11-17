# dk.sdu.MF.uno
## OOP - Uno game

### Summary
| Section | Description |
| ------- | ----------- |
| 1. File Structure | Structure diagram |
| 2. Simple Cards | Class diagram |

---
### Progression
- [X] Subtask 1: Card and NumberedCard Classes
- [ ] Subtask 2: The DrawPile Class
- [ ] Subtask 3: The DiscardPile Class
- [ ] Subtask 4: The Abstract Player Class
- [ ] Subtask 5: The UnoGame Class
- [ ] Subtask 6: The Descriptable Interface
- [ ] Subtask 7: The Main Class
- [ ] Subtask 8: Extending the Game with ActionCards
- [ ] Subtask 9: To Infinity and Beyond

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




