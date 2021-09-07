package Assignment_one;

public class Eleven {
    public static void main(String[] args) {
        int numofrows=12;
        int numofcols;
        int count=0;
        int increase=numofrows/2;
        for (int i=0;i<numofrows;i++){

            if (i<6){
                numofcols=increase;
            }else {
                count+=1;
                numofcols =i+count;
            }

            char sequence='A';
            for (int j=numofcols;j>i;j--){
            System.out.print(sequence+" ");
            sequence++;

            }
            System.out.println();
        }
    }

}
