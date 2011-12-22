package org.odata4j.examples.jersey.consumer;

import org.odata4j.consumer.ODataConsumer;
import org.odata4j.examples.consumers.AbstractNetflixConsumerExample;
import org.odata4j.jersey.consumer.ODataJerseyConsumer;

public class NetflixConsumerExample extends AbstractNetflixConsumerExample {


  public static void main(String... args) {
    NetflixConsumerExample example = new NetflixConsumerExample();
    example.run(args);
  }

  @Override
  public ODataConsumer create(String endpointUri) {
    return ODataJerseyConsumer.create(endpointUri);
  }

}
