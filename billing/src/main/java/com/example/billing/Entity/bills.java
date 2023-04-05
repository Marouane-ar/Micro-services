package com.example.billing.Entity;

import com.example.billing.Model.customer;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class bills {
	
	
    @Id
    @GeneratedValue
    private Long id;
    private Date billDate;
    private Long customerId;
    
    @OneToMany(mappedBy = "bills")
    private List<productItem> productItemList;

    @Transient
    private customer customer;
}
