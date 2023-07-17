docker exec -it mongodb bash
mongosh localhost:27017
spring.data.mongodb.uri=mongodb://localhost:27017/api-testing-db?directConnection=true&serverSelectionTimeoutMS=2000&appName=mongosh+1.10.1