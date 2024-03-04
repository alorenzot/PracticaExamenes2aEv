package org.example.ord2022_23;

public class MyModelTAD<T> {
    private int size;
    private Node<T> head;

    public MyModelTAD(){
        size=0;
        head=null;
    }

    public void addHead(T element){
        Node<T> aux = new Node<>(element);
        aux.setNext(head);
        head=aux;
        size++;
    }

    public void addTail(T element){
        if (head == null){
            addHead(element);
        }
        else{

            Node<T> aux = head;
            while (aux.getNext()!= null)
                aux= aux.getNext();

            aux.setNext(new Node<>(element));
            size++;

        }
    }

    public T remove(int index){

        if (index >= size || index < 0) return null;

        if (index==0){
            T info = head.info;
            head=head.getNext();
            size--;
            return info;
        }

        Node<T> aux = head;
        while (--index > 0) aux=aux.getNext();

        T info = aux.getNext().info;

        aux.setNext(aux.getNext().getNext());
        size--;
        return info;

    }

    public T get(int index){

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index fuera de rango: " + index);

        Node<T> aux=head;

        while (--index > 0){
            aux=aux.getNext();
        }

        return aux.info;

    }

    public int getSize(){return size;}

    @Override
    public String toString(){
        return "Size: " + size + "\n" + ((head==null)? "[]" : "[" + head);
    }



    public class Node<T>{
        private T info;
        private Node<T> next;

        public Node(T info){
            this.info=info;
            this.next=null;
        }


        public void setNext(Node<T> node){
            this.next=node;
        }

        public Node<T> getNext(){ return next;}
        public T getInfo() { return info;}

        @Override
        public String toString(){
            return info + ((next!=null) ? " " + next : "]");
        }

    }

}
