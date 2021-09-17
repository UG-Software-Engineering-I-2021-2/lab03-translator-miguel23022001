import org.testng.Assert;
import org.testng.annotations.Test;

import translator.Translator;

public class EjemploVehiculoTest {
    @Test
    public void Test01() throws Exception{
      String fromLang = "en";
      String toLang = "es";
      String text = "Hello";
      Assert.assertEquals(Translator.translate(fromLang, toLang, text),"Hola");
    }

    @Test(threadPoolSize = 80, invocationCount = 80)
    public void StressTest01() throws Exception {
        String fromLang = "en";
        String toLang = "es";
        String text = "Hello";
        Assert.assertEquals(Translator.translate(fromLang, toLang, text),"Hola");
    }

}