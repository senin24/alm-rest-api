package org.alm;

import org.alm.model.Entity;
import org.alm.model.Test;
import org.alm.model.TestInstance;
import org.alm.model.TestSet;

public class App {

	public static void main(String[] args) throws Exception {

		String properties = "host=kap-us-alm2.int.kronos.com\nport=8080\ndomain=DEFAULT\nproject=Falcon\nusername=pavel.senin\npassword=Epams72016";
		Client client = new Client(new Config(properties));
		client.login();
		Entity entity = new Entity();
//		entity.id("121375");
		TestInstance testInstance = new TestInstance(entity);
		testInstance.testId("15956");
//		testInstance.
		Test test = client.loadTest(testInstance);
		System.out.println(test.name());
//		TestSet testSet = client.loadTestSet("121375");
//		testSet.
//		client.loadTest(testInstance)
//		System.out.println(testSet.toString());
		client.logout();
	}

}
