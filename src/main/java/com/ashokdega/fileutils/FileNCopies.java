package com.ashokdega.fileutils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author degas2226@gmail.com
 */
public class FileNCopies {

	public static void main(String[] args) throws IOException {
		String src = args[0];
		String dest = args[1];
		Integer count = Integer.parseInt(args[2]);
		File srcF = new File(src);
		File destF = null;
		for (int i = 0; i < count; i++) {
			destF = new File(dest + srcF.getName() + i);
			Files.copy(srcF.toPath(), new FileOutputStream(destF));
		}
	}

}
