package controller;

import model.Iphone;
import model.Mac;
import model.Owner;
import model.PowerBank;
import service.*;
import service.factory.ServiceFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class Controller {

    public static void main(String[] args) {

        CrudService powerBankCrudService=ServiceFactory.getPowerBankCrudService();
        PowerBankService powerBankService=ServiceFactory.getPowerBankService();

        PowerBank powerBank = PowerBank.builder().color("White").price(234).weight(500).build();
        PowerBank powerBank2 = PowerBank.builder().color("White").price(234).weight(500).build();
        PowerBank powerBank3 = PowerBank.builder().color("White").price(234).weight(500).build();
        PowerBank powerBank4 = PowerBank.builder().color("White").price(234).weight(500).build();

       powerBankCrudService.save(powerBank);
       powerBankCrudService.save(powerBank2);
       powerBankCrudService.save(powerBank3);

       powerBankCrudService.getAll();

        try {
            powerBankService.getFirstPowerBank();
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException e) {
            e.printStackTrace();
        }
        powerBankCrudService.delete(powerBank);
        powerBankCrudService.getAll();
        powerBankCrudService.save(powerBank4);

        System.out.println("power bank id: " + powerBank.getId());
        System.out.println("power bank 2 id: " + powerBank2.getId());
        System.out.println("power bank 3 id: " + powerBank3.getId());
        System.out.println("power bank 4 id: " + powerBank4.getId());

        System.out.println("Weight before update: " + powerBank2.getWeight());
        powerBankCrudService.update(powerBank2);
        System.out.println("Weight after update: " + powerBank2.getWeight());
    }
}
