# Definition

When a method returns one of the several possible classes that share a common super class.
User cannot know the logic of creation

E.g:

- Create a new enemy in a game.
- Random number generator pick a number assigned to a speific enemy
- The factory returns the enemy associated with that number
  The class is chossen at run time

# When to use

- When you don't know ahead of time what class object you need
- When all of the potential classes are in the same subclass hierarchy
- To centralize class selection code
- When you don't want the user to have to know every subclass
- To encapsulate object creation

# UML diagram

![example](../../../Screenshots/factory.jpg)
