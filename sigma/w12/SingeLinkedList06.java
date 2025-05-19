package w12;

public class SingeLinkedList06 {
    Node06 head,tail;

    boolean isEmpty(){
        return (head==null);
    }
    public void print(){
        if(!isEmpty()){
            Node06 tmp=head;
            System.out.println("isi linked list:\t");
            while(tmp != null){
                tmp.data.tampilInformasi();
                tmp=tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("linked list kosong");
        }
    }
    public void addFirst(Mahasiswa06 input){
        Node06 ndInput=new Node06(input,null);
        if(isEmpty()){
            head=ndInput;
            tail=ndInput;
        }else{
            ndInput.next=head;
            head=ndInput;
        }
    }
    public void addLast(Mahasiswa06 input){
        Node06 ndInput=new Node06(input,null);
        if(isEmpty()){
            head=ndInput;
            tail=ndInput;
        }else{
            tail.next=ndInput;
            tail=ndInput;
        }
    }
    public void insertAfter(String key,Mahasiswa06 input){
        Node06 ndInput=new Node06(input,null);
        Node06 temp=head;
        do { 
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next=temp.next;
                temp.next=ndInput;
                if(ndInput.next==null){
                    tail=ndInput;
                }
                break;
            }
            temp=temp.next;
        } while (temp != null);
    }
    public void insertAt(int index,Mahasiswa06 input){
        if(index<0){
            System.out.println("indeks salah");
        }else if(index==0){
            addFirst(input);
        }else{
            Node06 temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=new Node06(input,temp.next);
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }
    public void getData(int index){
        Node06 tmp=head;
        for(int i=0;i<index;i++){
            tmp=tmp.next;
        }
        tmp.data.tampilInformasi();
    }
    public int indexOf(String key){
        Node06 tmp=head;
        int index=0;
        while(tmp != null && !tmp.data.nama.equalsIgnoreCase(key)){
            tmp=tmp.next;
            index++;
        }
        if(tmp==null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("linked list masih kosong, tidak dapat dihapus");
        }else if(head==tail){
            head=tail=null;
        }else{
            head=head.next;
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("linked ist masih kosong, tidak dapat dihapus");
        }else if(head==tail){
            head=tail=null;
        }else{
            Node06 temp=head;
            while(temp.next != tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    public void remove(String key){
        if(isEmpty()){
            System.out.println("linked ist masih kosong, tidak dapat dihapus");
        }else{
            Node06 temp=head;
            while(temp != null){
                if((temp.data.nama.equalsIgnoreCase(key))&&(temp==head)){
                    this.removeFirst();
                    break;
                }else if(temp.data.nama.equalsIgnoreCase(key)){
                    temp.next=temp.next.next;
                    if(temp.next==null){
                        tail=temp;
                    }
                    break;
                }
                temp=temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index==0){
            removeFirst();
        }else{
            Node06 temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next==null){
                tail=temp;
            }
        }
    }
}
