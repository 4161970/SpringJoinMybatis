import com.dnsoft.mapper.CustomerMapper;
import com.dnsoft.pojo.Customer;
import com.dnsoft.service.CustomerService;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JoinTest {
    @Test
    @Ignore
    public void findCustomerByIdDaoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:" +
                "applicationContext.xml");
        CustomerMapper customerMapper=applicationContext.getBean(CustomerMapper.class);
        Customer customer=customerMapper.findCustomerById(1);
        System.out.println(customer);
    }
    @Test
    public void addCustomerTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CustomerService customerService=applicationContext.getBean(CustomerService.class);
        Customer customer=new Customer();
        customer.setUsername("宋锋");
        customer.setJobs("程序员");
        customer.setPhone("123456789");
        customerService.addCustomer(customer);
    }
}
