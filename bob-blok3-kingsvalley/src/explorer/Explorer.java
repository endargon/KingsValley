package explorer;

import AnimatingSprite.AnimatedSprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import nl.bob.KingsvalleyGame.KingsValley;

public class Explorer  {
	
	//fields
	private KingsValley game;
	private ExplorerMovement moveRight;
	private Vector2 position;
	private float speed;
	private Texture text;
	private AnimatedSprite states;
	public AnimatedSprite getStates() {
		return states;
	}

	public void setStates(AnimatedSprite states) {
		this.states = states;
	}

	public Texture getText() {
		return text;
	}

	public void setText(Texture text) {
		this.text = text;
	}

	public KingsValley getGame() {
		return game;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	//properties
	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	
	//properties
	
	//constructor
	public Explorer(KingsValley game,Vector2 position,float speed)
	{
		this.game = game;
		this.position = position;
		this.speed = speed;
		this.states = new ExplorerMovement(this);
		this.text = new Texture("data/explorer.png");
	}
	
	//update
	public void Update(float delta)
	{
		this.states.Update(delta);
	}
	
	
	//draw
	public void Draw(float delta)
	{
		this.states.Draw(delta);
	}

}
