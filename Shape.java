public  abstract class Shape {
        double length,breadth;
        float base,height;
   public Shape(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
       
   }
   public Shape(float base,float height){
        this.base = base;
        this.height = height;

   }
   
    
        public abstract double disparea();
    
    
}


