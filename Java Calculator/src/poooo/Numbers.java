package poooo;

public class Numbers {
    private double x;
    
    private double getX(){
        return x;
    }
                

        
    private  void setX(double x ){
            this.x = x;
        }       

    public double add(double x, double y){
           setX(x + y);
            return getX();
        }
    
    public double sub(double x, double y){
            setX(x - y);
             return getX();
         }
    
    public double multiplication(double x, double y){
            setX(x * y);
             return getX();
         
            }
    public double div(double x, double y){
            setX(x / y);
             return getX();
         }
}
