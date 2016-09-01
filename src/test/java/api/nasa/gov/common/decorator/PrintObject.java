package api.nasa.gov.common.decorator;

/**
 * Created by pbaid on 8/31/16.
 */
public interface PrintObject {


    public StringBuilder createRepeatString(String repeatStr, int repeatCount);

    public void printStartTestSeparator(String str);

    public void printStopTestSeparator(String str);

    public void printObject(Object object);

    public void printObjectWithHdr(Object object);

}
