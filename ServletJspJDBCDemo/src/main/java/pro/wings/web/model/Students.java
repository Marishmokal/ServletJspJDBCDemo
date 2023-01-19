package pro.wings.web.model;

public class Students {
private int a_id;
private String a_name;
private String tech;
public int getA_id() {
	return a_id;
}
public void setA_id(int a_id) {
	this.a_id = a_id;
}
public String getA_name() {
	return a_name;
}
public void setA_name(String a_name) {
	this.a_name = a_name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
@Override
public String toString() {
	return "Students [a_id=" + a_id + ", a_name=" + a_name + ", tech=" + tech + "]";
}




}
