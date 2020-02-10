
package com.ashokdega.fileutils;

import java.io.*;
import java.util.Base64;

/**
 * @author degas2226@gmail.com
 *
 */
public class Base64Decode {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("C:/stores");
		f.mkdirs();
		byte[] data = Base64.getDecoder().decode(
				"/u3+7QAAAAIAAAABAAAAAgAMdHJ1c3QtY2VydC0wAAABa43slFIABVguNTA5AAACDjCCAgowggFzoAMCAQICCDw8l9/CWTAJMA0GCSqGSIb3DQEBCwUAMBUxEzARBgNVBAMMCkhvc3BpdGFsQ0EwHhcNMTkwNjIwMTExMzI1WhcNMzkwNjE1MTExMzI1WjAVMRMwEQYDVQQDDApIb3NwaXRhbENBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCv4qajhw3EwvvWRq4UBQuD2djfT1hj+tYoDle5k+qTQhH3OzFvdKllxVuZo9qmEgxUPxLvT2NyLy8r07vgO1cAbQm6edYN/bPiLJNm4mIw15O7Kvj7w8x3YPRR2Cq736YR9Evms+3YxKizrt/YNWhHA1k6GGdJ5BE1t/kjg3OXjQIDAQABo2MwYTAdBgNVHQ4EFgQU+3lWVz3nLSaSlR4VAc2HKNXityYwDwYDVR0TAQH/BAUwAwEB/zAfBgNVHSMEGDAWgBT7eVZXPectJpKVHhUBzYco1eK3JjAOBgNVHQ8BAf8EBAMCAYYwDQYJKoZIhvcNAQELBQADgYEAO0qGUo/oxnBDAOdWKeu4kN/Tb/ABJfgUpcg8jojz76agPHc3Bngb4EUeMx+cV1skiajR7uJ5bxT9QHMaghAURPV9kfKEO0QWR5ld2x23HXA3HjMnGd5RC74YN9/UDN2Iy0zfLmokzZEuAgP9S/LvGIrzHQmAkcalJc6wV7/+t/05o2Ss5ofbgXHmsZJAhfai0nF4CA==");
		try (OutputStream stream = new FileOutputStream("C:/stores/truststore.jks")) {
			stream.write(data);
		}
	}
}
