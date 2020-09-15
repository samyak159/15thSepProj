package com.lti.pdfdemo;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App {

	public static void main(String[] args) throws Exception
	{
		Document document = new Document();
	    PdfWriter.getInstance(document, new FileOutputStream("d:/hello.pdf"));
	    document.open();
	    document.add(new Paragraph("Hello World!"));
	    document.close();

	}

}
