package service;

import model.Mac;
import model.Owner;
import model.PowerBank;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface PowerBankService {

    String getFirstPowerBank() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
