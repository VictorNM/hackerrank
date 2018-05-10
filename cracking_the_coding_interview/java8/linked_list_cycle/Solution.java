boolean hasCycle(Node head) {
    Node ptr = head;
    HashSet<Node> visitedSet = new HashSet<Node>();
    while (ptr != null) {
        if (visitedSet.contains(ptr)) {
            return true;
        }
        visitedSet.add(ptr);
        ptr = ptr.next;
    }
    
    return false;
}