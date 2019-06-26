public class Exemplul2{
    public static void main (String [] args){
        FiguraGeometrica[] figuri= new FiguraGeometrica[5];
        figuri[0]=new Punct(1,2);
        figuri[1]=new Punct(2,4);
        figuri[2]=new Dreptunghi(2,6);
        figuri[3]=new Patrat(4);
        figuri[4]=new Patrat(5);
        int suma=0;
        /*for(FiguraGeometrica f : figuri){
            if (f instanceof Punct){
                suma+=((Punct)f).calculeazaPerimetruPunct();
            }
            if (f instanceof Dreptunghi){
                suma+=((Dreptunghi)f).calculeazaPerimetruDreptunghi();
            }
            if (f instanceof Patrat){
                suma+=((Patrat)f).calculeazaPerimetruPatrat();
            }
        }*/
        for(FiguraGeometrica f : figuri){
            suma+=f.calculeazaPerimetru();
        }
        System.out.println(suma);
    }
}