h# scdf-recipe-messaging

At present there is not a way to write to a JMS Queue with SCDF.

## Generating Test Messages

Updated message generator for this

## Reading From a JMS Queue

```shell
stream create --name jmsStream --definition "jms --destination=mydata --spring.activemq.broker-url=ssl://b-91b044c2-b725-45fd-a8c8-5d87b1e9b90a-1.mq.us-east-1.amazonaws.com:61617 --spring.activemq.user=springcloud --spring.activema.password=springcloud123 | log

```

## Writing to a Rabbit Exchange
```shell
stream create --name rabbitWriter --definition "http | rabbit --routing-key=mykey"
```


## Reading From a Rabbit Queue

```shell
stream create --name rabbitStream --definition "rabbit --queues=mykey

```
