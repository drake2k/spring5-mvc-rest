package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner{

    private CategoryRepository categoryRespository;
    private CustomerRepository customerRespository;

    public Bootstrap(CategoryRepository categoryRespository, CustomerRepository customerRespository) {
        this.categoryRespository = categoryRespository;
        this.customerRespository = customerRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRespository.save(fruits);
        categoryRespository.save(dried);
        categoryRespository.save(fresh);
        categoryRespository.save(exotic);
        categoryRespository.save(nuts);


        Customer cust1 = new Customer();
        cust1.setFirstname("JF");
        cust1.setLastname("Beaulac");

        Customer cust2 = new Customer();
        cust2.setFirstname("John");
        cust2.setLastname("Doe");

        Customer cust3 = new Customer();
        cust3.setFirstname("Karine");
        cust3.setLastname("Landry");

        customerRespository.save(cust1);
        customerRespository.save(cust2);
        customerRespository.save(cust3);

        System.out.println("Data Loaded = " + categoryRespository.count() );

    }
}
