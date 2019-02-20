package cs1302;

/** 
 * This class contains a utility methods for checking the validity of 
 * input parameters.
 */
public class Utility {

    /**
     * Throws a {@code NullPointerException} if any values in the
     * array parameter, {@code o} are {@code null}. The 
     * method performs no actions if all values in {@code o} 
     * are not {@code null}.
     *
     * @param method the name of the calling method.
     * @param o array parameter containing all objects to verify.
     * @throws NullPointerException if any element of parameter
     * {@code o} is {@code null}.
     */
    public static void checkNull(String method, Object[] o) {
	for(Object obj: o) {
	    if(o == null) {
		String message = method + ": Null Argument Provided";
		throw new NullPointerException(message);
	    } // if
	} // for
    } // checkNull

} // Utility

