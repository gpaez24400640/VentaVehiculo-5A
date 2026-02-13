
public class Cliente {
private String rs;
private String rfc;
private String email;

public Cliente(String rs, String rfc, String email){
this.rs=rs;
this.rfc=rfc;
this.email=email;
}
@Override
    public String toString(){
      return "Marca = "+this.rs+"\n"+
              "Precio= "+this.rfc+"\n"+
              "Motor= "+this.email+"\n";
    }
}
