package service;

import model.Iphone;
import model.Mac;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface IphoneService {

    String getFirstIphone() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
