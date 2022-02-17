package smittetryk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import smittetryk.model.Region;
import smittetryk.repository.RegionRepository;

@Component
public class SaveRegion implements CommandLineRunner {

  @Autowired
  RegionRepository regionRepository;

  @Override
  public void run(String... args) throws Exception {

    Region region = new Region();
    region.setName("Region Midtjylland");
    region.setRegionCode("1082");
    region.setHref("https://api.dataforsyningen.dk/regioner/1082");
    regionRepository.save(region);

    region.setName("Region Syddanmark");
    region.setRegionCode("1083");
    region.setHref("https://api.dataforsyningen.dk/regioner/1083");
    regionRepository.save(region);

    region.setName("Region Sjælland");
    region.setRegionCode("1085");
    region.setHref("https://api.dataforsyningen.dk/regioner/1085");
    regionRepository.save(region);

    region.setName("Region Hovedstaden");
    region.setRegionCode("1084");
    region.setHref("https://api.dataforsyningen.dk/regioner/1084");
    regionRepository.save(region);

  }
}
