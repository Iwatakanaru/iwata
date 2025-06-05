package curriclum1_19;

public class dog 
{
	  private String name;
	  private static int animalCount = 0;

	  public dog(String name) 
	  {
	      this.name = name;
	      animalCount++;
	  }

	  public String getName() 
	  {
	      return name;
	  }

	  public static int getAnimalCount()
	  {
	      return animalCount;
	  }
}
