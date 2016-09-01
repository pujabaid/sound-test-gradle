package api.nasa.gov.common.decorator;

import com.jayway.restassured.response.Response;

/**
 * Created by pbaid on 8/31/16.
 */
public class RestAssuredResponsePrintObject extends AbstractOutputPrinter {



    @Override
    public void printObject(Object object) {
        if(object!=null)
            System.out.println("Response Body :\n"+((Response)object).asString());


    }

    @Override
    public void printObjectWithHdr(Object object) {
        if (object != null) {
            System.out.println("Response Headers :\n" + ((Response) object).headers());
            System.out.println("Response Body :\n" + ((Response) object).asString());
        }
    }

}

