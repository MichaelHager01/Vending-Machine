# Vending machine

A Java vending machine with a file-backed inventory and a small JavaFX counter.

## What it does

- `Driver` loads snacks and drinks from text input, adds and removes items, and writes the resulting stock to `results.txt`.
- Snacks and drinks share the `Item` type, so one slot can hold either.
- The JavaFX window fills the machine and decrements a count when a button is pressed. The course notes cap a slot at 8 items.
- `Sample.fxml` and `application.css` sit next to `Main` because the window loads them with `getClass().getResource`.

## Layout

- `src/` — Java sources, the FXML layout, and the stylesheet. Classes declare `package application`.
- `docs/Project_Documentation.pdf` — the project writeup
- `docs/course-notes.txt` — how the driver, polymorphism, and the JavaFX window were graded

## Run

Open the repository in Eclipse and set `src` as the source folder, on a JDK that includes JavaFX. The command-line driver is `src/Driver.java`. The window is `src/Main.java`.

## Stack

Java and JavaFX. Written for CSCE 314.
