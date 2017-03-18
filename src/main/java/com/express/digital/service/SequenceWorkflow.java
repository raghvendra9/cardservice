package com.express.digital.service;

public class SequenceWorkflow {
	
	

	public  long execute(MarketDetails sd)
	{

		System.out.println("I am in sequence Flow");



		if(sd.marketcode.equals("moo"))
		{
			MarketDetails m = new MarketDetails();

			long dpan= m.getdPAN();

			return dpan;

		}

		else return 60;


	}
}


