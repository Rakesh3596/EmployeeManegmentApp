# Employe Management Application
The application will take the employee data from the Swagger-UI then following the Backend process will take place</br>
Step 1: Data -->Controller -->PostMapping will call -->Service Layer</br>
Step 2: Business Logic Layer(Service Layer) -->Data Processed and validated 
        if (validated) --> Database Repository will call
        else           --> Error Message will shown by Error handler Controller</br>
Step 3: Data will Stored in the database and returned to the presentation layer handler ie --> Controler
