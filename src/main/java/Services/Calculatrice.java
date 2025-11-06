package Services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(endpointInterface = "Services.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @WebMethod
    public int somme(@WebParam int a, @WebParam int b){
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }


}
