package Environments.EnviromnetHandler;

public class DataManager {
    ConfigurationManager configurationManager = ConfigurationManager.getConfigurationManager();

    public String getApiUri() {
        String apiUri = configurationManager.environmentProperties.getProperty("apiURI");
        return apiUri;
    }
}
