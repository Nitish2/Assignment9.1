package AbstractClass;

class Employee extends Salary {
	@Override
	void callme() {
		System.out.println("Employee name is Arun kumar");

	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.callme();
		emp.main();
	}
}