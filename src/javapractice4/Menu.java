package javapractice4;

public enum Menu {
	Pizza(12000), Spagetti(8500), Noodle(8000);
	int value;
	private Menu(int value) {
		this.value = value;
	}
}
