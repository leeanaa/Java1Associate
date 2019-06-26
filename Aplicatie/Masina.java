public class Masina extends Vehicul {
    int capacitate;
    public Masina (String marca, String culoare, int capacitate){
        super(marca,culoare);
        this.capacitate=capacitate;
    }
    @Override
    public String toString(){
        return "marca "+this.marca+" culoare "+this.culoare+" capacitate "+this.capacitate;
    }
}