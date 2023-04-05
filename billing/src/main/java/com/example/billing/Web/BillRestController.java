package com.example.billing.Web;

import com.example.billing.Entity.bills;
import com.example.billing.Service.billsService;
import com.example.billing.Service.customerRestClient;
import com.example.billing.Service.productItemService;
import com.example.billing.Service.productRestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillRestController {

    private billsService billsService;
    private productItemService productItemService;
    private customerRestClient customerRestClient;
    private productRestClient productRestClient;

    public BillRestController(billsService billsService, productItemService productItemService, customerRestClient customerRestClient, productRestClient productRestClient) {
        this.billsService = billsService;
        this.productItemService = productItemService;
        this.customerRestClient = customerRestClient;
        this.productRestClient = productRestClient;
    }

    @GetMapping("/find/{id}")
    public bills findById(@PathVariable Long id){
        bills bills = billsService.findById(id);
        bills.setcustomer(customerRestClient.findcustomerById(bills.getcustomerId()));
        bills.getproductItemList().forEach(pi ->{
            pi.setproduct(productRestClient.findproductById(pi.getproductId()));
        });

        return bills;
    }
}
