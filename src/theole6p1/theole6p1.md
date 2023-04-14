# 第一题输出
*ABCDEFG
<br>ABCDEFGEF*
<br>分析：代码
```java
FileOutputStream out=new FileOutputStream("hello.txt");
FileInputStream in=new FileInputStream("hello.txt");
```
先打开了文件 __hello.txt__ 的输入输出流，该文件位于本地。随后
```java
byte content[]="ABCDEFG".getBytes();
out.write(content);
out.close();
```
将字符串 "ABCDEFG" 写入了文件 hello.txt 并关闭输出流 out。之后，代码
```java
while((m=in.read(tom,0,3))!=-1){
    String s1=new String(tom,0,m);
    bufferOne.append(s1);
    String s2=new String(tom,0,3);
    bufferTwo.append(s2);
}
```
执行了一个循环。
<br>对于每次循环，程序会首先尝试从 hello.txt 中读取 3 个字节，并存储于 tom 中，如果已经抵达文件末尾，则循环终止。
<br>其后，程序创建了两个 String 对象，将本次循环所读取到的字节存储于 s1，并追加至 StringBuffer 对象 bufferOne。
<br>对于 s2 对象，将本循环中字节数组 tom 的所有内容全部存储，并追加到 bufferTwo 里面。
<br>大部分时间，两者并无差异，因为 m = in.read(tom, 0, 3) 会在完整读取了 3 个字节时，使 m 的值为 3，不过在读取接近结尾之时，两者可能出现差异。
<br>当结尾可供读取字节数少于参数 len 时，则返回的值为实际读取字节数，这意味着 m 将不再为 3，此时 s1 与 s2 的内容就会出现差异。
<br>本次程序中，会在读取到 G 时出现差异，在上一轮循环，所读取到的内容为 DEF，而在本轮循环，只读取到了 G，并且只覆盖了 DEF 开头的 D，则本轮循环读取结束后，字节数组存储的内容为 GEF。
<br>因此，附加到 bufferOne 的内容为 G，而附加到 bufferTwo 的内容为 GEF。在最终输出时，bufferOne 与 bufferTwo 的差异在于结尾的 EF。
<br>不过，倘若写入的 content 的长度恰好为 3 的倍数（但是不包括 0），则最终输出应当并无差异。