GET:
http://localhost:9090/product-list/products?currency=GBP

POST:
http://localhost:9090/product-list/products?currency=GBP
    
    #Sample payrol.
    
    {
        "id": 1,
        "name": "Laptop",
        "description": "Dell 5250 Precision series",
        "price": 956.494
    }
    

PUT:
  http://localhost:9090/product-list/products/1
  
PATCH:
  http://localhost:9090/product-list/products/1
  
DELETE: 
   http://localhost:9090/product-list/products/1
   
   --delets all    
   http://localhost:9090/product-list/products 
   
   
   
 Swagger URI:
     http://localhost:9090/product-list/v2/api-docs
     http://localhost:9090/product-list/swagger-ui.html#/product-controller

DataBase URI:
      http://localhost:9090/product-list/h2-console
      DBURI search by jdbc:h2:mem: example : b86c50dd-cf98-4984-a561-20e511cb6248     
      user name 'sa'