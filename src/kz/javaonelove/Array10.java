package kz.javaonelove;

public class Array10
{
    public static void main(String[] args) {
        int [] a= new int[]{ 3, 4, 5, 6, 7,16, 8, 44,9,5};
        int min=a[0],max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
