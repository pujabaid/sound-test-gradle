package api.nasa.gov.sound.helper;

import com.jayway.restassured.response.Response;

import java.util.Map;

/**
 * Created by pbaid on 8/31/16.
 */
public interface SoundServiceClient {

    public Response getAllSounds();

    public Response getAllSoundsUsingQueryParam(Map<String,Object> queryParams);


}
