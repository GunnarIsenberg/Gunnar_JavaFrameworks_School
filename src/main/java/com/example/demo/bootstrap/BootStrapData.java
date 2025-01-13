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
        if(partRepository == null && productRepository == null && outsourcedPartRepository == null) {
            InhousePart laptopKit = new InhousePart();
            laptopKit.setName("Laptop Kit");
            laptopKit.setPrice(1100.0);
            laptopKit.setInv(25);
            laptopKit.setMaxInv(65);
            laptopKit.setMinInv(2);
            partRepository.save(laptopKit);

            InhousePart desktopKit = new InhousePart();
            desktopKit.setName("Full Desktop Kit");
            desktopKit.setPrice(800.0);
            desktopKit.setInv(10);
            desktopKit.setMaxInv(65);
            desktopKit.setMinInv(2);
            partRepository.save(desktopKit);

            OutsourcedPart noVideoGFX_9060 = new OutsourcedPart();
            noVideoGFX_9060.setCompanyName("noVideo GFX");
            noVideoGFX_9060.setName("noVideoGFX 9060 8.4GB");
            noVideoGFX_9060.setInv(70);
            noVideoGFX_9060.setPrice(450.0);
            noVideoGFX_9060.setId(201);
            noVideoGFX_9060.setMaxInv(200);
            noVideoGFX_9060.setMinInv(4);
            outsourcedPartRepository.save(noVideoGFX_9060);

            OutsourcedPart noVideoGFX_9070 = new OutsourcedPart();
            noVideoGFX_9070.setCompanyName("noVideo GFX");
            noVideoGFX_9070.setName("noVideoGFX 9070 12.8GB");
            noVideoGFX_9070.setInv(45);
            noVideoGFX_9070.setPrice(650.0);
            noVideoGFX_9070.setId(202);
            noVideoGFX_9070.setMaxInv(100);
            noVideoGFX_9070.setMinInv(2);
            outsourcedPartRepository.save(noVideoGFX_9070);

            OutsourcedPart noVideoGFX_9080 = new OutsourcedPart();
            noVideoGFX_9080.setCompanyName("noVideo GFX");
            noVideoGFX_9080.setName("noVideoGFX 9080 17GB");
            noVideoGFX_9080.setInv(20);
            noVideoGFX_9080.setPrice(1450.0);
            noVideoGFX_9080.setId(203);
            noVideoGFX_9080.setMaxInv(50);
            noVideoGFX_9080.setMinInv(2);
            outsourcedPartRepository.save(noVideoGFX_9080);

            OutsourcedPart fmdFallenK5_7500MT = new OutsourcedPart();
            fmdFallenK5_7500MT.setCompanyName("FMD Fallen");
            fmdFallenK5_7500MT.setName("FMD Fallen K5 7500MT");
            fmdFallenK5_7500MT.setInv(96);
            fmdFallenK5_7500MT.setPrice(230.0);
            fmdFallenK5_7500MT.setId(209);
            fmdFallenK5_7500MT.setMaxInv(100);
            fmdFallenK5_7500MT.setMinInv(5);
            outsourcedPartRepository.save(fmdFallenK5_7500MT);

            OutsourcedPart fmdFallenK5_7800MT_X2D = new OutsourcedPart();
            fmdFallenK5_7800MT_X2D.setCompanyName("FMD Fallen");
            fmdFallenK5_7800MT_X2D.setName("FMD Fallen K5 7800MT X2D");
            fmdFallenK5_7800MT_X2D.setInv(45);
            fmdFallenK5_7800MT_X2D.setPrice(550.0);
            fmdFallenK5_7800MT_X2D.setId(211);
            fmdFallenK5_7800MT_X2D.setMaxInv(50);
            fmdFallenK5_7800MT_X2D.setMinInv(3);
            outsourcedPartRepository.save(fmdFallenK5_7800MT_X2D);

            OutsourcedPart fmdFallenK5_7900MT = new OutsourcedPart();
            fmdFallenK5_7900MT.setCompanyName("FMD Fallen");
            fmdFallenK5_7900MT.setName("FMD Fallen K5 7900MT");
            fmdFallenK5_7900MT.setInv(15);
            fmdFallenK5_7900MT.setPrice(1000.0);
            fmdFallenK5_7900MT.setId(212);
            fmdFallenK5_7900MT.setMaxInv(30);
            fmdFallenK5_7900MT.setMinInv(2);
            outsourcedPartRepository.save(fmdFallenK5_7900MT);

            Product valueLaptop = new Product();
            valueLaptop.setName("Performance Laptop");
            valueLaptop.setPrice(1900.0);
            valueLaptop.setInv(12);
            productRepository.save(valueLaptop);

            Product performanceLaptop = new Product();
            performanceLaptop.setName("Performance Laptop");
            performanceLaptop.setPrice(2700.0);
            performanceLaptop.setInv(10);
            productRepository.save(performanceLaptop);

            Product ultimateLaptop = new Product();
            ultimateLaptop.setName("Ultimate Laptop");
            ultimateLaptop.setPrice(3800.0);
            ultimateLaptop.setInv(5);
            productRepository.save(ultimateLaptop);

            Product valueDesktop = new Product();
            valueDesktop.setName("Value Desktop");
            valueDesktop.setPrice(1700.0);
            valueDesktop.setInv(12);
            productRepository.save(valueDesktop);

            Product performanceDesktop = new Product();
            performanceDesktop.setName("Performance Desktop");
            performanceDesktop.setPrice(2500.0);
            performanceDesktop.setInv(10);
            productRepository.save(performanceDesktop);

            Product ultimateDesktop = new Product();
            ultimateDesktop.setName("Ultimate Desktop");
            ultimateDesktop.setPrice(3700.0);
            ultimateDesktop.setInv(5);
            productRepository.save(ultimateDesktop);
        }


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
