public interface Fly {

  void takeOff ();

  int ascend (int meters);

  int descend (int meters);

  void land ();

  default void glides () {
    System.out.println ("glides in the air");
  }

}
