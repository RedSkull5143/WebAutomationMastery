import com.omshinde.webautomastery.drivers.FeatureToggle;

public class TestLogger {
    public void log(String message){
        if(FeatureToggle.LOGGER.isOn()){
            System.out.println(message);
        }
    }
}
