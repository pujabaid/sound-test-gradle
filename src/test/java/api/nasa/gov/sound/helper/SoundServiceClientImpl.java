package api.nasa.gov.sound.helper;

import api.nasa.gov.sound.constant.TestConstant;
import api.nasa.gov.sound.setup.AbstractSoundBaseTest;
import com.jayway.restassured.response.Response;

import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

/**
 * Created by pbaid on 8/31/16.
 */
public class SoundServiceClientImpl extends AbstractSoundBaseTest implements SoundServiceClient{

    @Override
    public Response getAllSounds() {
//        String url = baseURI+"/"+basePath;
//        System.out.println("url is : "+url);
        Response response = given().
                contentType(TestConstant.JSON_CONTENT_TYPE).
                when().
                get().
                then().
                extract().response();
        return response;
    }

    @Override
    public Response getAllSoundsUsingQueryParam(Map<String,Object> queryParams) {
//        String url = baseURI+"/"+basePath;
//        System.out.println("url is : "+url);
        Response response = given().
                contentType(TestConstant.JSON_CONTENT_TYPE).
                queryParameters(queryParams).
                when().
                get().
                then().
                extract().response();
        return response;
    }

    @Override
    public Response getAllSoundsUsingUrl(String queryparam) {

//        String url = baseURI+"/"+basePath;
//        System.out.println("url is : "+url);
        Response response = given().
                contentType(TestConstant.JSON_CONTENT_TYPE).
                queryParameters(queryParams).
                when().
                get().
                then().
                extract().response();
        return response;    }
}
