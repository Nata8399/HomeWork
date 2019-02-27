package com.alevel.part2.department;

import com.alevel.part2.menu.Dish;
import com.alevel.part2.menu.MenuPoint;
import com.alevel.part2.cooker.Cooker;

public abstract class Department {

    protected Cooker[] cookers;

    protected Cooker chief;

    public abstract Dish cook(MenuPoint menuPoint);

    protected String getDishComponent(String component) {
        for (Cooker cooker : cookers) {
            if (haveCurrentResponsibility(cooker.getResponsibility(), component))
                return cooker.addDishComponent(component);
        }
        return null;
    }

    private boolean haveCurrentResponsibility(String[] responsibilities, String component) {
        for (String responsibility : responsibilities) {
            if (responsibility.equals(component)) return true;
        }
        return false;
    }
}

