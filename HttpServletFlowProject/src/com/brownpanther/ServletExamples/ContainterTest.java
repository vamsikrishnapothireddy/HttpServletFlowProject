package com.brownpanther.ServletExamples;

class ExampleHttpServelet {

	void init(String serviceConfig) {

		init();
	}

	void init() {
		System.out.println("In zero arg init()  of ExampleHttpServelet class..");
	}

	void Service() {

		doget();
	}

	void doget() {

		System.out.println("In doget Method from ExampleHttpServelet calss");
	}

}

class CustomServlet extends ExampleHttpServelet {

	static {

		System.out.println("CustomServlet class loaded");
	}

	CustomServlet() {
		System.out.println("CustomServlet class constructor");
	}

	void doget() {

		System.out.println("In doget Method from CustomServlet class");
	}
}

public class ContainterTest {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// 1) load CustomServlet class
		Class c = Class.forName("com.brownpanther.ServletExamples.CustomServlet");
		// 2) Instantiate class object
		CustomServlet customServlet = (CustomServlet) c.newInstance();
		// Life cycle methods start

		// 3) initilisation

		customServlet.init("serverConfig");
		// 4) service methods calling
		customServlet.Service();

	}

}
