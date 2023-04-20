/*
Responsive

1. First, the client sends a request message to a server
2. Next, the server sends an acknowledgement message to the client
   immediately and then takes whatever time is necessary to process the request
3. Once the request is fully processed, the response message is sent from the server to the client

Asynchronous communication design pattern implementation
https://static.packt-cdn.com/products/9781789809770/graphics/assets/9019f5d2-a1fb-4c01-987b-9d296126e6c0.png

UML Class Diagram

 */
public interface CallbackListener {

    void processCallback();
}

