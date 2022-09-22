package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class A {
private void m1(int a) {	
}
private void m2(int a,int b) {
}
private void m4(ArrayList<Integer>i) {
}
private void m5(Map<String,String>i) {
}
public static void main(String[] args) {
	A a =new A();
	a.m1(10);
	a.m2(10, 20);
	ArrayList<Integer>i=new ArrayList<Integer>();
	i.add(10);
	i.add(20);
	i.add(30);
	a.m4(i);
	Map<String, String>m=new LinkedHashMap<String, String>();
	m.put("name", "rahul");
	m.put("email", "rahul@gmail.com");
	a.m5(m);

}

}
