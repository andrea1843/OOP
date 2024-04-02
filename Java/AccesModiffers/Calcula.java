package calcula;

public class Calcula {
    int p;
    int q;
    float r;
    double s;
    public Calcula (int x, int y){
        p=x;
        q=y;
        r=0;
  }
    public float suma (int x, int y){
    p=x;
    q=y;
    r=p+q;
     return r; 
    }
    public float resta (int x, int y){
    p=x;
    q=y;
    r=p-q;
     return r; 
    }
    public float multiplicacion (int x, int y){
    p=x;
    q=y;
    r=p*q;
     return r; 
    }
    public float division (int x, int y){
    p=x;
    q=y;
    r=(float)p/(float)q;
     return r; 
    }
    public double potencia (int x, int y){
    p=x;
    q=y;
    s=  Math.pow (p,q);
        return s;
      }
    
    public  void imprimirresultado(){
        System.out.println("Resultados = "+ r);
    }
    
    public static void main(String[] args) {
  Calcula operario = new Calcula (0,0);
  float result = operario.suma (25,25);
  //System.out.println("El resultado de la suma es: " + result);
  operario.imprimirresultado();                           
  
  result = operario.resta(100,50);
  //System.out.println("El resultado de la resta es: " + result);
  operario.imprimirresultado();
  
  result = operario.multiplicacion(5,10);
  //System.out.println("El resultado la multiplicación es: " + result);
  operario.imprimirresultado();
  
  result = operario.division(100,2);
  //System.out.println("El resultado de la división es: " + result);
  operario.imprimirresultado();
  
  double resultado = operario.potencia (25,3);
  //System.out.println("El resultado de la potenciación es: " + resultado);
  operario.imprimirresultado();
    }
    
}
