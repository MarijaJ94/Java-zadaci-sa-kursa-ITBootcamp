public class Trougao {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    private double obim;
    private double poluobim;
    private double povrsina;








    public double getStranicaA(){
            return stranicaA;
        }
        public void setStranicaA(double stranicaA1){
            stranicaA=stranicaA1;
        }

        public double getStranicaB(){
            return stranicaB;
        }
        public void setStranicaB(double stranicaB1){
            stranicaB=stranicaB1;
        }

        public double getStranicaC(){
            return stranicaC;
        }
        public void setStranicaC(double stranicaC1){
            stranicaC=stranicaC1;
        }

    Trougao (double stranicaA1,double stranicaB1,double stranicaC1){
        stranicaA=stranicaA1;
        stranicaB=stranicaB1;
        stranicaC=stranicaC1;
        obim=obim();
        povrsina=povrsina();
        poluobim=poluobim();

     }
     Trougao (double povrsina){
        stranicaA=povrsina/3;
     }

    public double obim(){
        double obim=stranicaA+stranicaB+stranicaC;
        return obim;
    }
    //poluobim
    public double poluobim(){
        double poluobim=obim()/2;
        return poluobim;

    }
   public double povrsina(){
        double povrsina=Math.sqrt(poluobim*(poluobim-stranicaA)*(poluobim-stranicaB)*(poluobim-stranicaC));
        return povrsina;
    }

}
