# Chemistry

[![](https://img.shields.io/github/issues/uhoefel/chemistry?style=flat-square)](https://github.com/uhoefel/chemistry/issues)
[![](https://img.shields.io/github/stars/uhoefel/chemistry?style=flat-square)](https://github.com/uhoefel/chemistry/stargazers)
[![](https://img.shields.io/github/license/uhoefel/chemistry?style=flat-square)](https://choosealicense.com/licenses/mit/)

Chemistry is a [Java](https://openjdk.java.net/) library designed to handle chemical types.
It has enums for all nuclides (i.e., all elements and isotopes) and provides a type for molecules (which needs an internet connection).
The molecule types provides an implementation for the `Texable` interface from the [jatex](https://github.com/uhoefel/jatex) module, such that it can easily return proper LaTeX code.

Some examples:
  ```java
  Molecule m = new Molecule("magnesium dioxide");
  m.iupac(); // gets the official IUPAC name
  ```

Installation
============

The artifact can be found at maven central:
```xml
<dependency>
    <groupId>eu.hoefel</groupId>
    <artifactId>chemistry</artifactId>
    <version>1.0.0</version>
</dependency>
```

Requirements
============
Units is designed to work with Java 15+. It needs preview-features enabled.