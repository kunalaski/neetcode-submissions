class MyHashSet {

    Node[] bucket = new Node[DEFAULT_INITIAL_CAPACITY];
    static final int DEFAULT_INITIAL_CAPACITY = 10 << 4; // aka 16
    private static final Object PRESENT = new Object();

    static class Node {
        final int hash;
        final int key;
        Object value;
        Node next;
        Node prev;

        Node(int hash, int key, Object value, Node next, Node prev) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyHashSet() {

    }

    public void add(int key) {

        int hash = hash(key);
        int i = hash & DEFAULT_INITIAL_CAPACITY-1;
        Node node = bucket[i];
        if(node == null) {
            node = new Node(hash, key, PRESENT, null, null);
            bucket[i] = node;
        } else {
            while (node.next != null) {
                if(node.key == key) return;
                node = node.next;
            }
            node.next = node.key == key? null: new Node(hash, key, PRESENT, null, node);
        }
    }

    public void remove(int key) {
        int hash = hash(key);
        int i = hash & DEFAULT_INITIAL_CAPACITY-1;
        Node node = bucket[i];

        while (node != null) {
            if(node.key == key) {
                if(node.prev == null) {
                    bucket[i] = node.next;
                } else {
                    node.prev.next = node.next;
                }
                node.next = null;
                node.prev = null;
                break;
            }
            node = node.next;
        }
    }

    public boolean contains(int key) {
        int hash = hash(key);
        int i = hash & DEFAULT_INITIAL_CAPACITY-1;
        Node node = bucket[i];
        while (node != null) {
            if(node.key == key) return true;
            node = node.next;
        }
        return false;
    }

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */