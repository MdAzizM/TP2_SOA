package Services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ICalculatrice {
    @WebMethod
    public int somme(@WebParam int a,@WebParam int b);
    @WebMethod
    public int soustraction(@WebParam int a,@WebParam int b);
    @WebMethod
    public int multiplication(@WebParam int a,@WebParam int b);
    @WebMethod
    public int division(@WebParam int a,@WebParam int b);

}
