# Logistic System

![Image](https://github.com/VladyslavMekh/Logistic-System/blob/main/assets/logo.png "Logistic System logo")

## About Project

Logistic System is an education Java project that simulates core logistics and cargo management operations while demonstrating advanced Object-Oriented Programming concept, Java Generics, Functional Interfaces and Design Patterns.

The project models warehouses, shipments, cargo containers, product transformations, sorting lines, shipment builders and logistics in a type-safe and extensible way.

## Features

### Generic Containers
* Generic Box<T> implementation
* Safe storage and retrieval of cargo
* Container transfer
* Empty-state validation

### Generic Pairs
* Immutable "Pair<K, V>"
* Value swapping
* Generic key-value associations

### Inspection & Processing
* Cargo inspection utilities
* Generic labelling system
* Cargo transfers between containers

### Functional Programming
* Custom "Transformer<T, R>" functional interface
* Lambda expressions
* Method references
* Object transformation pipelines

### Wrapper System
* Secure cargo wrapping
* Seal tracking
* Generic mapping of wrapped content

### Shipment Builder
* Fluent Builder Pattern implementation
* Shipment customization
* Priority management
* Fragile and insured cargo support

### Sorting Engine
* Generic field comparators
* Bubble Sort implementation
* Dynamic sorting by:
    * *Name*
    * *Weight*
    * *Priority*

### PECS Transfer System
* Producer Extends Consumer Super principle
* Type-safe cargo movement
* Generic copy and transfer operations

### Registry System
* Typesafe Heterogeneous Container Pattern
* Dynamic module registration
* Generic retrieval by class type

## Technologies
* Java
* Java Generics
* Functional Interfaces
* Lambda Expressions
* Method References
* Collections Framework
* Object-Oriented Programming
* Builder Pattern
* Comparator Pattern

## Project Structure
```text
.
├── Main.java
├── README.md
├── assets
│   └── logo.png
├── container
│   ├── Box.java
│   ├── Pair.java
│   └── Wrapper.java
├── model
│   ├── Electronics.java
│   ├── Food.java
│   ├── HazardousMaterial.java
│   └── Product.java
├── processing
│   ├── InspectionUtils.java
│   ├── PackagingTransformer.java
│   └── Transformer.java
├── registry
│   └── WarehouseRegistry.java
├── shipping
│   ├── Shipment.java
│   └── ShipmentBuilder.java
├── sorting
│   ├── FieldComparator.java
│   └── SortingLine.java
└── transfer
    └── DockTransfer.java
```

## Author
*Vladyslav Mekh*