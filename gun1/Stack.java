package gun1;

import java.util.Arrays;

public class Stack {
    public static final int MAX_STACK_SIZE=10;

    String[] array= new String[MAX_STACK_SIZE];
    int index=0;

    public void push(String newElement){
        if (!isFull()){
            array[index]=newElement;
            index++;
        }
        else
            System.out.println("Sınırı Aştın");

    }
    public String pop(){
        if(isEmpty()){
            return "eleman yok çıkaramazsın";
        }
        index--;
        String popEdilen=array[index];
        array[index]=null;
        return popEdilen;
    }
    public void clear(){
        Arrays.fill(array, null);
        index=0;

    }

    public boolean isEmpty(){
        return index <= 0;
    }
    public boolean isFull(){
        return index==MAX_STACK_SIZE;
    }
    public int size(){
        return index;
    }
    public int getCapacity(){
        return MAX_STACK_SIZE-index;
    }
    public void showElements(){
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }

    public void doldur(String eleman){
        for (; index < MAX_STACK_SIZE; index++) {
                array[index]=eleman;
        }


    }


}
