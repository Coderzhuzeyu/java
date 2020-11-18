public class Sort {
    public static void main(String[] args) {
        //通过冒泡排序给当前的数字进行排序（升序）
        int arr1[] = {30,20,15,12,18,100};
        //进行多少次冒泡过程
        for (int i = 0; i < arr1.length-1; i++) {//将数组中的所有元素都通过遍历拿出来（进行多少次冒泡过程）
            boolean sorted = true;//每次冒泡之前，都假设本次无需区间有序了
            //遍历无序区间，做一次冒泡过程
            for (int j = 0; j < arr1.length-i-1; j++) {//开始进行数组中所有元素比较的循环操作
                /**
                 * 将相邻两个元素进行比较，如果当前的元素比后面元素大的情况下，
                 * 这两个元素进行位置交换
                 */
                if (arr1[j] > arr1[j+1]){//当前元素大于后面元素
                    //1.将小的元素（和当前元素相邻的元素）放到tmp这个空的容器中
                    int tmp = arr1[j+1];
                    //2.将原来大的元素（当前的元素）放入原来放小元素的位置
                    arr1[j+1] = arr1[j];
                    //3.将小的元素放入到原来大的元素的位置，至此完成位置的交换
                    arr1[j] = tmp;
                    sorted =false;//只要有过交换，无序区间有序的假设就不成立

                }
            }
            if (sorted){//每次冒泡之后，假设成立，整个数组有序
                break;
            }
        }
        for (int i:arr1) {
            System.out.print(i+ " ");
        }
    }
}
