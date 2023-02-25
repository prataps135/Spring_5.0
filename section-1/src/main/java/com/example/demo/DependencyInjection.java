package com.example.demo;

public class DependencyInjection {
	static class Dependecy {
		String doWork() {
			return "work was done";
		}
	}

	static class Injected {
		private Dependecy dependency;

		public Injected(Dependecy dependency) {
			this.dependency = dependency;
		}

		void delegate() {
			System.out.println(dependency.doWork());
		}
	}

	public static void main(String[] args) {
		// Wiring classes
		Injected injected = new Injected(new Dependecy());

		// Application logic
		injected.delegate();
	}

}
