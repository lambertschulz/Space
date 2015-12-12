package de.hsrw.space.screen;

import de.hsrw.space.entity.Player;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Level {
	private PApplet parent; // das Elternelement für die Processingbefehle

	private int f_w = 0;// Spielfeld breite
	private int f_h = 0;// Spielfeld höhe
	private int f_x = 0;// Spielfeld X Position
	private int f_y = 0;// Spielfeld Y Position

	private PImage bgImage;
	private Sterne st;
	private EscMenu em;

	private Player player;
	private boolean running;

	public Level(PApplet p) {
		parent = p;
		f_w = parent.width / 2; // setze Spielfeldbreite
		f_h = (parent.height / 8) * 7; // setze Spielfeldhöhe
		f_x = (parent.width / 2) - (f_w / 2); // setze SpielfeldXposition
		f_y = parent.height / 16; // setze SpielfeldYposition
		bgImage = parent.loadImage("textures//backgrounds//levelBG.png");
		bgImage.resize(parent.width, parent.height);
		this.player = new Player(p, true);
		this.st = new Sterne(p, this.f_x, this.f_y, this.f_w, this.f_h);
		running = true;
		em = new EscMenu(p);
	}

	public void render() {
		if (running) {
			parent.noStroke();
			parent.background(50);
			parent.image(bgImage, 0, 0);
			parent.fill(240);
			parent.rect(f_x, f_y, f_w, f_h, 2);
			getSt().render();
			getPlayer().move();
			getPlayer().update(f_w);
			getPlayer().render();
			if (parent.keyPressed) {
				if (parent.key == PConstants.DELETE || parent.key == 'q' || parent.key == 'Q') {
					running = false;
					em.renderbg();
				}
			}
		} else {
			em.render();
			running = em.pressedContinue();
			if (parent.keyPressed) {
				if (parent.key == PConstants.DELETE || parent.key == 'q' || parent.key == 'Q') {
					running = true;
				}
			}
		}
	}

	public Player getPlayer() {
		return player;
	}

	public Sterne getSt() {
		return st;
	}
}
