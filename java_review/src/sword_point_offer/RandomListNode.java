package sword_point_offer;
/*输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
        另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，
        并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，
        否则判题程序会直接返回空）*/
public class RandomListNode {
     class RandomListNode2 {
        int label;
        RandomListNode2 next = null;
        RandomListNode2 random = null;

        RandomListNode2(int label) {
            this.label = label;
        }
    }

    public RandomListNode2 Clone(RandomListNode2 pHead)
    {
        if(pHead == null) {
            return null;
        }
        //复制节点 A->A' ->B -> B' -> C -> C’
        RandomListNode2 pcur = pHead;
        while(pcur != null) {
            RandomListNode2 node = new RandomListNode(pcur.label);
            node.next = pcur.next;
            pcur.next = node;
            pcur = node.next;
        }
        //更改复制节点的random
        pcur = pHead;
        while(pcur != null) {
            if(pcur.random != null) {
                pcur.next.random = pcur.random.next;
            }

            pcur = pcur.next.next;
        }
        //拆开链表
        pcur = pHead;
        RandomListNode2 newHead = pcur.next;
        RandomListNode2 cur = newHead;
        while(pcur != null) {
            pcur.next = pcur.next.next;
            if(cur.next != null ) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pcur = pcur.next;
        }
        return newHead;
    }
}
