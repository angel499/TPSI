import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import model.Magazzino;
import model.ObjectFactory;
import model.TipoProdotto;

public class Main {

	public static void main(String[] args) throws JAXBException, IOException {
		
		Magazzino mag = new Magazzino();
		
		ObjectFactory obj = new ObjectFactory();
		JAXBContext context= JAXBContext.newInstance(mag.getClass());
		

			
			
			for(int i=0;i<2;i++) {
				TipoProdotto pro1= obj.createTipoProdotto();
				pro1.setCategoria(i+"");
				pro1.setModello(i+"");
				pro1.setMarca(i+"");
				pro1.setCodice(i+"");
				pro1.setPrezzo(i);
				pro1.setQuantita(new BigInteger(i+""));
				mag.getProdotto().add(pro1);
			}
			// setta i valori cosi
			//ciao
		
		Marshaller mar= context.createMarshaller();
		mar.marshal(mag, new FileWriter("MAGAZZINO_02_02_PAG189_190.xml"));
		
		Unmarshaller unmar=context.createUnmarshaller();
		
		mag=(Magazzino) unmar.unmarshal(new FileReader("MAGAZZINO_02_02_PAG189_190.xml"));
		
		for (TipoProdotto tp : mag.getProdotto()) {
			System.out.println(tp.toString());
		}
		
	}
	
	
}
