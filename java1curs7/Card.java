public class Card{
    public int amount;
    
    public Card(int amount){
        this.amount=amount;
    }
    public void retragereNumerar(int suma)throws FonduriInsuficienteException,PinIncorrectException{
        if(suma>amount){
            throw new FonduriInsuficienteException();
        }
        this.amount-=suma;
    }
    //public void pinIncorrect() throws PinIncorrectException(){
        
    //}
    //->daca fac o clasa care mosteneste Card nu pot sa propag ceva mai larg adica Exception
    //trebuie sa propagi ceva mai specific
}