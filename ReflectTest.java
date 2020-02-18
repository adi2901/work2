import java.lang.reflect.*;

class ReflectTest{
public static void main(String args[])throws Exception{
Class c=Class.forName("java.lang.String");
Constructor con[]=c.getDeclaredConstructors();
Method m[]=c.getDeclaredMethods();
Field f[]=c.getDeclaredFields();

for(int i=0;i<con.length;i++){
System.out.println(con[i]);
}
for(int j=0;j<m.length;j++){
System.out.println(m[j]);
}
for(int k=0;k<f.length;k++){
System.out.println( f[k]);
}
}
}