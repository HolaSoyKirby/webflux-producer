# Producer de Kafka

### Proyecto el cual tiene como un endpoint que sirve de base como producer para generar nuevos eventos en apache kafka

Para ejecutar el proyecto localmente se necesita tener instalado y corriendo el servicio de kafka (de ser necesario cambiar las propiedades en el application.yml)

Este proyecto funciona con la versión 21 del JDK, es necesario para levantar el proyecto.

El proyecto está por defecto para levantarse en el puerto 8081 (cambiar port en caso de ser necesario)

El endpoint para generar eventos desde el producer es el siguiente y tiene la siguiente estructura en el curl de ejemplo

curl --request POST \
--url http://localhost:8081/order/new-order \
--header 'Content-Type: application/json' \
--header 'User-Agent: insomnia/11.3.0' \
--data '{
"orderId": 1,
"customerId": 1,
"productIds": [1, 2]
}'

### Si se desea ejecutar el consumer de dichos eventos se debe descargar y ejecutar el siguiente proyecto
* https://github.com/HolaSoyKirby/webflux-consumer