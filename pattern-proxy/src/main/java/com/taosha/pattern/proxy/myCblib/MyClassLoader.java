package com.taosha.pattern.proxy.myCblib;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName MyClassLoader
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/13 16:09
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader{

    private File classPathFile;

    public MyClassLoader(){
        String classPath = MyClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File className = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
        if(className.exists()){
            FileInputStream in = null;
            ByteArrayOutputStream out = null;
            try{
                in = new FileInputStream(className);
                out = new ByteArrayOutputStream();
                byte [] buff = new byte[1024];
                int len;
                while ((len = in.read(buff)) != -1){
                    out.write(buff,0,len);
                }
                return  defineClass(String.valueOf(className),out.toByteArray(),0,out.size());
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if (null != in) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
        return null;
    }
}
