package com.example.billing;

import com.example.billing.Entity.bills;
import com.example.billing.Entity.productItem;
import com.example.billing.Model.customer;
import com.example.billing.Model.product;
import com.example.billing.Service.billsService;
import com.example.billing.Service.customerRestClient;
import com.example.billing.Service.productItemService;
import com.example.billing.Service.productRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class billingApplication {

	public static void main(String[] args) {
		SpringApplication.run(billingApplication.class, args);
	}
	@Bean
	CommandLineRunner start(billsService billsService,
							productItemService productItemService,
							productRestClient productRestClient,
							customerRestClient customerRestClient){
	return args -> {
			Collection<product> productList = productRestClient.allproduct();
			Long customerId = 1L;
			customer customer = customerRestClient.findcustomerById(customerId);

			if (customer == null) throw new RuntimeException("customer not found...");

			bills bills = new bills();
			bills.setbillDate(new Date());
			bills.setcustomerId(customerId);
			bills saved_bill = billsService.save(bills);
			
			productList.forEach(product -> {
				productItem productItem = new productItem();
				productItem.setbills(saved_bill);
				productItem.setQuantite(1+new Random().nextInt(10));
				productItem.setproductId(product.getId_inventory());
				productItem.setPrice(product.getPrice_inventory());
				productItem.setdiscount(Math.random());
				productItemService.save(productItem);
			});
		};
	}
}
