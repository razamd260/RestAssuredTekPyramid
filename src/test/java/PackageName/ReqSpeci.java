package PackageName;

public interface ReqSpeci extends RequestS{
   
	  public abstract void contentType();
	  public abstract void auth();
	  public abstract void body();
	  public abstract void header();
	  public abstract void pathParam();
	  public abstract void QueryParam();
	  public abstract void param();
	  public abstract void formParam();
	  
	  public static RestAs when() {
		  return new RestAs();
	  }
	  
}
