package entity;

import org.joml.Vector3f;

import graphics.model.Model;

public class Entity {

  private Model model;
  
  private Vector3f position;
  private Vector3f rotation;
  private float scale;
  
  public Entity(Model model) {
    this(model, new Vector3f(), new Vector3f(), 1f);
  }
  
  public Entity(Model model, Vector3f position) {
    this(model, position, new Vector3f(), 1f);
  }
  
  public Entity(Model model, Vector3f position, Vector3f rotation, float scale) {
    this.model = model;
    this.position = position;
    this.rotation = rotation;
    this.scale = scale;
  }

  public Model getModel() {
    return model;
  }

  public Vector3f getPosition() {
    return position;
  }
  
  public void setPosition(float x, float y, float z) {
    this.position.x = x;
    this.position.y = y;
    this.position.z = z;
  }

  public void setPosition(Vector3f position) {
    this.position = position;
  }

  /**
   * Returns rotation in degrees.
   * @return rotation
   */
  public Vector3f getRotation() {
    return rotation;
  }
  
  /**
   * Sets rotation around x, y and z axes in degrees.
   * @param x
   * @param y
   * @param z
   */
  public void setRotation(float x, float y, float z) {
    this.rotation.x = x;
    this.rotation.y = y;
    this.rotation.z = z;
  }

  /**
   * Sets rotation vector in degrees.
   * @param rotation
   */
  public void setRotation(Vector3f rotation) {
    this.rotation = rotation;
  }

  public float getScale() {
    return scale;
  }

  public void setScale(float scale) {
    this.scale = scale;
  }

}
