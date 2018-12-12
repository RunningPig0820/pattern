package om.taosha.pattern;

import com.taosha.pattern.proxy.cglib.CglibHouseCarIntermediary;
import com.taosha.pattern.proxy.cglib.CglibRenter;
import com.taosha.pattern.proxy.common.Person;
import com.taosha.pattern.proxy.jdk.HouseIntermediary;
import com.taosha.pattern.proxy.jdk.Renter;
import com.taosha.pattern.proxy.staticproxy.StaticHouseIntermediary;
import com.taosha.pattern.proxy.staticproxy.StaticRenter;
import org.junit.Assert;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @ClassName RenterTest
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/12 14:29
 * @Version 1.0
 **/
public class RenterTest {

    @Test
    public void test_renter_house() throws Exception {
        Person renter = new Renter();
        Person person = (Person)new HouseIntermediary().getInstance(new Renter());
        person.rentHouse();
        person.buyCar();
        //说明代理类和被代理类不是同一个类
        Assert.assertNotSame(renter, person);

        //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("$Proxy0.class");
        os.write(bytes);
        os.close();
    }

    @Test
    public void test_static_renter_house() throws Exception {
        StaticHouseIntermediary staticHouseIntermediary = new StaticHouseIntermediary();
        staticHouseIntermediary.rentHouse(new StaticRenter());
    }

    @Test
    public void test_cglib_renter_house() throws Exception {
        CglibRenter cglibRenter = (CglibRenter)new CglibHouseCarIntermediary().getInstance(CglibRenter.class);
        cglibRenter.rentHouse();

        //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{CglibRenter.class});
        FileOutputStream os = new FileOutputStream("$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
