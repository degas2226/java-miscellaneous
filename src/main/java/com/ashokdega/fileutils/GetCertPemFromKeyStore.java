
package com.ashokdega.fileutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/**
 * @author degas2226@gmail.com
 *
 */
public class GetCertPemFromKeyStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, IOException {
		KeyStore keyStoreObj = KeyStore.getInstance("JKS");
		keyStoreObj.load(new FileInputStream(new File("C:\\decode\\truststore.jks")),
				"JOQhcAgF7qpApITs".toCharArray());
		// System.out.println(keyStoreObj.aliases().nextElement());
		System.out.println(new String(keyStoreObj.getCertificate(keyStoreObj.aliases().nextElement()).getEncoded()));
		// PEMWriter out=new
	}

}
