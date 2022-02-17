package smittetryk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import smittetryk.model.County;
import smittetryk.model.Region;
import smittetryk.repository.CountyRepository;
import smittetryk.repository.RegionRepository;

import javax.persistence.JoinColumns;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  CountyRepository countyRepository;

  @Override
  public void run(String... args) throws Exception {
    County county = new County();
    county.setName("Roskilde");
    county.setCountyCode("0265");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0265");
    county.setFkRegionCode("1085");
    countyRepository.save(county);

    county.setName("København");
    county.setCountyCode("0101");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0101");
    county.setFkRegionCode("1084");
    countyRepository.save(county);

    county.setName("Frederiksberg");
    county.setCountyCode("0147");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0147");
    county.setFkRegionCode("1084");
    countyRepository.save(county);

    county.setName("Silkeborg");
    county.setCountyCode("0740");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0740");
    county.setFkRegionCode("1082");
    countyRepository.save(county);

    /*
    county.setName("Billund");
    county.setCountyCode("0530");
    county.setHref("https://api.dataforsyningen.dk/kommuner/0530");
    county.setFkRegionCode("1083");
    countyRepository.save(county);

     */



  }
}
