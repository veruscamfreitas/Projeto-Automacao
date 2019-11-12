package util;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFManager {

	private PDFParser parser;
	private PDFTextStripper pdfStripper;
	private PDDocument pdDoc;
	private COSDocument cosDoc;

	private String Text;
	private String filePath;
	private File file;

	public PDFManager() {

	}

	public String toText() throws IOException {
		this.pdfStripper = null;
		this.pdDoc = null;
		this.cosDoc = null;

		file = new File(filePath);
		parser = new PDFParser(new RandomAccessFile(file, "r")); // update for PDFBox V 2.0

		parser.parse();
		cosDoc = parser.getDocument();
		pdfStripper = new PDFTextStripper();
		pdDoc = new PDDocument(cosDoc);
		pdDoc.getNumberOfPages();
		pdfStripper.setStartPage(0);
		pdfStripper.setEndPage(pdDoc.getNumberOfPages());
		Text = pdfStripper.getText(pdDoc);

		return Text;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public PDDocument getPdDoc() {
		return pdDoc;
	}

	public void closeAllPdf() throws IOException {
		pdDoc.close();
		cosDoc.close();
	}

	public String returnFileName() throws InterruptedException {

		File aux = new File(SetUp.getPathPdfFolder());
		File[] lista = aux.listFiles();
		String titulo = "";

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j].lastModified() < lista[j + 1].lastModified()) {
					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
				}
			}
		}

		if (lista.length > 0) {
			titulo = lista[0].getName();
		}
		return titulo;
	}

	public void deleteAllFiles() throws IOException {
		File file;
		File[] listFile;

		try {
			file = new File(SetUp.getDiretorioPdf());
			listFile = file.listFiles();
			for (File f : listFile) {
				f.delete();
			}

		} catch (Exception zd) {
			System.out.println("Erro ao deletar arquivos. \n" + zd.getMessage());
		}
	}
}