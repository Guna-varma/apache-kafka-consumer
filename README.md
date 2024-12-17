.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties  (Zookeeper Server Start)

.\bin\windows\kafka-server-start.bat .\config\server.properties  (Kafka Server Start)

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic frn-response --from-begning
