package sante;

import users.UserModel;

public class SanteModel {
private float indiceG;
private float poids,taille;
private UserModel user;
public float getIndiceG() {
	return indiceG;
}
public void setIndiceG(float indiceG) {
	this.indiceG = indiceG;
}
public float getPoids() {
	return poids;
}
public void setPoids(float poids) {
	this.poids = poids;
}
public float getTaille() {
	return taille;
}
public void setTaille(float taille) {
	this.taille = taille;
}
public UserModel getUser() {
	return user;
}
public void setUser(UserModel user) {
	this.user = user;
}





}
