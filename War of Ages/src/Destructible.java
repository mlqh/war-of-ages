/**
 * Destructible.java
 * Destructible class, entities that can take damage and be destroyed
 * Matthew Hao
 * Jan 20, 2020
 */

import java.awt.Point;

public abstract class Destructible extends Entity {
    
    private int health;
    private Hitbox hitbox;
    private int width, height;
    
    public Destructible(int teamSide, int type, int evolution) {
        super(teamSide, type, evolution);
        if(type == TOWER_TYPE) { 
            this.health = TOWER_HEALTH;
            this.width = TOWER_WIDTH;
            this.height = TOWER_HEIGHT;
            
        } else {
            this.width = CREATURE_WIDTH;
            this.height = CREATURE_HEIGHT;
            
            if(type == FIRST_TYPE) {
                this.health = FIRST_HEALTH + (evolution * FIRST_MULTIPLIER);
                
            } else if(type == SECOND_TYPE) {
                this.health = SECOND_HEALTH + (evolution * SECOND_MULTIPLIER);
                
            } else if(type == THIRD_TYPE) {
                this.health = THIRD_HEALTH + (evolution * THIRD_MULTIPLIER);
                
            } else if(type == FOURTH_TYPE) {
                this.health = FOURTH_HEALTH + (evolution * FOURTH_MULTIPLIER);
            }
        }
        this.hitbox = new Hitbox(new Point(this.getPosition()), this.width, this.height);
    }
    
    public void takeDamage(int damage) {
        this.health -= damage;
    }
    
    //-------------------------
    public int getHealth() {
        return this.health;
    }
    
    public Hitbox getHitbox() {
        return this.hitbox;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
    //-------------------------------    
}