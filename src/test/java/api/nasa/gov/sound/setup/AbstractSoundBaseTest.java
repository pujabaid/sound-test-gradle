package api.nasa.gov.sound.setup;

import api.nasa.gov.common.decorator.PrintObject;
import api.nasa.gov.common.factory.PrintObjectFactory;
import api.nasa.gov.sound.config.SoundConfig;
import api.nasa.gov.sound.helper.SoundServiceClient;
import api.nasa.gov.sound.helper.SoundServiceClientImpl;
import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

/**
 * Created by pbaid on 8/31/16.
 */
public abstract class AbstractSoundBaseTest extends AbstractSoundConfigSetup {

    static
    {
        initConfig();
        setup();
        gson = new Gson();
    }

    public static PrintObject printObject = PrintObjectFactory.getPrintObject("RestAssuredResponse");
    public static String env;
    public static SoundServiceClient soundServiceClient = new SoundServiceClientImpl();
    public static Gson gson;
    public static Response response;
    public static Map<String,Object> queryParams = new HashMap<>();

    public static void initConfig()
    {
        env = System.getProperty("env");
        initializeEnvConfigFromPropertFile(env);
    }
    public static void setup()
    {
        basePath = SoundConfig.basePath;
        baseURI = SoundConfig.baseURI;
        port = SoundConfig.port;
    }


}
