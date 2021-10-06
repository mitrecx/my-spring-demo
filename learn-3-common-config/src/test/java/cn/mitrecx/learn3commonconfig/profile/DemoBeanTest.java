package cn.mitrecx.learn3commonconfig.profile;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProfileConfig.class})
@ActiveProfiles("dev")
public class DemoBeanTest {
    @Autowired
    private DemoBean demoBean;

    @Test
    public void testInject() {
        Assert.assertEquals("development profile...", demoBean.getContent());
    }
}
