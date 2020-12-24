package reelFour;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description:
 * GET-version:
 * Date:2020-12-24  10:24
 * Author: wxr
 */

public class UserInfoBean {
    private String username;
    private String age;

    public String getUsername() {
        System.out.println("getUsername method be called");
        return username;
    }

    public void setUsername(String username) {
        System.out.println("setUsername method be called");
        this.username = username;
    }

    public String getAge() {
        System.out.println("getAge method be called");
        return age;
    }

    public void setAge(String age) {
        System.out.println("setAge method be called");
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("reelFour.UserInfoBean");
            Object obj = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            String name="chenhua";
            for (Field f : fields) {
                PropertyDescriptor pd;
                pd = new PropertyDescriptor(f.getName(), clazz);
                Method wM = pd.getWriteMethod();
                wM.invoke(obj, name);
                System.out.println(wM.getName()+"========="+name);
            }
            System.out.println("_______________________________________________________");
            for (Field f : fields) {
                PropertyDescriptor pd;
                pd = new PropertyDescriptor(f.getName(), clazz);
                Method rM = pd.getReadMethod();
                String num = (String) rM.invoke(obj);
                System.out.println(rM.getName() + "==" + num);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
