package src.com.selenium.Endpoints;

import java.util.Properties;

public class BaseEndpoint {

    protected Properties props;


    public BaseEndpoint(Properties props) {
        this.props = props;
    }

    public String env(String key){
        return props.getProperty(key);
    }


}
