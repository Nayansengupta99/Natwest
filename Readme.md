According to the question,

1. Developed two microservices. One is the sender and another one is the consumer. 
2. Response is getting sent from sender-api and consumed by receiver api.
3. Once a response is posted by sender , its getting encrpted by AES algorithm in java.
4. Secret Key used for encrption stored as an env variable for better security.
5. Implemented H2 database for db storage.
6. Hosted in Heroku


Sender API:-
Post Request: https://natwestsenderapi.herokuapp.com/transaction/send
Request Body: {
            
          "accountNumber":12345678899,
          "type":"Credit",
          "amount":10000,
          "currency":"INR",
          "accountForm":987654321012
              }
              
              
              
Receiver API to be triggered after triggering Sender API:

Get Request: https://natwestreceiverapi.herokuapp.com/receiver/save

