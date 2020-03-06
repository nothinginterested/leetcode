
//反转链表
var reverseList = function(head) {
    let currentNode=null;
    let headNode=head;
    while(head&&head.next!=null){
        currentNode=head.next;
        head.next=currentNode.next;
        currentNode.next=headNode;
        headNode=currentNode;

    }
    return headNode;
};

//递归解法
var reverseList = function(head) {
    if(head==null||head.next==null){//如果将if判断语句调换就会报错
        return head;
    }
   var listnode=reverseList(head.next);
      head.next.next=head;
    head.next=null;
    return listnode;
};


