# Chemistry

[![](https://img.shields.io/github/issues/uhoefel/chemistry?style=flat-square)](https://github.com/uhoefel/chemistry/issues)
[![](https://img.shields.io/github/stars/uhoefel/chemistry?style=flat-square)](https://github.com/uhoefel/chemistry/stargazers)
[![DOI](https://zenodo.org/badge/311457257.svg)](https://zenodo.org/badge/latestdoi/311457257)
[![Maven Central](https://img.shields.io/maven-central/v/eu.hoefel/chemistry.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22eu.hoefel%22%20AND%20a:%22chemistry%22)
[![](https://img.shields.io/github/license/uhoefel/chemistry?style=flat-square)](https://choosealicense.com/licenses/mit/)

Chemistry is a [Java](https://openjdk.java.net/) library designed to handle chemical types.
It has enums for all nuclides (i.e., all elements and isotopes) and provides a type for molecules (which needs an internet connection).
The molecule types provides an implementation for the `Texable` interface from the [jatex](https://github.com/uhoefel/jatex) module, such that it can easily return proper LaTeX code.

Some examples:
  ```java
  Molecule m = new Molecule("magnesium dioxide");
  m.iupac(); // gets the official IUPAC name
  
  Isotope.ofElement(Element.Ar); // the list of argon isotopes
  Isotope.named("deuterium"); // gets the enum value for deuterium

  Element.get(ElementCategory.ALKALI_METAL); // gets all alkali metals
  Element.Og.isotopes(); // gets the isotopes of oganesson
  Element.He.group(); // gets the IUPAC group number of helium
  ```

Installation
============

The artifact can be found at maven central:
```xml
<dependency>
    <groupId>eu.hoefel</groupId>
    <artifactId>chemistry</artifactId>
    <version>2.0.0</version>
</dependency>
```

Requirements
============
Chemistry is designed to work with Java 21+.

Note that version 1.3.0 removed the dependency on javafx, as it seemed an unnecessarily big dependency for what it achieved.