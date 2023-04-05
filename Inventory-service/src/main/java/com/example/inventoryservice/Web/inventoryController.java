package com.example.inventoryservice.Web;

import com.example.inventoryservice.Entity.inventory;
import com.example.inventoryservice.Service.inventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class inventoryController {

    private inventoryService inventoryService;

    public inventoryController(inventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/save")
    @ResponseBody
    public inventory save(@RequestBody inventory inventory){
        return inventoryService.save(inventory);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public inventory findById(@PathVariable Long id){
        return inventoryService.findById(id);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<inventory> findAll(){
        return inventoryService.findAll();
    }

}
