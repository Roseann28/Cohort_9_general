package DataStructures;

public class Loops {
    public static void main (String[]args){
        long dif1=oneThousand();
        long dif2=oneMillion();
        long dif3=tenMillion();
        double ratio1=(double)dif1/dif2*100;
        double ratio2=(double)dif2/dif3*100;
        double ratio3=(double)dif1/dif3*100;
        System.out.println(ratio1);
        System.out.println(ratio2);
        System.out.println(ratio3);


    }

    private static long tenMillion() {

        long starttimetenmil=System.nanoTime();
        for (int i=0;i<10000000;i++){
            if (i%1000000==0){
                System.out.println(i);
            }


        }
        long endtimetenmil=System.nanoTime();
        System.out.println("Time for ten million "+(endtimetenmil-starttimetenmil));
        long difference=endtimetenmil-starttimetenmil;
        return difference;
    }

    private static long oneMillion() {

        long starttimemil=System.nanoTime();
        for (int i=0;i<1000000;i++){
            if (i%100000==0){
                System.out.println(i);
            }
        }
        long endtimemil=System.nanoTime();
        System.out.println("Time for one million "+(endtimemil-starttimemil));
        long difference=endtimemil-starttimemil;
        return (difference);
    }

    private static long oneThousand() {
        long starttime=System.nanoTime();
        for (int i=0;i<1000;i++){
            if (i%100==0){
                System.out.println(i);
            }
        }
        long endtime=System.nanoTime();
        System.out.println("Time for one thousand "+(endtime-starttime));
        long difference=endtime-starttime;
        return (difference);
    }
}
