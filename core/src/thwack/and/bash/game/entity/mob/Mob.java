
package thwack.and.bash.game.entity.mob;

import thwack.and.bash.game.animation.MobAnimation;
import thwack.and.bash.game.collision.CollisionBody;
import thwack.and.bash.game.entity.Entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

//Movable entity
public abstract class Mob extends Entity {

	public Mob (CollisionBody collisionBody) {
		super(null, collisionBody);
	}

	protected final void initMobAnimation(MobAnimation mobAnimation){
		this.mobAnimation = mobAnimation;
		sprite = new Sprite((mobAnimation.getStartAnimation(0)));
	}

	protected MobAnimation mobAnimation;

	public abstract MobAnimation createMobAnimation();

	public void move (Vector2 movement) {
		if (movement.x != 0 && movement.y != 0) {
			movement.x = movement.x * 0.75f;
			movement.y = movement.y * 0.75f;
		}
		getBody().setLinearVelocity(movement);
	}

}
