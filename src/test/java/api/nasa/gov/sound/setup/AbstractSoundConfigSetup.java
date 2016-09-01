package api.nasa.gov.sound.setup;

import api.nasa.gov.sound.config.SoundConfig;
import org.testng.Assert;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by pbaid on 8/31/16.
 */
public abstract class AbstractSoundConfigSetup {

    public static void initializeEnvConfigFromPropertFile(String env) {
        System.out.println("Puja env : " + env);
        try {
            Properties props = new Properties();

            props.load(new FileInputStream("./src/test/resources/sound/test.properties"));

            SoundConfig.setBaseURI(props.getProperty("api.nasa.gov.rest.protocol." + env)+props.getProperty("api.nasa.gov.rest.base.url." + env));
            SoundConfig.setBasePath(props.getProperty("api.nasa.gov.sound.base.path." + env));
            SoundConfig.setVersion(props.getProperty("api.nasa.gov.sound.version." + env));
            SoundConfig.setPort(Integer.parseInt(props.getProperty("api.nasa.gov.sound.port." + env)));
            SoundConfig.setApiKey(props.getProperty("api.nasa.gov.sound.apikey." + env));
            SoundConfig.setDefaultLimit(Integer.parseInt(props.getProperty("api.nasa.gov.sound.default.limit." + env)));
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

}
