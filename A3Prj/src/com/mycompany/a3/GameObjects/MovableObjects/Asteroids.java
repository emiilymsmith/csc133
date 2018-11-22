package com.mycompany.a3.GameObjects.MovableObjects;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Point;
import com.mycompany.a3.ICollider;
import com.mycompany.a3.GameObjects.GameObject;
import com.mycompany.a3.GameObjects.MovableObject;
/**
 * @author Emily Smith
 * @version 1.0
 * 
 * Asteroids
 * 
 */
public class Asteroids extends MovableObject{
	//private int radius, radius2; /* Using two radius sizes to make each asteroid different */
	
	/* Asteroid Constructor */
	public Asteroids(int width, int height){
		super(width,height);
		super.setColor(ColorUtil.BLACK); // from GameObject
		this.setSize(getRandomSize());
		//this.radius2 = getRandomSize();
		super.setRandomHeading();// from MovableObject
		super.setRandomSpeed(); //me asking parent what my speed is
		super.setRandomLocation(); //from GameObject
	}
	
	/* getters and setters */
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
	
	public int getRandomSize() {
		int num = r.nextInt((30 - 6) + 1) + 6; //max-min +1 so it doesn't start at 0
		return num;
	}
	
	public String toString() {
		String returnStr = "";
		returnStr += super.toString();
		returnStr += "Asteroid Size: "+super.getSize()+"\n";
		returnStr += "Asteroid\n";
		return returnStr;
	}
	@Override
	public void draw(Graphics g, Point pCmpRelPrnt) {
		g.setColor(super.getColor());
		g.fillArc((int)(pCmpRelPrnt.getX() + this.getX() - (2 * super.getSize())), 
				(int)(pCmpRelPrnt.getY()+this.getY() - (2 * super.getSize())), 2 * super.getSize(), 2 * super.getSize(), 0, 360);
	}
	/* fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) */

	@Override
	public void handleCollision(ICollider obj) {
		GameObject otherObj = (GameObject)obj;
		if(obj instanceof Asteroids) {
			this.poofed();
			otherObj.poofed();
		}
		
	}
}
