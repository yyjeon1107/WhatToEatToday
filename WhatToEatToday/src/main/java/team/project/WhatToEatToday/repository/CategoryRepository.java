package team.project.WhatToEatToday.repository;

import ch.qos.logback.core.net.SyslogOutputStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import team.project.WhatToEatToday.domain.Category;
import team.project.WhatToEatToday.domain.Menu;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    public final EntityManager em;

    public void save(Category category) {
        if(category.getId() == null) {
            em.persist(category);
        } else {
            em.merge(category);
        }
    }

    public Category findOne(Long id) {
        return em.find(Category.class, id);
    }

    public List<Category> getCategory() {
        Category category = new Category();
        List<Category> CAT = category.getChild();
        return CAT;
    }

}