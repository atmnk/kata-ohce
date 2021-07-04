# Ohce Kata
Covers Simplest TDD, basic design
## Goal
A short and simple exercise to practice outside-in TDD using test doubles.

## Problem Statement For Kata
Originally Posted At https://kata-log.rocks/ohce-kata

### Your task
ohce is a console application that echoes the reverse of what you input through the console.
Even though it seems a silly application, ohce knows a thing or two.

- When you start oche, it greets you differently depending on the current time, but only in Spanish:
  - Between 20 and 6 hours, ohce will greet you saying: ¡Buenas noches < your name >!
  - Between 6 and 12 hours, ohce will greet you saying: ¡Buenos días < your name >!
  - Between 12 and 20 hours, ohce will greet you saying: ¡Buenas tardes < your name >!
- When you introduce a palindrome, ohce likes it and after reverse-echoing it, it adds ¡Bonita palabra!
- ohce knows when to stop, you just have to write Stop! and it'll answer Adios < your name > and end.

This is an example of using ohce during the morning
```
$ ohce Pedro
> ¡Buenos días Pedro!
$ hola
> aloh
$ oto
> oto
> ¡Bonita palabra!
$ stop
> pots
$ Stop!
> Adios Pedro
```

## Selected Stack
- Java 11
- gradle (with gradle wrapper) as build tool
- junit 5 as test framework

## Understanding Solution
- The Problem was solved using TDD and with the approach of just enough design at each stage
- Go through Each commit One by one to understand how first failing tests were written
- Each commit is one step of Red-Green-Refactor step