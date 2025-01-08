package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;


    }

    @Override
    public void run(String... args) throws Exception {

        InhousePart laptopKit = new InhousePart();
        laptopKit.setName("Laptop Kit");
        laptopKit.setPrice(1100.0);
        laptopKit.setInv(25);
        laptopKit.setInv(101);
        partRepository.save(laptopKit);
        InhousePart tabletKit = new InhousePart();
        tabletKit.setName("Tablet Kit");
        tabletKit.setPrice(900.0);
        tabletKit.setInv(10);
        tabletKit.setInv(102);
        partRepository.save(tabletKit);
        InhousePart fullDesktopKit = new InhousePart();
        fullDesktopKit.setName("Full Desktop Kit");
        fullDesktopKit.setPrice(800.0);
        fullDesktopKit.setInv(10);
        fullDesktopKit.setInv(103);
        partRepository.save(fullDesktopKit);
        InhousePart miniDesktopKit = new InhousePart();
        miniDesktopKit.setName("Mini Desktop Kit");
        miniDesktopKit.setPrice(750.0);
        miniDesktopKit.setInv(10);
        miniDesktopKit.setInv(104);
        partRepository.save(miniDesktopKit);

        OutsourcedPart noVideoGFX_9060 = new OutsourcedPart();
        noVideoGFX_9060.setCompanyName("noVideo GFX");
        noVideoGFX_9060.setName("noVideoGFX 9060 8.4GB");
        noVideoGFX_9060.setInv(70);
        noVideoGFX_9060.setPrice(450.0);
        noVideoGFX_9060.setId(201);
        outsourcedPartRepository.save(noVideoGFX_9060);
        OutsourcedPart noVideoGFX_9070 = new OutsourcedPart();
        noVideoGFX_9070.setCompanyName("noVideo GFX");
        noVideoGFX_9070.setName("noVideoGFX 9070 12.8GB");
        noVideoGFX_9070.setInv(45);
        noVideoGFX_9070.setPrice(650.0);
        noVideoGFX_9070.setId(202);
        outsourcedPartRepository.save(noVideoGFX_9070);
        OutsourcedPart noVideoGFX_9080 = new OutsourcedPart();
        noVideoGFX_9080.setCompanyName("noVideo GFX");
        noVideoGFX_9080.setName("noVideoGFX 9080 17GB");
        noVideoGFX_9080.setInv(20);
        noVideoGFX_9080.setPrice(1450.0);
        noVideoGFX_9080.setId(203);
        outsourcedPartRepository.save(noVideoGFX_9080);
        OutsourcedPart noVideoGFX_9090 = new OutsourcedPart();
        noVideoGFX_9090.setCompanyName("noVideo GFX");
        noVideoGFX_9090.setName("noVideoGFX 9090 34GB");
        noVideoGFX_9090.setInv(32);
        noVideoGFX_9090.setPrice(2450.0);
        noVideoGFX_9090.setId(204);
        outsourcedPartRepository.save(noVideoGFX_9090);

        OutsourcedPart fmdRadonMLG_7700MS = new OutsourcedPart();
        fmdRadonMLG_7700MS.setCompanyName("FMD Radon");
        fmdRadonMLG_7700MS.setName("FMD Radon MLG 7700MS 18GB");
        fmdRadonMLG_7700MS.setInv(15);
        fmdRadonMLG_7700MS.setPrice(600.0);
        fmdRadonMLG_7700MS.setId(205);
        outsourcedPartRepository.save(fmdRadonMLG_7700MS);
        OutsourcedPart fmdRadonMLG_7800MS = new OutsourcedPart();
        fmdRadonMLG_7800MS.setCompanyName("FMD Radon");
        fmdRadonMLG_7800MS.setName("FMD Radon MLG 7800MS 20GB");
        fmdRadonMLG_7800MS.setInv(25);
        fmdRadonMLG_7800MS.setPrice(700.0);
        fmdRadonMLG_7800MS.setId(206);
        outsourcedPartRepository.save(fmdRadonMLG_7800MS);
        OutsourcedPart fmdRadonMLG_7900MS = new OutsourcedPart();
        fmdRadonMLG_7900MS.setCompanyName("FMD Radon");
        fmdRadonMLG_7900MS.setName("FMD Radon MLG 7900MS 28GB");
        fmdRadonMLG_7900MS.setInv(35);
        fmdRadonMLG_7900MS.setPrice(865.0);
        fmdRadonMLG_7900MS.setId(207);
        outsourcedPartRepository.save(fmdRadonMLG_7900MS);
        OutsourcedPart fmdRadonMLG_7900SMS = new OutsourcedPart();
        fmdRadonMLG_7900SMS.setCompanyName("FMD Radon");
        fmdRadonMLG_7900SMS.setName("FMD Radon MLG 7900SMS 64GB");
        fmdRadonMLG_7900SMS.setInv(45);
        fmdRadonMLG_7900SMS.setPrice(1345.0);
        fmdRadonMLG_7900SMS.setId(208);
        outsourcedPartRepository.save(fmdRadonMLG_7900SMS);

        OutsourcedPart fmdFallenK5_7500MT = new OutsourcedPart();
        fmdFallenK5_7500MT.setCompanyName("FMD Fallen");
        fmdFallenK5_7500MT.setName("FMD Fallen K5 7500MT");
        fmdFallenK5_7500MT.setInv(100);
        fmdFallenK5_7500MT.setPrice(230.0);
        fmdFallenK5_7500MT.setId(209);
        outsourcedPartRepository.save(fmdFallenK5_7500MT);
        OutsourcedPart fmdFallenK5_7700MT = new OutsourcedPart();
        fmdFallenK5_7700MT.setCompanyName("FMD Fallen");
        fmdFallenK5_7700MT.setName("FMD Fallen K5 7700MT");
        fmdFallenK5_7700MT.setInv(125);
        fmdFallenK5_7700MT.setPrice(290.0);
        fmdFallenK5_7700MT.setId(210);
        outsourcedPartRepository.save(fmdFallenK5_7700MT);
        OutsourcedPart fmdFallenK5_7800MT_X2D = new OutsourcedPart();
        fmdFallenK5_7800MT_X2D.setCompanyName("FMD Fallen");
        fmdFallenK5_7800MT_X2D.setName("FMD Fallen K5 7800MT X2D");
        fmdFallenK5_7800MT_X2D.setInv(150);
        fmdFallenK5_7800MT_X2D.setPrice(550.0);
        fmdFallenK5_7800MT_X2D.setId(211);
        outsourcedPartRepository.save(fmdFallenK5_7800MT_X2D);
        OutsourcedPart fmdFallenK5_7900MT = new OutsourcedPart();
        fmdFallenK5_7900MT.setCompanyName("FMD Fallen");
        fmdFallenK5_7900MT.setName("FMD Fallen K5 7900MT");
        fmdFallenK5_7900MT.setInv(15);
        fmdFallenK5_7900MT.setPrice(1000.0);
        fmdFallenK5_7900MT.setId(212);
        outsourcedPartRepository.save(fmdFallenK5_7900MT);
        OutsourcedPart fmdFallenK5_7950MT = new OutsourcedPart();
        fmdFallenK5_7950MT.setCompanyName("FMD Fallen");
        fmdFallenK5_7950MT.setName("FMD Fallen K5 7950MT");
        fmdFallenK5_7950MT.setInv(15);
        fmdFallenK5_7950MT.setPrice(1200.0);
        fmdFallenK5_7950MT.setId(213);
        outsourcedPartRepository.save(fmdFallenK5_7950MT);

        OutsourcedPart smartS5_25600 = new OutsourcedPart();
        smartS5_25600.setCompanyName("Smart");
        smartS5_25600.setName("Smart S5 25600");
        smartS5_25600.setInv(40);
        smartS5_25600.setPrice(300.0);
        smartS5_25600.setId(214);
        outsourcedPartRepository.save(smartS5_25600);
        OutsourcedPart smartS5_25600X = new OutsourcedPart();
        smartS5_25600X.setCompanyName("Smart");
        smartS5_25600X.setName("Smart S5 25600X");
        smartS5_25600X.setInv(70);
        smartS5_25600X.setPrice(350.0);
        smartS5_25600X.setId(215);
        outsourcedPartRepository.save(smartS5_25600X);
        OutsourcedPart smartS7_25700X = new OutsourcedPart();
        smartS7_25700X.setCompanyName("Smart");
        smartS7_25700X.setName("Smart S7 25700X");
        smartS7_25700X.setInv(45);
        smartS7_25700X.setPrice(480.0);
        smartS7_25700X.setId(216);
        outsourcedPartRepository.save(smartS7_25700X);
        OutsourcedPart smartS9_25900X = new OutsourcedPart();
        smartS9_25900X.setCompanyName("Smart");
        smartS9_25900X.setName("Smart S9 25900X");
        smartS9_25900X.setInv(10);
        smartS9_25900X.setPrice(900.0);
        smartS9_25900X.setId(217);
        outsourcedPartRepository.save(smartS9_25900X);

        Product valueLaptop = new Product(1001, "Value Gaming Laptop", 1800, 7);
        valueLaptop.setParts(Set.of(laptopKit, noVideoGFX_9060, fmdFallenK5_7500MT));
        productRepository.save(valueLaptop);

        Product performanceLaptop = new Product(1002, "Performance Gaming Laptop", 2100, 12);
        performanceLaptop.setParts(Set.of(laptopKit, noVideoGFX_9070, fmdFallenK5_7700MT));
        productRepository.save(performanceLaptop);

        Product ultimateLaptop = new Product(1003, "Ultimate Gaming Laptop", 3100, 15);
        ultimateLaptop.setParts(Set.of(laptopKit, noVideoGFX_9080, fmdFallenK5_7900MT));
        productRepository.save(ultimateLaptop);

        Product valueDesktop = new Product(1004, "Value Gaming Desktop", 1500, 7);
        valueDesktop.setParts(Set.of(miniDesktopKit, noVideoGFX_9060, fmdFallenK5_7500MT));
        productRepository.save(valueDesktop);

        Product midRangeDesktop = new Product(1005, "Mid-Range Gaming Desktop", 1700, 14);
        midRangeDesktop.setParts(Set.of(miniDesktopKit, fmdRadonMLG_7700MS, fmdFallenK5_7700MT));
        productRepository.save(midRangeDesktop);

        Product highEndDesktop = new Product(1006, "High-End Gaming Desktop", 2500, 15);
        highEndDesktop.setParts(Set.of(miniDesktopKit, fmdRadonMLG_7900MS, fmdFallenK5_7900MT));
        productRepository.save(highEndDesktop);

        Product epicGamingDesktop = new Product(1007, "Epic Gaming Desktop", 3500, 15);
        epicGamingDesktop.setParts(Set.of(fullDesktopKit, fmdRadonMLG_7900SMS, fmdFallenK5_7950MT));
        productRepository.save(epicGamingDesktop);

        Product ultraGamingDesktop = new Product(1008, "Ultra Gaming Desktop", 5500, 5);
        ultraGamingDesktop.setParts(Set.of(fullDesktopKit, noVideoGFX_9080, smartS7_25700X));
        productRepository.save(ultraGamingDesktop);

        Product ultimateGamingDesktop = new Product(1009, "Ultimate Gaming Desktop", 7500, 3);
        ultimateGamingDesktop.setParts(Set.of(fullDesktopKit, noVideoGFX_9090, smartS9_25900X));
        productRepository.save(ultimateGamingDesktop);
        /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
