<h1 align="center">Veteriner Uygulaması</h1> 

<p align="center">
  <img src="https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/resimmmm.jpg" width="600" alt="Veterinary">
</p>

## ⭐ Introduction 
- **Entity, Repository, Service, Controller ve Templates katmanlarından oluşan veteriner uygulamasıdır**. 
- **[Sql query](https://github.com/EmreCelik15/Pet-Care-System/blob/main/script.sql)**


## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Layers](#layers)
- [SQL Query](#sql-query)
- [Tables in Database](#tables-in-database)
- [Output](#output)
- [Files](#files)
- [License](#license)


## Installation
```bash
# Clone to repository
$ git clone https://github.com/EmreCelik15/Pet-Care-System.git

# Go to the folder you cloned
$ cd Pet-Care-System

# Install dependencies
$ mvn spring-boot:run
```

## Usage 
Uygulamayı çalıştırdıktan sonra tomcatin bilgisayarınızda hangi portta çalıştığını tanımladıktan sonra herhangi bir tarayıcı üzerinden uygulama giriş ekranına gidilebilir.

![Image for Usage](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/Port.PNG)


## Layers
🗃 **``Entity Layer``** <br>
&nbsp;&nbsp;&nbsp;&nbsp;📂 ``Entity`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [AnimalOwner.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/entity/AnimalOwner.java) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [Animal.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/entity/Animal.java) <br>


🗃 **``Service Layer``** <br>
&nbsp;&nbsp;&nbsp;&nbsp; 📂 ``Service`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [AnimalOwnerService.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/service/AnimalOwnerService.java) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [AnimalService.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/service/AnimalService.java) <br>


&nbsp;&nbsp;&nbsp;&nbsp;📂 ``RepositoryLayer`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;📂 ``Repository`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [IAnimalOwnerRepository.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/repository/IAnimalOwnerRepository.java) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [IAnimalRepository.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/repository/IAnimalRepository.java) <br>

&nbsp;&nbsp;&nbsp;&nbsp;📂 ``Controller`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [AnimalOwnersController.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/controller/AnimalOwnersController.java) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [AnimalsController.java](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/java/com/uygulama/ecdemo/controller/AnimalsController.java) <br>

&nbsp;&nbsp;&nbsp;&nbsp; 📂 ``Templates`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📂 ``Templates`` <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [animalowners.html](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/templates/animalowners.html) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [animalowners_form.html](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/templates/animalowners_form.html) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [animals.html](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/templates/animals.html) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [animals_form.htmls](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/templates/animals_form.html) <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 📃 [index.html](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/templates/index.html) <br>



## SQL Query
&nbsp;&nbsp;&nbsp;&nbsp; 📃 [RentACarSQLQuery.sql](https://github.com/EmreCelik15/Pet-Care-System/blob/main/script.sql)


## Tables in Database
<table>
  <tr>
     <td>animal_owners</td>
     <td>animals</td>
  </tr>
  <tr>
    <td>
  
Variable Name | Data Type
------------ | -------------
id | INT
first_name | NVARCHAR(MAX)
last_name | NVARCHAR(MAX)
mobile_phone | INT
email | NVARCHAR(MAX)
   
   </td>
    <td>
  
Variable Name | Data Type
------------ | -------------
id | INT
species | INT
name | INT
age | NVARCHAR(25)
animal_owner_id | DECIMAL
description | NVARCHAR(25)

   
   </td>
  </tr>
 </table>

## Output
### Kısa tanıtım videosunu alttaki linkten indirebilirsiniz.
- **[Video](https://github.com/EmreCelik15/Pet-Care-System/blob/main/Video_22-04-17_15-52-55.mp4)**

## Files

![Ansayfa](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/Anasayfa.PNG)

![Animal Owner](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/Sahippp.PNG)

![Animal](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/HayvaList.PNG)

![Animal Adding](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/HayvaEkle.PNG)

![Animal Owner Adding](https://github.com/EmreCelik15/Pet-Care-System/blob/main/src/main/resources/static/images/SahipEkleme.PNG)



## License
[MIT © Emre Celik](https://github.com/EmreCelik15/Pet-Care-System/blob/main/LICENSE)  
