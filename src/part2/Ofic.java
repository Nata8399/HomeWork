package com.alevel.part2;

import com.alevel.part2.menu.MenuComponents;
import com.alevel.part2.menu.MenuPoint;

import java.util.Arrays;
import java.util.Scanner;

public class Ofic {
    private final String name;


    public Ofic(String name) {
        this.name = name;
        MenuPoint.values();
    }


    public String getName() {
        return name;
    }

    public void createOrder() {
        System.out.println(Arrays.toString(MenuPoint.getMenuList()));
        MenuPoint[] menuPoints = buildOrder().getOrderdata();
        //only test
        for (MenuPoint menuPoint : menuPoints) {
            if (menuPoint == null) break;
            System.out.println(MenuComponents.getDepartment(menuPoint).cook(menuPoint));
        }

    }


    private Order buildOrder() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        boolean isFinish = false;
        while (!isFinish) {
            int menuPoint = scanner.nextInt();
            if (menuPoint == 0) {
                isFinish = true;
            } else if (menuPoint > MenuPoint.getMenuSize()) {
                System.out.println("Хорошая попытка....");
            } else {
                order.add(MenuPoint.getPointByMenuNumber(menuPoint));
            }
        }
        return order;
    }

}
