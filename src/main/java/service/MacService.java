package service;

import model.Mac;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface MacService {

    String getFirstMac() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;

}
