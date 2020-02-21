package edu.psu.pizzashop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

@SpringBootTest
class PizzashopApplicationTests {

    @Test
    void testGetMenu()
    {
        PizzaShopController psc = new PizzaShopController();
        String menu = psc.getMenu();
        Assertions.assertEquals(menu, "pizza1: $10, soda: $2, wing: $5");
    }

    @Test
    public void testGetMenuByID()
    {
        try {
            PizzaShopController psc = new PizzaShopController();
            String menu = psc.getMenuById(2);
            Assertions.assertEquals(menu, "pizza2: $8, soda: $2, wing: $5");
        }catch (Exception e){
            System.out.println("Something wrong happens\n");
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateOrder()
    {
        PizzaShopController psc = new PizzaShopController();
        Order o = new Order();
        o.setPizza("p1");
        o.setWing(2);
        o.setSoda(3);
        o.setCreditNumber("xxxx");
        OrderDTO od = psc.createOrder(o);
        Assertions.assertNotNull(od);
    }
    // TestRestTemplate
    @Test
    public void testChangemenu()
    {
        String menuJson = "{\"menu\":\"xxxx\"}";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth("admin", "admin");
        HttpEntity<String> entity = new HttpEntity<>(menuJson, headers);

        TestRestTemplate t = new TestRestTemplate();
        ResponseEntity<String> r = t.exchange("http://localhost:1234/changemenu", HttpMethod.POST, entity, String.class);

        Assertions.assertEquals(HttpStatus.OK, r.getStatusCode());

    }
}
