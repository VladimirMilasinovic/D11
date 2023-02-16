package Nov;

public class domaci1 {
    public static void main(String[] args) {
        int [] niz = new int[10];
        niz [0] = 11;          // niz[0] = 13;  niz[0] = 11 +2
        niz [1] = 2;
        niz [2] = 31;
        niz [3] = 4;
        niz [4] = 5;
        niz [5] = 6;
        niz [6] = 7;
        niz [7] = 8;
        niz [8] = 9;
        niz [9] = 10;

        System.out.println("Niz nakon povecanja neparnih brojeva izgleda ovako: ");

        for (int i = 0; i<niz.length;i++){
            if (niz[i] % 2 != 0){
                niz[i] = niz[i] + 2;
            }
            System.out.println(niz[i]);
        }
    }

    }

