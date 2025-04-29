package w10;

public class StackKonversi06 {
    int[]tumpukanBiner;
    int size, top;

    public StackKonversi06(){
        this.size=32;
        tumpukanBiner=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("stack penuh");
        }else{
            top++;
            tumpukanBiner[top]=data;
        }
    }
    public int pop (){
        if (isEmpty()){
            System.out.println("stack kosong");
            return -1;
        }else{
            int data=tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
