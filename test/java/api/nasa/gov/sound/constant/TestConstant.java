package api.nasa.gov.sound.constant;

import com.jayway.restassured.http.ContentType;

public class TestConstant {
    public static final ContentType JSON_CONTENT_TYPE = ContentType.JSON;
    public static final ContentType XML_CONTENT_TYPE = ContentType.XML;

    public static final String SEARCH_QUERY_PARAM = "q";
    public static final String LIMIT_QUERY_PARAM = "limit";
    public static final String APIKEY_QUERY_PARAM = "api_key";

    public static final String AUTH_VALUE_ERROR = "err str 1";
    public static final String AUTH_VALUE_INCORRECT_IAM_HEADER_400 = "";

    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String POST = "POST";
    public static final String DELETE = "DELETE";


}
