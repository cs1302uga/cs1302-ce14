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
    public static <T> void checkNull(String method, T[] o) {
	for(T obj: o) {
	    if(obj == null) {
		String message = method + ": Null Argument Provided";
		throw new NullPointerException(message);
	    } // if
	} // for
    } // checkNull

} // Utility

