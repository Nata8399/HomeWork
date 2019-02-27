package com.alevel.part2.department.impl;

import com.alevel.part2.menu.Dish;
import com.alevel.part2.menu.MenuComponents;
import com.alevel.part2.menu.MenuPoint;
import com.alevel.part2.cooker.Cooker;
import com.alevel.part2.department.Department;

public class ColdDepartment extends Department {

    public ColdDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Vasiliy", new String[]{"паста", "салат", "сало", "селедка", "заправка"}),
                new Cooker("Inna", new String[]{"соус", "свинец", "огурцы", "водка"}),
        };
    }

    @Override
    public Dish cook(MenuPoint menuPoint) {
        Dish dish = new Dish();
        for (String component : MenuComponents.getComponents(menuPoint)) {
            dish.add(getDishComponent(component));
        }
        return dish;
    }


}
