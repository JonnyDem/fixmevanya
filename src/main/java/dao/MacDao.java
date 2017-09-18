package dao;


import model.Mac;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface MacDao {

    String getFirstMac() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
