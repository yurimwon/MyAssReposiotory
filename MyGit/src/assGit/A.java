package assGit;

public class A {
	public static void main(String[] args) {
		System.out.println("This is Git Assignment!");
		System.out.println("This is the revised version of A.java.");
		System.out.println("A changed in master branch.");
		B name = new B();
		name.sayMyName("WonYuRim");
		System.out.println("A changed in master branch again.(devC)");
		C age = new C();
		age.sayAge(24);
	}
}
