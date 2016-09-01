package api.nasa.gov.common.decorator;

/**
 * Created by pbaid on 8/31/16.
 */
public class GenericObjectPrintObject extends AbstractOutputPrinter {



    @Override
    public void printStartTestSeparator(String str) {
        StringBuilder stringBuilder = createRepeatString("*", 50);
        System.out.println("\n\n" + stringBuilder + "\nStart " + str + "\n" + stringBuilder);

    }

    @Override
    public void printStopTestSeparator(String str) {
        StringBuilder stringBuilder = createRepeatString("*", 50);
        System.out.println(stringBuilder + "\nStop " + str + "\n" + stringBuilder + "\n\n");

    }

    @Override
    public void printObject(Object object) {
        if(object!=null )
            System.out.println("Object Body :\n" + object.toString());
    }

    @Override
    public void printObjectWithHdr(Object object) {
//        if(object!=null)
//            System.out.println("Request Headers :\n"+object.headers());
//            System.out.println("Request Body :\n"+object.toString());
        }


}

