public class MovingAverage{
    public static void main(String[] args){
        int data[] = {1,2,5,45,76,45,34,9,27};

        double mittelwert[] = new double[9];
        for (int i = 0; i < data.length; i++ ){
            int fenstergroesse = 3;
            int fensteranfang = 0;
            int fensterende = 0;
            int anzahl = 0;
            int summe = 0;
            if (0 > (i - fenstergroesse + 1)){
                 fensteranfang = 0;
            } else {fensteranfang = i - fenstergroesse + 1;}
            if (data.length-1 < (i + fenstergroesse - 1) ){
                fensterende = data.length-1;
            } else {fensterende = i + fenstergroesse - 1 ;}
            for (int j = fensteranfang; j <= fensterende; j++){
                anzahl += 1;
                summe = summe + data[j];
            }
            mittelwert[i] = (double)summe/anzahl;
            System.out.println(data[i]);
            System.out.println(mittelwert[i]);
        }


    }
}
