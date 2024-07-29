# Inventory Management Backend

Este es el backend para la aplicación de gestión de inventario desarrollado con Spring Boot. Proporciona una API REST para gestionar el inventario, incluyendo la entrega de productos.

## Requisitos

- Java 17
- Maven (3.8.4 o superior)
- MySQL (opcional, según la configuración de base de datos)

## Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/Vanemora0820/inventoryManagement.git
2. El instalara las dependencias automaticamente
3. Revisar la configuracion de la base de datos en el application.properties

   spring.application.name=inventorymanagement


#DATA CONECCTION

spring.datasource.url=jdbc:mysql://localhost:3306/inventary
spring.datasource.username=root
spring.datasource.password=secreta
spring.datasource.driver-class-name=com.mysql.jdbc.Driver


#CONFIG JPA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#CONFIG SWAGGER

springdoc.swagger-ui.operations-sorter=method
4. subir los servicios se podran visualizar en swagger en esta url : http://localhost:8080/swagger-ui/index.html#/inventory-controller/getAllInventory y probar el front. 


## Contacto

Nombre: Vanessa Mora
Email: vanemorahdez@gmail.com
