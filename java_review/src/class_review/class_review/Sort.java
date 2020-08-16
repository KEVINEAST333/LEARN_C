package class_review.class_review;

import java.util.Arrays;

//升序
public class Sort {
    //1.插入排序
    //时间复杂度 N^2     空间复杂度 O(1)      稳定排序（相等数据排序前跟排序后，相对位置是不变的）
    public static void insertSort(int[] array) {
        for (int bound = 1;bound < array.length;bound++) {
            //已排序区间为[0，bound)
            //待排序区间为[bound,length-1]
            int cur = bound - 1;
            int tmp = array[bound];
            //如果tmp < arr[cur] 把arr[cur] 向后移动
            for(;cur >= 0;cur-- ) {
                if(tmp < array[cur]) {
                    array[cur + 1] = array[cur];
                } else {
                    //因为前面都是已经排序的一旦出现小于证明tmp的位置就应在此时的cur+1上。
                    //先break跳出循环
                    break;
                }
            }
            //把tmp放在cur后面
            array[cur + 1] = tmp;
        }

    }
    //2.希尔排序 -》优化的插入排序分成若干组进行插排。
    //时间复杂度N^1.3   空间复杂度O(1)   不稳定排序。
    public static void shellSort(int[] array) {
        int gap = array.length;
        while(gap > 1 ) {
            gap = gap / 2;
            insertSortgap(array,gap);
        }
        insertSortgap(array,1);
    }
    public static void insertSortgap(int[] array, int gap) {
        for(int bound = gap;bound < array.length;bound++) {
            int cur = bound - gap;
            int tmp = array[bound];
            for (;cur >= 0;cur -= gap) {
                if(tmp < array[cur]) {
                    array[cur + gap] = array[cur];
                } else {
                    break;
                }
            }
            array[cur + gap] = tmp;
        }
    }
    //3。冒泡排序
    //时间复杂度N^2    空间复杂度O(1)   稳定排序
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length;i++) {
            //最后i个随着排序轮次已经有序
            for(int j = 0;j < array.length -1 - i;j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j,j+1);
                }
            }
        }
    }
    //4.选择排序
    //时间复杂度N^2      空间复杂度O(1)   不稳定排序
    public static void selectSort(int[] array) {
        //已排序区间为[0.bound) 待排序区间为[bound,length)
        for (int bound = 0; bound < array.length;bound++) {
            for (int cur = bound; cur < array.length;cur++) {
                if(array[bound] > array[cur]) {
                    swap(array,bound,cur);
                }
            }
        }
    }
    //5.快速排序
    //时间复杂度N*log(N)    空间复杂度(log(N) ~ O(N))   不稳定排序
    public static void quickSort(int[] array) {
        quickSorthepler(array,0,array.length - 1);
    }

    private static void quickSorthepler(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int index = partition(array,left,right);
        quickSorthepler(array,left,index - 1);
        quickSorthepler(array,index + 1,right);
    }
    private static int partition(int[] array, int left, int right) {
        //取基准
        int baseValue = array[right];
        int i = left;
        int j = right;
        while(i < j) {
            while(i < j && array[i] <= baseValue) {
                i++;
            }
            while(i < j && array[j] >= baseValue) {
                j--;
            }
            if(i < j) {
                swap(array,i,j);
            }
        }
        //交换基准值
        swap(array,i,right);
       return i;
    }
    //堆排序
    //时间复杂度   NlogN    空间复杂度 O(1)    不稳定排序
    public static void heapSort(int[] array) {
        //创建一个大堆
        creatHeap(array);
        //将队首和队尾交换 重新向下调整 去掉队尾
        int size = array.length ;
        for(int i = 0;i < array.length;i++) {
            swap(array,0,size - 1);
            size--;
            shiftDown(array,size,0);

        }
    }

    private static void creatHeap(int[] array) {
        //向下调整从最后子树的父节点开始
        for(int i = (array.length -1 -1)/2;i >= 0;i--) {
            shiftDown(array,array.length,i);
        }

    }

    private static void shiftDown(int[] array, int length, int i) {
        int parent = i;
        int child = 2 * parent + 1;
        while (child < length) {
            if (child + 1< length && array[child + 1] > array[child]) {
                child = child + 1;
            }
            if (child < length && array[parent] < array[child]) {
                swap(array, parent, child);
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    private static void swap(int[] array, int j, int i) {
        //交换三连
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
    public static void main(String[] args) {
        int [] array = {9,5,7,3,1,17};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
