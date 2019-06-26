public class Exemplul1{
    public static void main (String [] args){
        Carte carte1 = new Carte("Ion", "Liviu Rebreanu");
        Nuvela nuvela1 = new Nuvela("Moara cu noroc","Ioan Slavici",60);
        Carte nuvela2 = new Nuvela("Alexandru Lapusneanu","Costache Negruzzi",50);
        
        System.out.println(nuvela2.getTitlu());
        System.out.println(nuvela2.getAutor());
        System.out.println(((Nuvela)nuvela2).getNrPagini());
        //nu am acces la toate comportamentele dar fac cast
        //polimorfism: referinta - obiect (pot sa pun referinta de tip parinte)
        
        //System.out.println(((Nuvela)carte1).getTitlu());
        
        //if(nuvela2 instanceof Nuvela){
            //System.out.println(((Nuvela)carte1).getNrPagini());
        //}
        Carte[] carti = new Carte[3];
        carti[0]=carte1;
        carti[1]=nuvela1;
        carti[2]=nuvela2;
        
        
        for (Carte c : carti){
            System.out.println(c.getTitlu()+" "+c.getAutor());
            if (c instanceof Nuvela){
                System.out.println(((Nuvela)c).getTitlu()+" "+((Nuvela)c).getAutor()+" "+((Nuvela)c).getNrPagini());
            }
            
        }
    }
}