package dao;


import model.PowerBank;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface PowerBankDao {

    String getFirstPowerBank() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;


}
