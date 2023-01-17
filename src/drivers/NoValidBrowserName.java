package drivers;

public class NoValidBrowserName extends Exception{ //rozszerzaie klasy o Klase wyjatków checked
    public NoValidBrowserName(String message){
        super(message);
    }
//}

//public class NoValidBrowserName extends RuntimeException{ //rozszerzaie klasy o Klase wyjatków checked
//    public NoValidBrowserName(String message){
//        super(message);
//    }
}