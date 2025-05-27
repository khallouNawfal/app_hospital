


# 🏥 nawfal-hospital – Système de Gestion Hospitalière

Ce projet est une application web de **gestion hospitalière** développée avec **Spring Boot**. Elle permet d'administrer efficacement les patients, les médecins et les consultations médicales dans un hôpital.

## 📌 Objectif

Mettre en œuvre un **mini-système de gestion hospitalière** pour :

* Gérer les entités : patients, médecins, consultations.
* Effectuer les opérations CRUD sur ces entités.
* Appliquer les bonnes pratiques de développement web avec Spring Boot.

---

## ⚙️ Technologies Utilisées

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **H2 Database** (base de données embarquée)
* **Thymeleaf** (moteur de template)
* **Lombok**
* **Spring MVC**

---

## 🏗️ Structure du projet

```
nawfal-hospital
├── entities/        # Contient les classes Patient, Medecin, Consultation
├── repositories/    # Interfaces JPA pour accéder aux entités
├── services/        # Logique métier
├── web/             # Contrôleurs MVC (web)
├── Application.java # Point d'entrée de l'application Spring Boot
```

---

## 🔍 Fonctionnalités principales

* Ajouter, modifier, supprimer des **patients**
* Ajouter, modifier, supprimer des **médecins**
* Gérer les **consultations** (avec date et associations patient/médecin)
* Interface web simple pour manipuler les entités
* Données test injectées automatiquement au démarrage via `@CommandLineRunner`

---

## ▶️ Démarrage de l'application

### 1. Prérequis

* JDK 17+
* Maven

### 2. Cloner le dépôt

```bash
git clone https://github.com/khallouNawfal/app_hospital.git
cd app_hospital/nawfal-hospital
```

### 3. Exécuter l’application

```bash
./mvnw spring-boot:run
```

### 4. Accéder à l'application

* Interface web : `http://localhost:8080`
* Console H2 : `http://localhost:8080/h2-console`
  (JDBC URL : `jdbc:h2:mem:testdb`, user : `sa`, pas de mot de passe)

---

## 📸 Aperçu de l’interface

![img](https://github.com/user-attachments/assets/24bd49ec-b973-4bb8-9b20-bbf8fa41c1b3)

---

![2](https://github.com/user-attachments/assets/f9cc4872-9130-4dca-9323-c33ba4d47790)

---

![3](https://github.com/user-attachments/assets/2ee0125a-8bc3-474e-b73c-41ebb714385a)



