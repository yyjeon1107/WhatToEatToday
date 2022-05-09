package team.project.WhatToEatToday.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.project.WhatToEatToday.domain.Menu;
import team.project.WhatToEatToday.domain.member.Manager;
import team.project.WhatToEatToday.repository.MenuRepository;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MenuService {

    private final EntityManager em;
    private final MenuRepository menuRepository;

    @Transactional
    public Long join(Menu menu) {
        menuRepository.save(menu);
        return menu.getId();
    }

    @Transactional
    public Long delete(Menu menu) {
        Long deletedMenuId = menu.getId();
        menuRepository.delete(menu);
        return deletedMenuId;
    }
    //회원 전체 조회
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    public Menu findOne(Long menuId) {
        return menuRepository.findOne(menuId);
    }

}