package cs1302;

/** 
 * This class contains a utility methods for checking the validity of 
 * input parameters.
 */
public class Utility {

    /**
     * Throws a {@code NullPointerException} if the value of the
     * parameter, {@code o} is {@code null}. The method performs no 
     * actions if {@code o} is not {@code null}.
     *
     * @param method the name of the calling method.
     * @param o parameter containing the object to verify.
     * @throws NullPointerException if parameter {@code o} 
     * is {@code null}.
     */
    public static void checkNull(String method, Object o) {
	if(o == null) {
	    String message = method + ": Null Argument Provided";
	    throw new NullPointerException(message);
	} // if
    } // checkNull

} // Utility

