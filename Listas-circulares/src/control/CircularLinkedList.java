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

        if(isEmpty()){
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

    // 🔥 eliminar (versión refactorizada)
    public boolean deleteByName(String name){
        if(isEmpty()) return false;

        Node current = tail.getNext();
        Node previous = tail;

        do {
            if(current.getValue().getFullName().equalsIgnoreCase(name)){

                // único nodo
                if(current == tail && current.getNext() == tail){
                    tail = null;
                } else {
                    previous.setNext(current.getNext());

                    // si eliminas el tail
                    if(current == tail){
                        tail = previous;
                    }
                }

                size--;
                return true;
            }

            previous = current;
            current = current.getNext();

        } while (current != tail.getNext());

        return false;
    }

    //mostra relemento de logica

    public void listAll(){
        if(tail==null){
            System.out.println("lista vacia");
            return;
        }

        Node current = tail.getNext();

        do{
            System.out.println(current.getValue());
            current = current.getNext();
        }while (current != tail.getNext());
    }

    //Obtener el tamaño de la lista
    public int getSize(){
        return size;

    }

    //verificar si la lista esta vacia

    public boolean isEmpty(){
        return  tail == null;
    }

}
