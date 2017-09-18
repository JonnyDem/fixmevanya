package dao;

import model.Iphone;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface IphoneDao {

    String getFirstIphone() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

}
