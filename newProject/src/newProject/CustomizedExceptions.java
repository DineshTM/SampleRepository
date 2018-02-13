package newProject;

class SampleException extends Exception {
	String s1;

	public SampleException() {

	}

	public SampleException(String s) {
		s1 = s;
	}

	public String toString() {
		return (s1);
	}

	public void display() throws SampleException {
		String name = "dinesh";
		throw new SampleException("This is throw my name " + name);
	}
}

public class CustomizedExceptions {
	private static final long serialVersionUID = 6689938512340250326L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleException sample = new SampleException();
		try {
			System.out.println("This is try block");
			// sample.display();
			throw new SampleException("This is customized error");
		} catch (SampleException e) {
			System.out.println("This is catch block");
			System.out.println(e);
		}
	}
}
