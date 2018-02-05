
package wsdl;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-29T17:24:29.367+08:00
 * Generated source version: 3.2.1
 * 
 */
public final class IMsgThreeElements_IMsgThreeElementsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.finance.hbmcc.huawei.com/", "IMsgThreeElements");

    private IMsgThreeElements_IMsgThreeElementsPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = IMsgThreeElements_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IMsgThreeElements_Service ss = new IMsgThreeElements_Service(wsdlURL, SERVICE_NAME);
        IMsgThreeElements port = ss.getIMsgThreeElementsPort();  
        
        {
        System.out.println("Invoking validatePhoneNoIdCardCustNameSame...");
        String _validatePhoneNoIdCardCustNameSame_userNo = "";
        String _validatePhoneNoIdCardCustNameSame_userPwd = "";
        String _validatePhoneNoIdCardCustNameSame_phoneNo = "";
        String _validatePhoneNoIdCardCustNameSame_custName = "";
        String _validatePhoneNoIdCardCustNameSame_idCard = "";
        String _validatePhoneNoIdCardCustNameSame__return = port.validatePhoneNoIdCardCustNameSame(_validatePhoneNoIdCardCustNameSame_userNo, _validatePhoneNoIdCardCustNameSame_userPwd, _validatePhoneNoIdCardCustNameSame_phoneNo, _validatePhoneNoIdCardCustNameSame_custName, _validatePhoneNoIdCardCustNameSame_idCard);
        System.out.println("validatePhoneNoIdCardCustNameSame.result=" + _validatePhoneNoIdCardCustNameSame__return);


        }
        {
        System.out.println("Invoking validatePhoneNoAndIdCardSame...");
        String _validatePhoneNoAndIdCardSame_userNo = "";
        String _validatePhoneNoAndIdCardSame_userPwd = "";
        String _validatePhoneNoAndIdCardSame_phoneNo = "";
        String _validatePhoneNoAndIdCardSame_idCard = "";
        String _validatePhoneNoAndIdCardSame__return = port.validatePhoneNoAndIdCardSame(_validatePhoneNoAndIdCardSame_userNo, _validatePhoneNoAndIdCardSame_userPwd, _validatePhoneNoAndIdCardSame_phoneNo, _validatePhoneNoAndIdCardSame_idCard);
        System.out.println("validatePhoneNoAndIdCardSame.result=" + _validatePhoneNoAndIdCardSame__return);


        }
        {
        System.out.println("Invoking validatePhoneNoAndCustNameSame...");
        String _validatePhoneNoAndCustNameSame_userNo = "";
        String _validatePhoneNoAndCustNameSame_userPwd = "";
        String _validatePhoneNoAndCustNameSame_phoneNo = "";
        String _validatePhoneNoAndCustNameSame_custName = "";
        String _validatePhoneNoAndCustNameSame__return = port.validatePhoneNoAndCustNameSame(_validatePhoneNoAndCustNameSame_userNo, _validatePhoneNoAndCustNameSame_userPwd, _validatePhoneNoAndCustNameSame_phoneNo, _validatePhoneNoAndCustNameSame_custName);
        System.out.println("validatePhoneNoAndCustNameSame.result=" + _validatePhoneNoAndCustNameSame__return);


        }

        System.exit(0);
    }

}
