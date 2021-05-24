package com.company;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Pdf {

    private int idPdf;
    private String nomPdf;
    private Document document = new Document();

    public Pdf(int unId, String unNom) throws FileNotFoundException, DocumentException {
        this.idPdf = unId;
        this.nomPdf = unNom;

        try{
            FileOutputStream output = new FileOutputStream(unId + "_" + unNom + ".pdf");
            PdfWriter pdf = PdfWriter.getInstance(document, output);
            ecrire_texte();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ecrire_texte(){
        document.open();
        Paragraph informations = new Paragraph("test");
        document.close();
    }

    public void charger_image(){

    }

    public void verif_bat(Bateau unBateau){

    }

}
