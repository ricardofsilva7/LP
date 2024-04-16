//EX.09

public class main {
    static int max=10;
    static int [] stack = new int [max];

    static int top=-1;
    public static void main (String[] args){
        push (10);
        push (5);
        System.out.println(pop());
    }

    static void push (int element) {
        if (top == stack.length - 1){ // verifica se a plha esta cheia
            System.out.println("Pilha cheia");
        }else{
            top++;
            stack[top]=element;
        }
        }
    static int pop (){
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return -1;
        }else{
            int MyReturn = stack[top];
            top--;
            return MyReturn;
        }
    }
    static boolean isEmpty (){  //função 'is empty' - definição
        return (top==1);
    }

}


//EX. 10
public class Main {
    static int max=10;
    static int []queue =new int[max];
    static int start=0;
    static boolean cicle = false;
    static int end=0;
    public static void main(String[] args) {
        for(int i=1;i<16;i++)
            push(i);
        for(int i=1;i<16;i++)
            System.out.println(pop());
    }
    static void push(int element){
        if(isFull()) {
            System.out.println("Fila cheia");
        }else{
            queue[end++] = element;
            if(end==queue.length) {
                end = 0;
                cicle=!cicle;
            }
        }
    }
    static int pop(){
        if(isEmpty()){
            System.out.println("Fila vazia");
            return -1;
        }else{
            int myReturn = queue[start++];
            if(start== queue.length){
                start=0;
                cicle=!cicle;
            }
            return myReturn;
        }

    }
    static boolean isEmpty(){
        return end==start&&!cicle;
    }
    static boolean isFull(){
        return !isEmpty();
    }

}