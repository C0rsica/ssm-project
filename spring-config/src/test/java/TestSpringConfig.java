import aop.Audience;
import aop.ConcertConfig;
import aop.DoSomecalu;
import aop.Performance;
import demo.ApplicationConfig;
import exclude.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {ApplicationConfig.class, ConcertConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpringConfig {

    @Autowired
    @Qualifier("excluedPerson")
    Person person;

    @Autowired
    Performance doSomecalu;

    @Test
    public void testConfig() {
        Assert.assertNotNull(person);
        Assert.assertNotNull(person.getAddress());
        person.setId(11);
        person.setName("Json");
    }


    @Test
    public void testAspect() throws Exception {
        Assert.assertNotNull(doSomecalu);
        doSomecalu.perform();
    }
}
