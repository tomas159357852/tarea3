public class ejercicios {
    public void ImprimirMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }
    } 

    public void transformada05(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }

    public void transformada06(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j]=""+valInit;    
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }
    public void transformada14(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }
    public void transformada16(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[(dimen-1)-i][j]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }
    public void transformada17(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }


    public void transformada18(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[j][(dimen-1)-i]=""+valInit;    
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }

    public void transformada10(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i-j]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }
    public void transformada07(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[(dimen-1)-i][j]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }








    public void transformada26(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= dimen-1; i++) {
                matriz[j][(dimen-1)-i]=""+valInit;
                valInit++;
            }
        }
        ImprimirMatrizCadena(matriz);
    }



    public static void main(String[] args) {
        ejercicios tObj=new ejercicios();
        //tObj.transformada(5, 0);
        System.out.println("");
        tObj.transformada05(5, 0);
        tObj.transformada06(5, 0);
        tObj.transformada07(5, 0);

}
}