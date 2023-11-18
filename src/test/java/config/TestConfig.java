package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/configs/test.properties",
})
public interface TestConfig extends Config {
    @Key("deviceHost")
    String deviceHost();
}
