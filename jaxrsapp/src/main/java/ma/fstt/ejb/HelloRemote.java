package ma.fstt.ejb;


import jakarta.ejb.Remote;

@Remote
public interface HelloRemote {


    public String sayHello(String name);
}
