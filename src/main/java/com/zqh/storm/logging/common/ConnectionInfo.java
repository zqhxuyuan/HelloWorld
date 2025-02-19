package com.zqh.storm.logging.common;

import kafka.javaapi.consumer.SimpleConsumer;

import java.util.HashSet;
import java.util.Set;


/*
 * ConnectionInfo data structure can save a consumer with multi-partition ids
 */
public class ConnectionInfo {
	
	/**
	 * @return the _consumer
	 */
	public SimpleConsumer get_consumer() {
		return _consumer;
	}

	private SimpleConsumer _consumer;
	
	//a broker consumer can have several partition ids
	Set<Integer> partitionIds = new HashSet<Integer>();
	
	public ConnectionInfo(SimpleConsumer consumer) {
		this._consumer = consumer;
	}
}
