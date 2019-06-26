public enum Season {
    PRIMAVARA(13), VARA(35), TOAMNA(20), IARNA(-5);
    
    int valMin; 
    private Season(int valMin){
        System.out.println("S-a apelat constructorul cu valoarea"+ valMin);
        this.valMin=valMin;
    }
    
    public void setValMin(int valMin){
        this.valMin=valMin;
    }
    
    public int getValMin(){
        return this.valMin;
    }
}