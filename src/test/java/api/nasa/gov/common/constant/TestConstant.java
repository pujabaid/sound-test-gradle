package api.nasa.gov.common.constant;

import com.jayway.restassured.http.ContentType;

public class TestConstant {
    public static final ContentType JSON_CONTENT_TYPE = ContentType.JSON;
    public static final ContentType XML_CONTENT_TYPE = ContentType.XML;

    public static final String AUTH_VALUE_ERROR = "Intuit_IAM_Authentication intuit_appid=intuit.cto.api.gateway.test1,intuit_app_secret=qBd9BFUE5HqxrmWx94UT";
    public static final String AUTH_VALUE_INCORRECT_IAM_HEADER_400 = "Intuit_IAM_Authentication intuit_apppid=intuit.cto.api.gateway.test1,intuit_app_secret=qBd9BFUE5HqxrmWx94UTMO";
    public static final String AUTH_VALUE_INCORRECT_IAM_HEADER_401 = "Intuit_IAM_Authentication intuit_appid=intuit.cto.api.gateway.test1,intuit_app_secret=qBd9BFUE5HqxrmWx94UT";
    public static final String AUTH_VALUE_INCORRECT_IAM_HEADER_403 = "Intuit_IAM_Authentication intuit_appid=Intuit.cto.apip,intuit_app_secret=pR4636p5426a6jWy0Sf6lx";
    public static final String AUTH_VALUE_INCORRECT_IAM_HEADER_500 = "Intuit_IAM_Authentication intuit_appid=intuit.cto.api.gateway.test1,intuit_app_secret=qBd9BFUE5HqxrmWx94UTMO";

    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String POST = "POST";
    public static final String DELETE = "DELETE";


}
