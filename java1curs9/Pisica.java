

public class Pisica implements Comparable
{
  int greutate;
  
  public Pisica(int greutate) {
    this.greutate=greutate;
    }
  @Override
  public String toString(){
    return greutate+ "";
    }
    
    @Override
    public int compareTo(Object o) {
        return this.greutate - ((Pisica) o).greutate;
    }
    
    
    
}
