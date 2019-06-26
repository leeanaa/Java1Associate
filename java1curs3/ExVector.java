public class ExVector{
    public static void main (String [] args){
        int a[] = new int[4];
        a[3]=6;
        a[0]=1;
        a[2]=3;
        a[1]=7;
        System.out.println(" "+ a[0]+a[1]+a[2]+a[3]);
        for(int i=0;i<4;i++){
            System.out.println(i);
        }
        
        for(int i:a){
             System.out.println(i);
        }
        int b[] = new int[]{1,2,3,4,5};
        int c[] = {6,7,8,9,10};
        
        int d[][]=new int[3][];
        //d[0][2]=2;
        for(int[] i:d){
            for(int j :i);
             System.out.println(i);
        }
        
        d[0]=new int[3];
        d[1]=new int[2];
        d[2]=new int[5];
    }
}