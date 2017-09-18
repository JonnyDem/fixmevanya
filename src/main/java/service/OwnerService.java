package service;

import model.Mac;
import model.Owner;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface OwnerService {

    String getFirstOwner() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
