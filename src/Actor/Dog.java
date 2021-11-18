package Actor;

import java.util.Random;

import javax.swing.ImageIcon;

import GUI.MainGame;

public class Dog  extends ShortRange {

	public Dog(MainGame MainGame) {
		super(MainGame); 
		this.loadImage(); 
		x = 650; 
		y = 200;  
		this.HP = 200;   
		this.defaultSpeed = 5;
		this.type = 5; // dog
		this.speed = defaultSpeed;
		this.atk = 5;
		this.defense = 100;
		this.MP = 1;
		this.Max_MP = 4;
		
	}
	
	public void moveDog() {
		Random randomMove = new Random();
		int Move = randomMove.nextInt(40) ;
		switch (Move) { 
		case 1:
			if ((this.Status==this.LEFT)||(this.Status==this.RIGHT)) dx=0;
			if (this.Status==this.UP) break;
			dy = -this.speed; 
			this.Status = this.UP; 
			break;
		case 15: 
			if ((this.Status==this.LEFT)||(this.Status==this.RIGHT)) dx=0;
			if (this.Status==this.DOWN) break;
			dy = +this.speed;
			this.Status = this.DOWN; 
			break; 
		case 25:
			if (this.Status==this.LEFT) break;
			dx = -this.speed;
			this.Status = this.LEFT;
			break; 
		case 30:
			if (this.Status==this.RIGHT) break;
			dx = +this.speed;
			this.Status = this.RIGHT;
			break; 
		} super.move(); 
	}
	
	
	@Override
	public void loadImage() {
		ImageIcon ii = new ImageIcon("src//image//Dog.png");
		image = ii.getImage(); 
		
	}

}
