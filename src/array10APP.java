import javax.swing.JOptionPane;
public class array10APP {
 
    public static void main(String[] args) {

    	//Indicamos el tama�o del array
        final int posiciones=10;
 
        int num[]=new int[posiciones];
 
        //Funciones
        rellenarArray(num);
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un n�mero");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}