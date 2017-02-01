package com;

public class TxtReader extends AbstractFR {

	public TxtReader(String filename) {
		super(filename);
	}

	@Override
	public String transform(String s) {
		return s;
	}

}
