package HadoopWithScala

import java.util.Properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object KafkaProducer extends App {

  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")
  props.put("acks", "1")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  val producer = new KafkaProducer[String, String](props)

  /*
* def shellCommandFunction(dir: String = "/home/bdauser/"): String = {
    Seq("ssh bdauser@indlin5220")
    Seq(s"kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic $topic ", dir).!!
  }
  shellCommandFunction()
*/

/*


  def createTopicIntoKafka(topic: String, numPartitions: Int, replicationFactor: Int): Unit = {
    val zookeeperConnect = "localhost:2181"
    val sessionTimeoutMs = 10 * 1000
    val connectionTimeoutMs = 8 * 1000

    val zkClient = ZkUtils.createZkClient(zookeeperConnect, sessionTimeoutMs, connectionTimeoutMs)
    val zkUtils = new ZkUtils(zkClient, zkConnection = new ZkConnection(zookeeperConnect), isSecure = false)
    AdminUtils.createTopic(zkUtils, topic, numPartitions, replicationFactor, new Properties)
    zkClient.close()
  }

    createTopicIntoKafka("iden007",10,3)
*/

   for (i <- 1 to 50) {
      val record = new ProducerRecord( "practice1", "key" + i, "value" + i)
      producer.send(record)
    }
    println("Message Sending!!")
    Thread.sleep(1000)
    println("Message Sent!!")
    producer.close()
}

/*
*
* NOTE: In Interactive Shell, you can trigger do below to trigger the shell command -
*
* scala> val result = "ls -al" !!
result: String =
"total 64
drwxr-xr-x  10 Al  staff   340 May 18 18:00 .
drwxr-xr-x   3 Al  staff   102 Apr  4 17:58 ..
-rw-r--r--   1 Al  staff   118 May 17 08:34 Foo.sh
-rw-r--r--   1 Al  staff  2727 May 17 08:34 Foo.sh.jar
"

If you do println(result) --> you will get the list of files. But if below is the condition(means you use one exclamatory sign ) then you will get the output as 0
*
* scala> val result = "ls -al" !
result: String =
"total 64
drwxr-xr-x  10 Al  staff   340 May 18 18:00 .
drwxr-xr-x   3 Al  staff   102 Apr  4 17:58 ..
-rw-r--r--   1 Al  staff   118 May 17 08:34 Foo.sh
-rw-r--r--   1 Al  staff  2727 May 17 08:34 Foo.sh.jar
"

* */
