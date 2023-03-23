package app;

public class toDoList {
	
	toDo[] lista;
	
	public toDoList(int nPosti) {
		lista= new toDo[nPosti];
	}
	
	void addtoDo(String desc, int pos) {
		toDo temp= new toDo(desc);
		//temp.descrizione= desc;
		lista[pos]= temp;
	}
	toDo gettoDo(int pos) {
		return lista[pos];
	}
}
