/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author trogliano
 */
@Stateless
@LocalBean
public class ConverterBean implements ConverterInterface {

    @Override
    public double euroToOtherCurrency(double amount, String currencyCode) {
        double res;
        switch (currencyCode){
            case "yen":
                res=amount * 0.0077;
            case "dollar":  
                res=amount * 1.16;
            default:
                res=amount;
        }
        return res;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
