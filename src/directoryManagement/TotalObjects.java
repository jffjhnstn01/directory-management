package directoryManagement;

public class TotalObjects {
	private static int numObjects = 0;

	   public TotalObjects()
	   {
	      numObjects=0;
	   }

	   public void objectAdded()
	   {
	      numObjects++;
	   }

	   public int getTotalObjects()
	   {
	      return numObjects;
	   }

}
