package oops;

public class SamsungPhone extends Phone {

	@Override
	public void call() {

		System.out.println("calling");
	}

	@Override
	public void Message() {

		System.out.println("messaging");
	}

	@Override
	public void camera() {
		System.out.println("camera rolling");
	}

	public static void main(String[] args) {
		Phone p=new SamsungPhone();
		p.call();
		p.Message();
		p.camera();
	}
}
