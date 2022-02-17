package smittetryk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import smittetryk.model.County;
import smittetryk.repository.CountyRepository;

import java.util.List;

@SpringBootTest
class SmittetrykApplicationTests {

  @Autowired
  CountyRepository countyRepository;

    /*
    @Test
    void contextLoads() {
    }
     */

  @Test
  void testFunc(){
    List<County> counties = countyRepository.findAll();
    Assertions.assertEquals(4, counties.size());
  }

}
