package team.project.WhatToEatToday.domain;

import lombok.Getter;
import lombok.Setter;
import team.project.WhatToEatToday.domain.member.Manager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "eating_houses")
@Getter
@Setter
public class EatingHouse {

    @Id
    @GeneratedValue
    @Column(name = "eating_house_id")
    private Long id;

    private String Name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToMany(mappedBy = "eatingHouse")
    private List<Item> items = new ArrayList<>();



    @Column(length=2000)
    private String address;

    
    private String addressDetail;
    
    private String tel;
<<<<<<< Updated upstream


    public void setManager(Manager manager) {
        this.manager = manager;
        manager.getEatingHouses().add(this);
    }

    public void addItem(Item item) {
        this.items.add(item);
        item.setEatingHouse(this);
    }


=======
    
    public void setManager(Manager manager) {
    	this.manager = manager;
    	manager.getEatingHouses().add(this);
    }
    
    public void addItem(Item item) {
    	this.items.add(item);
    	item.setEatingHouse(this);
    }
    
    
>>>>>>> Stashed changes
}
