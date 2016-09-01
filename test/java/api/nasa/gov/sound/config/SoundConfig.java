package api.nasa.gov.sound.config;

public class SoundConfig {


    public static String basePath;
    public static String baseURI;
    public static String version;
    public static Integer port;
    public static String apiKey;
    public static Integer defaultLimit;


    public static String getBasePath() {
        return basePath;
    }

    public static void setBasePath(String basePath) {
        SoundConfig.basePath = basePath;
    }

    public static String getBaseURI() {
        return baseURI;
    }

    public static void setBaseURI(String baseURI) {
        SoundConfig.baseURI = baseURI;
    }

    public static String getVersion() {
        return version;
    }

    public static void setVersion(String version) {
        SoundConfig.version = version;
    }

    public static Integer getPort() {
        return port;
    }

    public static void setPort(Integer port) {
        SoundConfig.port = port;
    }

    public static String getApiKey() {
        return apiKey;
    }

    public static void setApiKey(String apiKey) {
        SoundConfig.apiKey = apiKey;
    }

    public static Integer getDefaultLimit() {
        return defaultLimit;
    }

    public static void setDefaultLimit(Integer defaultLimit) {
        SoundConfig.defaultLimit = defaultLimit;
    }
}
