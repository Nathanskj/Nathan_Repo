package Chapter1Exercises;

public class Chapter1Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mass = 800;
		float velocity = 25;
		float distance = 50;
		float force = mass * velocity;
		double KineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
		System.out.println("The energy is: " + (force * distance) + KineticEnergy + " Joules");

	}

}
