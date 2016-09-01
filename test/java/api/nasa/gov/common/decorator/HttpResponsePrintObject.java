package api.nasa.gov.common.decorator;

import org.apache.http.HttpResponse;

/**
 * Created by pbaid on 8/31/16.
 */
public class HttpResponsePrintObject extends AbstractOutputPrinter {


    @Override
    public void printObject(Object object) {
        if(object!=null)
            System.out.println("HttpResponse Body :\n"+((HttpResponse)object).getEntity());


    }

    @Override
    public void printObjectWithHdr(Object object) {
        if (object != null) {
            System.out.println("HttpResponse Headers :\n" + ((HttpResponse) object).getAllHeaders());
            System.out.println("HttpResponse Body :\n" + ((HttpResponse) object).getEntity());
        }
    }

}

