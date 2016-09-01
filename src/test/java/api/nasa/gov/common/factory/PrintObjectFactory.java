package api.nasa.gov.common.factory;


import api.nasa.gov.common.decorator.*;

/**
 * Created by pbaid on 8/31/16.
 */
public class PrintObjectFactory {
    public static PrintObject getPrintObject(String printObjectType )
    {
        if(printObjectType == null ){
            return null;
        }
        if(printObjectType.equals("RestAssuredResponse")){
            return new RestAssuredResponsePrintObject();
        }
        else
        if(printObjectType.equals("HttpResponse")){
            return new HttpResponsePrintObject();

        } else {
            return new GenericObjectPrintObject();
        }
    }
}
