package com.zqh.storm.logging.common;

import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class StringScheme implements IRawMultiScheme{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Iterable<List<Object>> deserialize(byte[] ser) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
	
		List<Object> obj = new Values(new String(ser, "UTF-8"));
		if (null == obj)
			return null;
		else
			return Arrays.asList(obj);
	}

	@Override
	public Fields getOutputFields() {
		// TODO Auto-generated method stub
		return new Fields("bytes");
	}

}
