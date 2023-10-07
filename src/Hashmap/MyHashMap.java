package Hashmap;

class MyHashMap {
      private  HashNode[] buckets;
      private  int numOfBuckets;
      private    int size;
      private static final  float load_factor = 0.75f;

  private class HashNode {
        int key;
        int value;
        HashNode next;
        HashNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public MyHashMap() {
       this(10);
    }
    public MyHashMap(int size) {
         initBuckets(size);
    }

    private void  initBuckets (int n){
        this.buckets = new HashNode[n];
        this.numOfBuckets = n;
        this.size = 0;
    }

    public void put(int key, int value) {


        int getHashCode = hashFunction(key);
        HashNode head = buckets[getHashCode];

        while(head != null){
            if(head.key == key){
                head.value = value;
                return;
            }
            head = head.next;
        }
        this.size++;
        head = buckets[getHashCode];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[getHashCode] = node;

        if(size > load_factor * this.numOfBuckets){
            rehash();
        }

    }

    private void rehash() {
      HashNode[] oldBuckets = this.buckets;
      initBuckets(this.numOfBuckets * 2);
     this.size = 0;
       for(var bucket: oldBuckets){

           while(bucket != null){
               put(bucket.key, bucket.value);
               bucket = bucket.next;
               System.out.println(bucket.key + " " + bucket.value);
           }


       }


    }

    public int get (int key) {

      int getHashCode = hashFunction(key);
      HashNode head = buckets[getHashCode];
      while (head != null){
          if(head.key == key){
              return head.value;
          }
          head = head.next;
      }

      return -1;
    }

    public void remove(int key) {

        int getHashCode = hashFunction(key);
        HashNode head = buckets[getHashCode];
        HashNode prev = null;
        while(head != null){

            if(head.key == key){
                break;
            }
            prev = head;
            head = head.next;
        }

        if(head == null){
            return;
        }
        this.size--;

        if(prev != null){
            prev.next = head.next;
        }else{
            buckets[getHashCode] = head.next;
        }
    }
    public void display () {
        HashNode[] buckets = this.buckets;
        initBuckets(this.numOfBuckets * 2);
        this.size = 0;
        for(var bucket: buckets){

            while(bucket != null){
                System.out.println(bucket.key + " " + bucket.value);
                bucket = bucket.next;

            }


        }


    }

    public int size (){
        return this.size;
    }

    private int hashFunction(int key){
        return key % numOfBuckets;
    }



}
