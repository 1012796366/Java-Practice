/* 7．编写一个Java应用程序，定义数组a并赋值，输出a的全部元素。然后定义数组b，并将数组a的全部或部分元素复制到数组b中，然后通过数组b修改数组元素的值，再输出数组a的全部元素，比较两次输出的结果。

 * 提示：数组复制可以使用System类的arraycopy方法，该方法的原型为：public static void arraycopy(Object source , int srcIndex , Object dest , int destIndex , int length )，参数中，source表示源数组，srcIndex表示源数组中开始复制的元素的位置，dest表示目标数组，destIndex表示复制到目标数组时从哪个位置赋值，length表示复制的元素个数。该方法的使用语句是：

 * System.arraycopy(a,3,b,0,4 )//实参只是一个示例，可以根据要求自己修改
 */
public class theole1p7 {
    public static void main(String[] args){
        int[] a = new int[10];
        int[] b = new int[3];

        for (int i = 0; i < 10; ++i) {
            a[i] = i * i;
            System.out.printf("a[%d]: %d\n", i, a[i]);
        }

        System.arraycopy(a, 3, b, 0, 3);
        b[1] = 842;
        System.out.println("arraycopy 后的内容");
        for (int i = 0; i < 10; ++i) {
            System.out.printf("a[%d]: %d\n", i, a[i]);
        }

    }
}
