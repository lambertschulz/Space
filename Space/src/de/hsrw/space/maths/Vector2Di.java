package de.hsrw.space.maths;

public class Vector2Di {

	private int x = 0;
	private int y = 0;

	public Vector2Di(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * ADDITION
	 */
	// with Vector
	public void add(Vector2Di b) {
		this.x += b.getX();
		this.y += b.getY();
	}

	public void add(Vector2Dd b) {
		this.x += (int) b.getX();
		this.y += (int) b.getY();
	}

	// with Number
	public void add(int b) {
		this.x += b;
		this.y += b;
	}

	public void add(double b) {
		this.x += (int) b;
		this.y += (int) b;
	}

	/*
	 * SUBTRAKTION
	 */
	// with Vector
	public void subtract(Vector2Di b) {
		this.x -= b.getX();
		this.y -= b.getY();
	}

	public void subtract(Vector2Dd b) {
		this.x -= b.getX();
		this.y -= b.getY();
	}

	// width Number
	public void subtract(int b) {
		this.x -= b;
		this.y -= b;
	}

	public void subtract(double b) {
		this.x -= b;
		this.y -= b;
	}

	/*
	 * MULTIPLIKATION
	 */
	// by Vector
	public void multiply(Vector2Di b) {
		this.x *= b.getX();
		this.y *= b.getY();
	}

	public void multiply(Vector2Dd b) {
		this.x *= b.getX();
		this.y *= b.getY();
	}

	// by Number
	public void multiply(int b) {
		this.x *= b;
		this.y *= b;
	}

	public void multiply(double b) {
		this.x *= b;
		this.y *= b;
	}
	
	/*
	 * OTHER FUNKTIONS
	 */

	public double length() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	/*
	 * GETTER & SETTER
	 */

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}