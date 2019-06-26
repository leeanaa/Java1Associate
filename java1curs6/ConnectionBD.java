public class ConnectionBD {
    private static ConnectionBD myInstance=null;
    private static ConnectionBD myInstance2=new ConnectionBD();
    private ConnectionBD(){
    }
    public static ConnectionBD getMyInstance(){
        if (myInstance==null){
            myInstance = new ConnectionBD();
        }
        return myInstance;
    }
    public static ConnectionBD getMyInstance2(){
        
        return myInstance2;
    }
    //nu avem voie sa am ambele implementari
}