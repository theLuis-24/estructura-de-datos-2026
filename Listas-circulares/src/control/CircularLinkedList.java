package control;

import model.Contact;
import model.Node;

public class CircularLinkedList {
    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.tail= null;
        this.size = 0;
    }
    //insertar al final de la lista
    public  void add(Contact contact){
        Node newNode = new Node(contact);

        if(tail == null){
            //lista vacia
            tail=newNode;
            tail.setNext(tail);

        }else{
            //lista con mas de 1 element
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail=newNode;
        }
        size ++;
    }

    //Buscar por nombre
    public Contact findByName(String name){
        if(tail ==null) return null;

        Node current = tail.getNext();//primer nodo

        do{
            if (current.getValue().getFullName().equalsIgnoreCase(name)){
                return  current.getValue();
            }
            current = current.getNext();
        }while (current != tail.getNext());
        return null;
    }

    //eliminar
    public boolean deleteByName(String name){
        if(tail == null) return false;

        Node current = tail.getNext();
        Node previous = tail;

        do {
            if (current.getValue().getFullName().equalsIgnoreCase(name)){


                //caso 1: unico nombre
                if(current == tail && current.getNext() == tail){
                    tail=null;
                }


                //caso 2: eliminar primer nodo
                else if (current == tail.getNext()) {
                    tail.setNext(current.getNext());
                }

                //caso 3: eliminar ultimo nodo

                else if (current == tail) {
                    previous.setNext(current.getNext());
                    tail=previous;
                }

                //caso 4: Nodo intermedio
                else {
                    previous.setNext(current.getNext());
                }
                size --;
                return true;
            }


        }while (current != tail.getNext());
        return false;
    }

}
